package ch19.server.echoclient02;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;

/*
 * 클라이언트는 서버와 연결되어야 한다.
 * IP, Port를 소켓객체 설정하고 연결을 한다.
 * 연결 후에 서버 <-> 클라이언트 자유롭게 통신
 * 다 마치면 스트림 종료.
 */
public class EchoThreadClient {
	public static void main(String[] args) {
		final int PORT = 9000;
		try {
			// IP, Port로 서버 프로그램과 연결시도 후 성공하면(서버에서는 accept() )
			// 스트림 생성 그리고 연결된 socket객체 리턴
			Socket socket = new Socket("localhost", PORT);
			// 키보드로부터 입력받기 위한 스트림 연결(Scanner 대신)
			BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));
			OutputStream os = socket.getOutputStream();// 서버로 전송 스트림
			InputStream is = socket.getInputStream();// 서버에서 수신 스트림
			PrintWriter pw = new PrintWriter(new OutputStreamWriter(os));// 전송
			BufferedReader br = new BufferedReader(new InputStreamReader(is));// 수신

			String line;
			while (true) {
				line = keyboard.readLine();
				if (line.equals("quit"))
					break;
				pw.println(line);
				pw.flush();

				// 서버는 받은 후에 클라이언트로 echo
				line = br.readLine();
				System.out.println("서버로부터 echo 문자열: " + line);
			}
			pw.close();br.close();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
