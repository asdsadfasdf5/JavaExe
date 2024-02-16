package ch18.fileIo.bytesteream01;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/*
 * 바이너리 파일(기계어로 된 파일) => 메모장에서 열면 깨져 보인다.
 * : 이미지, 영상, 실행파일...
 * 
 * 메모리의 변수값을 바이너리 파일로 저장하고 싶을때 쉽게 도와주는 클래스
 * ㄴ> Filter 클래스를 사용하면 편리 ( 바이트 스트림 클래스와 함께 사용해야한다. )
 */
public class DataBufferFilterStream2 {

	public static void main(String[] args) throws IOException {
		String dir = "D:/Lecture/JavaExe_tutor/Ch18_FileIO/src/ch18/fileIo01/bytesteream01/";
		//출력 스트림 생성
		OutputStream os = new FileOutputStream(dir+"data.bin");
		
		//필터 클래스(변수값 저장에 편리한 기능 제공)
		DataOutputStream filterOut = new DataOutputStream(os);
		// 저장할 변수
		int num = 365;
		double pi = 3.14;
		String str = "ABC";
		// data.bin에 저장
		filterOut.writeInt(num);
		filterOut.writeDouble(pi);
		filterOut.writeUTF(str);
		filterOut.close();
		// 입력스트림을 생성해서 읽어들이기
		InputStream is = new FileInputStream(dir+"data.bin");
		DataInputStream dis = new DataInputStream(is);
		int isNum = dis.readInt();
		double isPi = dis.readDouble();
		String isStr = dis.readUTF();
		dis.close();
		
		System.out.println("isNum : "+isNum);
		System.out.println("isPi : "+isPi);
		System.out.println("isStr : "+isStr);
		
	}

}
