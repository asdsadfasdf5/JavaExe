package ch18.sec02.exam03;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class WriteExample {

	public static void main(String[] args) {
		try {
			OutputStream os = new FileOutputStream("D:/temp/test3.db");

			byte[] array = { 10, 20, 30, 40, 50 };

			os.write(array, 1, 3); // 1번 인덱스부터 3개까지만 출력

			os.flush(); // 내부 버퍼에 잔류하는 바이트를 출력하고 버퍼를 지움
			os.close(); // 출력 스트림을 닫아 사용한 메모리 해제

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
