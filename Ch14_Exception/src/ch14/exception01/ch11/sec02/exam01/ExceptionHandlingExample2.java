package ch14.exception01.ch11.sec02.exam01;

public class ExceptionHandlingExample2 {

	public static void printLength(String data) {
		try {
			int result = data.length();
			System.out.println("문자 수:" + result);
			//data가 null일 경우 NullPointerException 발생
			
		}catch(NullPointerException e) {
			//방법1
			System.out.println(e.getMessage());
			//방법2
			System.out.println(e.toString());
			//방법3
			e.printStackTrace();
			//예외 정보를 얻는 방법은 3가지가 있다.
			
		}finally {
			System.out.println("[마무리 실행]\n");
		}
	}
	
	public static void main(String[] args) {
		System.out.println("[프로그램 시작]\n");
		printLength("ThisIsJava");
		printLength(null); //매개값으로 null을 대입
		System.out.println("[프로그램 종료]");
		
		
	}
}
