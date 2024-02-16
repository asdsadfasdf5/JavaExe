package ch19.sec07;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;

import org.json.JSONObject;

public class SocketClient {
	//필드
	ChatServer chatServer;
	Socket socket;
	DataInputStream dis;
	DataOutputStream dos;
	String clientIp;
	String chatName;
/*
 * SocketClinet는 클라이언트와 1:1로 통신하는 역할을 한다. chatServer 필드는 ChatServer()의
 * 메소드를 호출하기 위해 필요하다. socket은 연결을 끊을 때 필요하고, dis와 dos는 문자열을 읽고 보내기
 * 위한 보조 스트림이다. clientIp와 chatName은 클라이언트의 IP주소와 대화명이다.
 * 
 */
// 생성자	
	public SocketClient(ChatServer chatServer, Socket socket) {
		try {
			this.chatServer = chatServer;
			this.socket = socket;
			this.dis = new DataInputStream(socket.getInputStream());
			this.dos = new DataOutputStream(socket.getOutputStream());
			InetSocketAddress isa =
					(InetSocketAddress) socket.getRemoteSocketAddress();
			this.clientIp = isa.getHostName();
			receive();
		}catch(IOException e) {	e.getMessage();	}
/*
 * 매개값으로 받은 ChatServer와 socket을 필드에 저장한 다음 문자열 입출력을 위해 DataInputStream과
 * DataOutputStream을 생성해서 필드에 저장한다. 그리고 클라이언트의 주소를 필드에 저장한다.
 * 
 */
	}
// 메소드 : JSON 받기
	public void receive() {
		chatServer.threadPool.execute(()->{
			try {
				while(true) {
					String receiveJson = dis.readUTF();
					
					JSONObject jsonObject = new JSONObject(receiveJson);
					String command = jsonObject.getString("command");
					
					switch(command) {
					case "incoming" :
					
						this.chatName = jsonObject.getString("data");
						chatServer.sendToAll(this, "들어오셨습니다");
						chatServer.addSocketClient(this);
						break;
					
					case "message" :
					
						String message = jsonObject.getString("data");
						chatServer.sendToAll(this, message);
						break;
					
					}
				}
			}catch(IOException e) {
				chatServer.sendToAll(this, "나가셨습니다");
				chatServer.removeSocketClient(this);
			}
		});
/*
 * receive() 메소드는 클라이언트가 보낸 JSON 메세지를 읽는 역할을 한다. dis.readUTF()로
 * JSON을 읽고 JSONObject로 파싱해 command 값을 먼저 얻어낸다. 그 이유는 dommand에
 * 따라 처리 내용이 달라지기 떄문이다.
 * command가 incoming이라면 JSON에서 대화명을 읽고 chatRoom에 SocketClient를 추가한다.
 * command가 message라면 JSON에서 메세지를 읽고 연결되어 있는 모든 클라이언트에게 보낸다.
 * 클라이언트가 채팅을 종료할 경우 dis.readUTF()에서 IOException이 발생하기 때문에, 예외처리를
 * 해서 charRoom에 저장되어 있는 SocketClient를 제거한다
 */
	}
//메소드 : JSON 보내기
	public void send(String json) {
		try {
			dos.writeUTF(json);
			dos.flush();
		}catch(IOException e) {}
/*
 * send() 메소드는 연결된 클라이언트로, JSON 메세지를 보내는 역할을 한다.
 * ChatServer의 sendToAll() 메소드에서 호출된다.
 */
	}
	
//메소드 : 연결 종료
	public void close() {
		try {
			socket.close();
		}catch(Exception e) {}
/*
 * close() 메소드는 클라이언트와 연결을 끊는 역할을 한다. ChatServer의 stop() 메소드에서 호출된다.
 * 	
 */
	}
	
}
