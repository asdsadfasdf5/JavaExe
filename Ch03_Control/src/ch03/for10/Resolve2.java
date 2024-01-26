package ch03.for10;

import java.util.Scanner;

public class Resolve2 {

	public static void main(String[] args) {

//2. 369게임을 작성합니다.
//   1~99까지의 정수를 입력받고
//   3,6,9중 하나가 있으면 "박수짝"을 출력하고
//   2개가 있으면 "박수짝짝"을 출력하세요
//   예를 들어 13은 "박수짝"
//   36인 경우는 "박수짝짝"을 출력하면 됩니다.
		
		
		
		
		// 입력받을 정수를 담을 변수
		int num;
		
		do {
			// 입력 받을 스캐너 변수
			Scanner sc = new Scanner(System.in);
			System.out.println("Input Number 1~99");
			// 입력 받은 정수를 num에 값 저장
			num = sc.nextInt();
			// 10의자리에서 3,6,9와 1의자리 3,6,9를 받아내기 위한 변수
			// 10의 자리
			int fristNum = num/10;
			// 1의 자리
			int secondNum = num%10;
			
			// 10의자리와 1의 자리에 3,6,9가 있을때 박수를 다르게 하기 위한 변수
			boolean fB = false;
			boolean sB = false;
			
			// 10의 자리에 3,6,9가 포함되어 있는지?
			if (fristNum==3 || fristNum==6 || fristNum==9) {
				fB = true;
			}
			// 1의 자리에 3,6,9가 포함되어 있는지?
			if (secondNum==3 || secondNum==6 || secondNum==9) {
				sB = true;
			}
		
			// 10의자리1의자리에 둘다 포함되어있을때
			if(fB&&sB == true) {
				System.out.println("박수짝짝");
				
			// 10의자리1의자리에 하나만 포함되어있을때
			}else if(fB^sB == true) {
				System.out.println("박수짝");
			}else {
				System.out.println("재시도");
				
			}

			
		}while(!( num >= 1 && num <= 99));
		
		
//		-------
		
		
		
		
	}

}
