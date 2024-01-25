package ch03.control07.ch04.sec03;

public class SwitchExpressionExaple {
	public static void main(String[] args) {
		
		char grade = 'B';
		
		System.out.println("라벨(:) -----------------------------------");
		switch(grade) {
		case 'a','A' :{
			System.out.println("우수 회원");
		}
		case 'b','B' :{
			System.out.println("일반회원");
		}
		default :{
			System.out.println("손님");			
		}
		}
		
		System.out.println("라벨(->)  --------------------------------");
		
		switch(grade) {
		case 'a','A' -> System.out.println("우수 회원");
		
		case 'b','B'-> System.out.println("일반회원");
		
		default -> System.out.println("손님");			
		}
		
		System.out.println("-----------------------------------------------");
		System.out.println(" case에서 라벨 ':' 하고 '->' 가 있는데 '->'는 브레이크를 사용한것과 동일하다");
		System.out.println(" 실행문이 2줄 이상일 땐 중괄호 사용해야 함");
		System.out.println("-----------------------------------------------");
		
	}
}




