package ch18.fileIo.bytesteream01;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/*
 * 1byte씩 파일에서 읽어서 저장하는 방식은 너무 느림
 * 이것을 개선하려면 3가지
 * 1. 한번에 많이 읽기
 * 2. jdk 버퍼 클래스를 사용해서 미리 읽어들인 것을 1byte씩 가져오고
 * 다시 출력 버퍼 클래스에 1byte씩 저장하면 알아서 파일에 한꺼번에 저장
 * 3. 1번과 2번을 합치기
 * 
 * 물류 시스템과 동일
 * 하드디스크 (물류센터)
 * app프로세스(아파트)
 * buffer클래스(택배차량)
 * ㄴ> 비용 절감
 */
public class ByteBufBufferedFileCopy {

	public static void main(String[] args) throws IOException {
		String dir = "D:/Lecture/JavaExe_tutor/Ch18_FileIO/src/ch18/fileIo01/bytesteream01/";

		try {
			// 입력 스트림
			InputStream is = new FileInputStream(dir+"video.mp4");
			// 입력 스트림과 연결된 저장소(버퍼) 필터 클래스
			BufferedInputStream bis = new BufferedInputStream(is);

			// 출력 스트림
			OutputStream os = new FileOutputStream(dir+"비디오.mp4");
			// 출력 스트림과 연결된 저장소(버퍼) 필터 클래스
			BufferedOutputStream bos = new BufferedOutputStream(os);

			long stime = System.currentTimeMillis();
			long copyByte = 0;
			int readLen;
			byte[] buf = new byte[1024*10];
			while ((readLen = bis.read()) != -1) {
				bos.write(buf, 0, readLen);
				copyByte++;
			}
			long etime = System.currentTimeMillis();
			System.out.println("copyByte : " + copyByte);
			System.out.println("copy time: "+ (etime-stime));
			// try/catch문으로 작성하면 close를 사용하지 않아도 된다.
//			bos.close();
//			bis.close();
//			is.close();
//			os.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
