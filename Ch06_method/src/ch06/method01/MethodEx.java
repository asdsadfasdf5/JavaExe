package ch06.method01;

import java.util.Scanner;

//	메서드를 만들기 전 코드
public class MethodEx {
	// main메서드 내의 계산하는 부분을 옮긴다.
	public static int calcArith(int num0, int num1,String op) {
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
		return result;
	}
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		// 입력
		System.out.println("1번째 정수 입력 >>");
		int num0 = sc.nextInt();		
		System.out.println("2번째 정수 입력 >>");
		int num1 = sc.nextInt();		
		System.out.println("연산자 입력(+,-,*,/,%) >>");
		String op = sc.next();		

		calcArith(num0,num1,op);
		
		
		sc.close();
	}

}
