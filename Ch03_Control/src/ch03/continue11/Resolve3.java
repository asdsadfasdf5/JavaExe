package ch03.continue11;

import java.util.Scanner;

public class Resolve3 {

	public static void main(String[] args) {
//	while문과 scanner의 nextLint메소드 이용. 예금 출금 조회 종료 기능을 제공하는 코드 작성

		

		int money = 0; 

		String result = "";
		String chStr = null;
		
		Scanner sc = new Scanner(System.in);

		while (true) {
			
			System.out.println("---------------------------");
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
			System.out.println("---------------------------");
			
			result = sc.nextLine();
			String chmon = "";

			if(result.equals("4")) break;
//			if(result == "4") break; 잘못된 비교 주소값을 비교하게됨 
			if (result.equals("1")) {
				chStr = "예금 액수 입력";
				System.out.print(chStr);
				chmon = sc.nextLine();
				money += Integer.parseInt(chmon);
				System.out.print(chmon+"원 예금 완료");
				
			} else if (result.equals("2")) {
				chStr = "출금 액수 입력";
				System.out.print(chStr);
				chmon = sc.nextLine();
				
				if(money < Integer.parseInt(chmon)) {	
					System.out.println("예금된 금액보다 출금이 더 많습니다.");
				}else {
					
					money = money - Integer.parseInt(chmon);
				}

			} else if (result.equals("3")) {
				chStr = "잔고";
				System.out.println(chStr+" = "+money+"원");

			}
			System.out.println();

		}
		System.out.println("종료");

		sc.close();

	}

}
