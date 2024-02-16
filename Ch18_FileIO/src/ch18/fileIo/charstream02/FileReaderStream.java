package ch18.fileIo.charstream02;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class FileReaderStream {

	public static void main(String[] args) throws IOException {
		char[] cBuf = new char[10];
		int readCnt = 0;
		Reader in = new FileReader("hyper.txt");
		readCnt = in.read(cBuf,0,cBuf.length);
		for(int i=0;i<readCnt;i++) {
			System.out.println(cBuf[i]);
		}
		in.close();

	}

}
