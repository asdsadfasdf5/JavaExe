package ch19.sec07;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import org.json.JSONObject;

public class ChatServer {
	/*
	 * ChatServer는 채팅 서버 실행 클래스로 클라이언트의 연결 요청을 수락하고
	 *  통신용 socketClient를 생성하는 역할을 한다.
	 * 먼저 ChatServer 클래스의 선언부와 필드를 다음과 같이 작성
	 */
	// 필드
	ServerSocket serverSocket;
	ExecutorService threadPool = Executors.newFixedThreadPool(100);
	Map<String, SocketClient> chatRoom = Collections.synchronizedMap(new HashMap<>());

	/*
	 * 3개의 필드가 있는데 serverSocket은 클라이언트의 연결 요청을 수락하고,
	 *  threadPool은 100개의 클라이언트가 동시에
	 * 채팅할 수 있도록 한다. chatRoom은 통신용 SocketClient를 관리하는 동기화된 Map 컬렉션이다.
	 */

//메소드 : 서버 시작
	public void start() throws IOException {
		serverSocket = new ServerSocket(50001);
		System.out.println("[서버] 시작됨");
		Thread thread = new Thread(() -> {
			try {
				while (true) {
					Socket socket = serverSocket.accept();
					SocketClient sc = new SocketClient(this, socket);
				}
			} catch (IOException e) {

			}
		});
		thread.start();
	}

	/*
	 * start() 메소드는 채팅 서버가 시작할 때 제일 먼저 호출되는 것으로,
	 *  50001번 Port에 바인딩하는 ServerSocket을
	 * 생성하고 작업 스레드가 처리할 Runnable을 람다식 ()->{}으로 제공한다. 
	 * 람다식은 accept() 메소드로 연결 수락하고, 통신용
	 * SocketClinet를 반복해서 생성한다.
	 */

//메소드 : 클라이언트 연결 시 SocketClient 생성 및 추가
	public void addSocketClient(SocketClient socketClient) {
		String key = socketClient.chatName + "@" + socketClient.clientIp;
		chatRoom.put(key, socketClient);
		System.out.println("입장 : " + key);
		System.out.println("현재 채팅자 수 : " + chatRoom.size() + "\n");
	}
	
//메소드 : 클라이언트 연결 종료 시 SocketClient 제거
	public void removeSocketClient(SocketClient socketClient) {
		String key = socketClient.chatName + "@" + socketClient.clientIp;
		chatRoom.remove(key);
		System.out.println("나감 : " + key);
		System.out.println("현재 채팅자 수 : " + chatRoom.size() + "\n");
		
/*
 * addSocketClient() 메소드는 연결된 클라이언트의 SocketClient를 chatRoom(채팅방)에
 * 추가하는 역할을 한다. 키는 "chatName@clientIp"로 하고 SocketClient를 값으로 해서 저장한다.
 * removeSocketClient() 메소드는 연결이 끊긴 클라이언트의 SocketClient를 chatRoom(채팅방)
 * 에서 제거하는 역할을 한다.
 */
	}
	
//메소드 : 모든 클라이언트에게 메시지 보냄
	public void sendToAll(SocketClient sender, String message) {
		JSONObject root = new JSONObject();
		root.put("clientIp", sender.clientIp);
		root.put("chatName", sender.chatName);
		root.put("message", message);
		String json = root.toString();
		
		Collection<SocketClient> socketClients = chatRoom.values();
		for(SocketClient sc : socketClients) {
			if(sc == sender) continue;
			sc.send(json);
		}
/* sendToAll() 메소드는 JSON 메시지를 생성해 채팅방에 모든 클라이언트에게 보내는 역할을 한다.
 *  JSON 메시지는 다음과 같은 구조로 되어 있다.
 *  {
 *  	"clientIp" : "xxx.xxx.xxx.xxx",
 *  	"chatName" : "winter",
 *  	"message"  : "날씨가 춥다"
 *  }
 * 	chatRoom.value()로 Collection<SocketClient>를 얻은 후 모든 SocketClient로
 * 하여금 send()메소드로 JSON 메시지를 보내게 하였다. 단, 메시지를 보낸 SocketClient는 제외한다.
 */
	}
//메소드 : 서버 종료
	public void stop() {
		try {
			serverSocket.close();
			threadPool.shutdown();
			chatRoom.values().stream().forEach(sc->sc.close());
			System.out.println("[서버] 종료됨");
		}catch(IOException e) {
			
		}
/*
 * stop() 메소드는 채팅 서버를 종료시키는 역할을 한다. 
 * serverSocket과 threadPool을 닫고 chatRoom에 있는 모든 SocketClient를 닫는다.
 * 그리고 chatRoom.value()로 Collection<SocketClient>를 얻고, 요소 스트림을 이용해서
 * 전체 SocketClient의 close()메소드를 호출한다.
 */
	}
	
//메소드 : 메인
	public static void main(String[] args) {
		try {
			ChatServer chatServer = new ChatServer();
			chatServer.start();
			
			System.out.println("==============");
			System.out.println("서버를 종료하려면 q를 입력하고 Enter");
			System.out.println("==============");
			
			Scanner scanner = new Scanner(System.in);
			while(true) {
				String key = scanner.nextLine();
				if(key.equals("q")) break;
			}
			scanner.close();
			chatServer.stop();
		} catch (IOException e) {
			System.out.println("[서버] "+e.getMessage());
		}
	}
/*
 * main() 메소드는 채팅 서버를 시작하기 위해 chatServer 객체를 생성하고 start() 메소드를 호출한다.
 * 키보드로 q를 입력하면 stop() 메소드를 호출해서 채팅 서버를 종료한다.
 */
}
