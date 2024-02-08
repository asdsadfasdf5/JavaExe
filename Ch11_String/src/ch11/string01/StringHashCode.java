package ch11.string01;

public class StringHashCode {

	public static void main(String[] args) {
		String str0 = "Hello, Java";
		String str1 = "Hello, Java";
		String str2 = new String("Hello, Java");
		
		
		//String의 hashCode()는 일반 객체의 hashCode와 다르다
		//일반객체는 주소를 ahsh화 하여 제공
		//String은 문자열의 내용을 정수로 변환하여 제공
		// 그러므로 객체 공간이 다른 여부와 관계없이 문자열 내용이 같으면 동일한 hashCode를 리턴
	        
		System.out.println(str0.hashCode());
		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());
		
		
		

	}

}
