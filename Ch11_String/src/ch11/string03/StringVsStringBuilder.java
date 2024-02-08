package ch11.string03;
/*
 *String과 StringBuilder와 StringBuffer 차이
 *
 * String : 불변
 * StringBuilder : 변함
 * STringBuffer : 변함, 멀티스레드 동기화 처리
 */
public class StringVsStringBuilder {

	public static long getStringSpeed() {
		
		String str = "";
		long start = System.nanoTime();
		for(int i=0; i<26;i++) {
			str += (char)('a'+i);
		}
		long end = System.nanoTime();
		System.out.println("String :" + str);
		
		return end-start;
	}
	public static long getStringBuilderSpeed() {
		StringBuilder sbtr = new StringBuilder();
		long start = System.nanoTime();
		for(int i=0; i<26;i++) {
			sbtr.append((char)('a'+i));
		}
		long end = System.nanoTime();
		System.out.println("StringB :" + sbtr.toString());
		return end-start;
	}
	public static void main(String[] args) {
		long str =getStringSpeed();
		System.out.println(str);
		long sbtr = getStringBuilderSpeed();
		System.out.println(sbtr);

	}

}
