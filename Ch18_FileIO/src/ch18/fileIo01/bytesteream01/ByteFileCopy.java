package ch18.fileIo01.bytesteream01;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/*
 * 파일입출력 3단계(Device통신, Network통신도 동일
 * - 특히 Linux는 사용하는 함수명도 동일
 * 1. 스트림 생성( create, open)
 * 2. 쓰기 / 읽기 (write/read, send/recv)
 * 3. 스트림 종료(close)
 */

public class ByteFileCopy {
	public static void main(String[] args) throws IOException  {
		// -------------------- 1. 스트림 생성
		// putty.exe. 파일과 연결된 입력 스트림 생성
		InputStream in = new FileInputStream("D:/Lecture/JavaExe_tutor/Ch18_FileIO/src/ch18/fileIo01/bytesteream01/putty.exe");
		//putty.exe를 푸티.exe로 저장할 출력 스트림 생성
		OutputStream os = new FileOutputStream("D:/Lecture/JavaExe_tutor/Ch18_FileIO/src/ch18/fileIo01/bytesteream01/푸티.exe");
		
		int copyByte = 0;
		int bData;
		long stime = System.nanoTime();
		// -------------------- 2. 스트림을 통해 입출력
		while(true) {
			bData = in.read();
			if(bData == -1) break;
			os.write(bData);
			copyByte++;
		}
		long etime = System.nanoTime();
		// -------------------- 3. 스트림 연결 종료
		in.close();
		os.close();
		System.out.println("복사 시간 : "+(etime - stime));
		System.out.println("복사된 바이트 크기 : "+copyByte);
	}
}
