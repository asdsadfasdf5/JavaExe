package ch19.sec07;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

import org.json.JSONObject;

public class ChatClient {
	//필드
	Socket socket;
	DataInputStream dis;
	DataOutputStream dos;
	String chatName;

//메소드 : 서버 연결
	public void connect() throws IOException{
		socket =  new Socket("localhost",50001);
		dis = new DataInputStream(socket.getInputStream());
		dos = new DataOutputStream(socket.getOutputStream());
		System.out.println("[클라이언트] 서버에 연결됨");
/*
 * connect() 메소드는 채팅 서버(localhost,50001)에 연결 요청을 하고 Socket을 필드에 저장한다.
 * 그리고 문자열 입출력을 위해 DataInputStream과 DataOutputStream을 생성해서 필드에 저장한다.
 * 만약 다른 PC에 있는 채팅 서버와 연결을 하고 싶다면 localhost대신 IP주소로 변경하면 된다.
 */
	}
//메소드 : JSON 받기
	public void receive() {
		Thread thread = new Thread(()-> {
			try {
				while(true) {
					String json = dis.readUTF();
					JSONObject root = new JSONObject(json);
					String clientIp = root.getString("clientIp");
					String chatName = root.getString("chatName");
					String message = root.getString("message");
					System.out.println("<"+chatName+"@"+clientIp+"> "+message);
				}
			}catch(Exception e1) {
				e1.getMessage();
				e1.printStackTrace();
				System.out.println("[클라이언트] 서버 연결 끊김");
				System.exit(0);
			}
		});
		thread.start();
/*
 * receive() 메소드는 서버가 보낸 JSON 메시지를 읽는 역할을 한다. dis.readUTF()로 JSON을 읽고
 * JSONObject로 파싱해서 clientIp, chatName, message를 얻어낸다. 그리고 console 뷰에
 * "<chatName@clientIp> message"로 출력한다.
 * 서버와 통신이 끊어지면 dis.reaUTF()에서 IOException이 발생하기 때문에,
 * 예외 처리를 해서 클라이언트도 종료되도록한다.		
 */
	}
//메소드 : JSON 보내기
	public void send(String json) throws IOException {
		dos.writeUTF(json);
		dos.flush();
/*
 * send() 메소드는 서버로 JSON 메시지를 보내는 역할을 한다. 
 * main()메소드에서 키보드로 입력한 메시지를 보낼 때 호출된다.
 */
	}
//메소드 : 서버 연결 종료
	public void unconnect() throws IOException{
		socket.close();
/*
 * unconnect() 메소드는 Socket의 close() 메소드를 호출해서 서버와 연결을 끊는다.
 * main() 메소드에서 q가 입력되었을 때 채팅을 종료하기 위해 호출된다.
 */
	}
//메소드 : 메인
	public static void main(String[] args) {
		try {
			ChatClient chatClient = new ChatClient();
			chatClient.connect();
			
			Scanner scanner = new Scanner(System.in);
			System.out.println("대화명 입력: ");
			chatClient.chatName = scanner.nextLine();
			JSONObject jsonObject = new JSONObject();
			jsonObject.put("command", "incoming");
			jsonObject.put("data", chatClient.chatName);
			String json = jsonObject.toString();
			chatClient.send(json);
			
			chatClient.receive();
			
			System.out.println("---------------------------------");
			System.out.println("보낼 메시지를 입력하고 Enter");
			System.out.println("채팅을 종료하려면 q를 입력하고 Enter");
			System.out.println("---------------------------------");
			while(true) {
				String message = scanner.nextLine();
				if(message.toLowerCase().equals("q")) {
					break;
				}else {
					jsonObject = new JSONObject();
					jsonObject.put("command", "message");
					jsonObject.put("data", message);
					json = jsonObject.toString();
					chatClient.send(json);
					
				}
			}
			scanner.close();
			chatClient.unconnect();
		}catch(IOException e) {
			System.out.println("[클라이언트] 서버 연결 안됨");
		}
/*
 * main() 메소드는 채팅 클라이언트를 시작하기 위해 ChatClient 객체를 생성하고, 
 * 채팅 서버와 연결하기 위해 connect() 메소드를 호출한다.
 * 연결이 되면 대화명을 키보드로부터 입력받고 다음과 같은 JSON 메시지를 서버로 보낸다
 * {
 * 	"command"	:	"incoming",
 * 	"data"		:	"winter"
 * }
 * 다음으로 채팅 서버에서 보내는 메시지를 받기 위해 receive() 메소드를 호출하고, 사용자가 키보드로
 * 메시지를 입력하면 다음과 같은 JSON 메시지를 생성해서 서버로 보낸다.
 * {
 * 	"command"	:	"message",
 * 	"data"		:	"키보드에서 입력한 내용"
 * }
 * 만약 사용자가 q를 입력하면 unconnect() 메소드를 호출하고 클라이언트를 종료한다.
 */
	}
}
