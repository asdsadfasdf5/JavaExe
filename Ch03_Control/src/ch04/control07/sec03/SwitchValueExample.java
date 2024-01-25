package ch04.control07.sec03;

public class SwitchValueExample {
	public static void main(String[] args) {
		
		String grade = "B";
		
		//Java 11 이전 문법
		int score1 = 0;
		switch(grade) {
		case "A" -> score1 = 100;
		case "B" ->{
			int result = 100 - 20;
			score1 = result;
		}
		default -> score1 = 60;
		}
		
		System.out.println("Score1: "+ score1);
		
		//Java 12 부터 가능
		int score2 = switch(grade) {
		case "A" -> 100;
		case "B" -> {
			int result = 100 - 20;
			//Java 13부터 가능
			// 해당 블록의 결과값을 switch의 결과값으로 반환한다
			// 에약어이지만 변수명으로 사용이 가능하다
			yield result;
		}
		default -> 60-10;
		// default 결과 값 : 50
		};
		System.out.println("Score2 : "+ score2);
	}
}




