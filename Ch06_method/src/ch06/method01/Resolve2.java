package ch06.method01;

import java.util.Scanner;

public class Resolve2 {

	/*
	 * 2. 두 개의 정수를 받아서, 두 수의 차의 절대값을 계산하여 출력하는 메서드를 만들고 사용해보세요. 메서드 호출 시 전달되는 값의 순서와
	 * 상관없이 절대값이 계산되어서 출력되어야 합니다
	 */

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("1번째 정수를 입력하세요");
		int num0 = sc.nextInt();
		System.out.println("2번째 정수를 입력하세요");
		int num1 = sc.nextInt();

		System.out.print(bnum(num0, num1));

		sc.close();
	}

	public static int bnum(int a, int b) {
		return a < b ? b - a : a - b;
	}
}
