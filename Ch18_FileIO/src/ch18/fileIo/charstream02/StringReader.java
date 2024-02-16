package ch18.fileIo.charstream02;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class StringReader {
	public static void main(String[] args) throws IOException {
		Reader rd =new FileReader("son.txt");
		
		BufferedReader br = new BufferedReader(rd);
		
		String str;
		while(true) {
			str = br.readLine(); //한줄씩 개행문자 만날때까지
			if( str ==null) break;
			System.out.println(str);
		}
		br.close();
	}
}
