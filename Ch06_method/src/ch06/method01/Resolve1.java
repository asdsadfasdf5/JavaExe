package ch06.method01;

import java.util.Scanner;

public class Resolve1 {

	/*
	 * 1. 2개의 정수를 입력받고 큰 값을 반환하는 메서드와 작은 값을 반환하는 메서드를 작성하고 사용하세요
	 */
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("1번째 정수를 입력하세요");
		int num0 = sc.nextInt(); // 1번째 정수 입력 num0에 값 저장
		System.out.println("2번째 정수를 입력하세요");
		int num1 = sc.nextInt(); // 2번째 정수 입력 num1에 값 저장

		System.out.println("MAX = " + maxNum(num0, num1));
		System.out.println("MIN = " + minNum(num0, num1));
		sc.close(); 
	}
	
	// 삼항연산자 사용. 조건에 맞는 값을 전달.
	public static int maxNum(int a, int b) {
		return a > b ? a : b;
	}
	// 삼항연산자 사용. 조건에 맞는 값을 전달.
	public static int minNum(int a, int b) {
		return a < b ? a : b;
	}

}
