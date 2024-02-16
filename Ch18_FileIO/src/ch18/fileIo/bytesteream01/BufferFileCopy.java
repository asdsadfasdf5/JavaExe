package ch18.fileIo.bytesteream01;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class BufferFileCopy {

	public static void main(String[] args) throws IOException {
		String dir = "D:/Lecture/JavaExe_tutor/Ch18_FileIO/src/ch18/fileIo01/bytesteream01/";

		// 1. 스트림 연결
		InputStream is = new FileInputStream(dir + "cat.jpg");
		OutputStream os = new FileOutputStream(dir + "고양이.jpg");

		// 2. 스트림 입/출력
		int copyByte = 0;
		int readLen;
		byte[] buf = new byte[1024];

		while (true) {
			readLen = is.read();	//실제 읽어들인 byte크기는 readLen
			if (readLen == -1) break;
			os.write(buf, 0, readLen); // buf에서 실제 읽어들인 크기만큼 저장
			copyByte += readLen; // 읽어들인 크기를 누적
		}
		System.out.println("copy Byte Size : " + copyByte);

		// 3. 스트림 종료
		is.close();
		os.close();

	}

}
