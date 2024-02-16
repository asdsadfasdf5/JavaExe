package ch18.fileIo.charstream02;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class StringWriter {
	public static void main(String[] args) throws IOException {
		Writer wt = new FileWriter("son.txt");
		BufferedWriter bw = new BufferedWriter(wt);
		bw.write("aaaaaaaaaaaaa");
		bw.newLine();//개행문자 추가
		
		bw.write("bbbb");
		bw.newLine();//개행문자 추가
		bw.write("cccc");
		bw.newLine();//개행문자 추가
		bw.write("ddddd");
		bw.newLine();//개행문자 추가
		
		bw.close();
		System.out.println("입력 완료");
	}
}
