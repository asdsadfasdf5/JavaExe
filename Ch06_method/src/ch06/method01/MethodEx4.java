package ch06.method01;

import java.util.Scanner;

public class MethodEx4 {
	
	public static void add(int num0, int num1,String op) {
		int result = 0;
		// 계산
		switch(op) {
		case "+" -> result = num0 + num1;
		case "-" -> result = num0 - num1;
		case "*" -> result = num0 * num1;
		case "/" -> result = num0 / num1;
		case "%" -> result = num0 % num1;
		default -> System.out.println("연산이 불가능 합니다.");
		}
		// 결과 출력
		System.out.println("결과값은 "+ result + "입니다.");

	}
//	메서드를 만들기 전 코드
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		// 입력
		System.out.println("1번째 정수 입력 >>");
		int num0 = sc.nextInt();		
		System.out.println("2번째 정수 입력 >>");
		int num1 = sc.nextInt();		
		System.out.println("연산자 입력(+,-,*,/,%) >>");
		String op = sc.next();		

		add(num0,num1,op);
		
		
		sc.close();
	}

}
