package ch03.continue11;

import java.util.Scanner;

public class Resolve3 {

	public static void main(String[] args) {
//	while문과 scanner의 nextLint메소드 이용. 예금 출금 조회 종료 기능을 제공하는 코드 작성

		System.out.println("---------------------------");
		System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
		System.out.println("---------------------------");

		int mon1 = 10000; // 예금액
		int mon2 = 2000; // 출금액
		int mon3 = 8000; // 잔고

		String result = "";
		String chStr = null;
		
		Scanner sc = new Scanner(System.in);

		while (true) {
			
			result = sc.nextLine();
			int chmon = 0;

			if(result.equals("4")) break;
//			if(result == "4") break; 잘못된 비교 주소값을 비교하게됨 
			if (result.equals("1")) {
				chmon = mon1;
				chStr = "예금";
			} else if (result.equals("2")) {
				chmon = mon2;
				chStr = "출금";

			} else if (result.equals("3")) {
				chmon = mon3;
				chStr = "잔고";

			}
			
			System.out.printf("선택> %s\n" + "%s> %d", result, chStr, chmon);
			System.out.println();

		}
		System.out.println("종료");

		sc.close();

	}

}
