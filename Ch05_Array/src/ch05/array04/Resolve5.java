package ch05.array04;

import java.util.Scanner;

public class Resolve5 {

	public static void main(String[] args) {
//		5. int배열을 10개 생성하세요.
//		 사용자로부터 10개의 값을 입력받고
//		 순서대로 출력하고  총합을 구하세요
		Scanner sc = new Scanner(System.in);

		int[] iArr = new int[10];
		int sum = 0;

		System.out.println("숫자 10개 값을 입력");
		for (int i = 0; i < iArr.length; i++) {
			System.out.println((i+1)+"번째 값을 입력");
			iArr[i] = sc.nextInt();
			sum += iArr[i];
		}
		for (int i = 0; i < iArr.length; i++) {
			System.out.println((i+1)+"번째 입력 값 : "+iArr[i]);

		}
		System.out.println("합계 : "+sum);

	}

}
