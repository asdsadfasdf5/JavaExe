package ch11.string01;

public class StringCompare {
	public static void main(String[] args) {
		String str0 = "Hello, Java";
		String str1 = "Hello, Java";
		String str2 = new String("Hello, Java");
		
		
		if(str0 == str1) {
			System.out.println("str0 == str1 같습니다");
		}
		if(str0 == str2) {
			System.out.println("str0 == str2 다릅니다");
			
		}
		// str0 == str1 = true
		// str0 == str2 = false
		// str1 == str2 = false
		// 문자열 내용을 비교할떈 equals 사용
	}
}
