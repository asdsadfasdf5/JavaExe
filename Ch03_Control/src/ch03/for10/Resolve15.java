package ch03.for10;

import java.util.Scanner;

public class Resolve15 {

	public static void main(String[] args) {
//		15. 사용자로부터 정수를 입력받습니다.
//		   입력 받은 값을 계속 더합니다
//		   사용자가 0을 입력하면 합을 출력합니다
//		   프로그램을 종료합니다.
		int num;
		int sum = 0;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("사용자로부터 정수를 입력");
			num = sc.nextInt();
			sum += num;

		} while (num != 0);
		System.out.println("합 => " + sum);
		sc.close();

	}

	public static void method1() {
		Scanner sc = new Scanner(System.in);

		boolean isRun = true;

		int sum = 0;
		while (isRun) {
			System.out.println("정수 입력");
			int num = sc.nextInt();
			sum += num;
			if (num == 0)
				isRun = false;
		}
		System.out.print("합=>" + sum);
	}

}
