package ch18.sec02.exam02;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class WriteExample {

	public static void main(String[] args) {
		try {
			OutputStream os = new FileOutputStream("D:/temp/test2.db");
			// 데이터 도착지를 test2.db 파일로 하는 바이트 출력 스트림 생성

			byte[] array = { 10, 20, 30 };

			os.write(array); // 배열의 모둔 바이트를 출력

			os.flush(); // 내부 버퍼에 잔류하는 바이트를 출력하고 버퍼를 지움
			os.close(); // 출력 스트림을 닫아 사용한 메모리 해제

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
