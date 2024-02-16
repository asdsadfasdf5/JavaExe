package ch19.server.webserver03;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class SimpleWebServer {

	public static void main(String[] args) {
		final int PORT = 80; // http는 디폴트로 80포트로 사용
		try {
			// 현재 서버 프로세스가 동작하는 환경의 ip 주소를 자동으로 할당
			ServerSocket serverSocket = new ServerSocket(PORT);
			String mainThreadName = Thread.currentThread().getName();
			while (true) {
				System.out.printf("[서버-%s]브라우저 접속을 대기합니다...\n", mainThreadName);
				Socket socket = serverSocket.accept();
				System.out.printf("[서버-%s]새로운 쓰레드 시작합니다\n", mainThreadName);
				HttpThread ht = new HttpThread(socket);
				ht.start();
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}

class HttpThread extends Thread {
	private Socket socket;

	public HttpThread(Socket socket) {
		this.socket = socket;
	}

	@Override
	public void run() {
		try {
			InetAddress inetAddr = socket.getInetAddress();
			System.out.printf("<서버-%s>%s 로부터 접속했습니다.\n", getName(), inetAddr.getHostAddress());
			OutputStream os = socket.getOutputStream();
			InputStream is = socket.getInputStream();
			PrintWriter pw = new PrintWriter(new OutputStreamWriter(os));
			BufferedReader br = new BufferedReader(new InputStreamReader(is));
			
			String line = br.readLine();
			
			int start = line.indexOf(" ") + 2;
			int end = line.lastIndexOf("HTTP") - 1;
			String fileName = line.substring(start, end);
			if (fileName.equals(""))
				fileName = "index.html";
			System.out.printf("<서버-%s>사용자가 %s를 요청했습니다\n", getName(), fileName);

			// 요청한 파일을 읽어서 브라우저에 전달하기
			BufferedReader fileBr = new BufferedReader(new FileReader(fileName));
			String fileLine;

			while (true) {
				fileLine = fileBr.readLine();
				if (fileLine == null)
					break;
				pw.println(fileLine);
				pw.flush();
			}
			System.out.printf("<서버-%s>브라우저에 %s를 전송했습니다.\n", getName(), fileName);
			fileBr.close();
			pw.close();
			br.close();
		} catch (Exception e) {
			System.out.printf("<서버-%s>%s\n", getName(), e.getMessage());
			e.printStackTrace();
		}

	}

}