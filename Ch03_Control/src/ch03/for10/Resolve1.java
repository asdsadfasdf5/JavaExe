package ch03.for10;

import java.util.Scanner;

public class Resolve1 {

	public static void main(String[] args) {
/*
1. 돈의 액수를 입금하세요
   입금한 돈을 오만원권, 만원권, 오천원권, 천원권, 500원동전, 100원동전, 50원동전, 10원동전, 1원동전 
   각 몇개로 변환되는지 출력하세요
   출력 개수는 단위가 큰 것 순서로 계산합니다
   예를 들어 78670원이면 
   <오만원 1매, 만원 2매, 오천원 1매, 천원 3매, 500원 1개, 100원 1개, 50원 1개, 10원 2개> 입니다.

 */
		
//		int money = 78670;
//		
//		int moneyV;
//		
//
//		do {
//		
//			
//				moneyV = money/50000;
//				System.out.println("5만원권 "+moneyV+"매");
//				money = money-(50000*moneyV);
//				
//				moneyV = money/10000;
//				System.out.println("만원권 "+moneyV+"매");
//				money = money-(10000*moneyV);
//				
//				moneyV = money/5000;
//				System.out.println("5000원권 "+moneyV+"매");
//				money = money-(5000*moneyV);
//				
//				moneyV = money/1000;
//				System.out.println("1000원권 "+moneyV+"매");
//				money = money-(1000*moneyV);
//				
//				moneyV = money/500;
//				System.out.println("500원권 "+moneyV+"매");
//				money = money-(500*moneyV);
//				
//				moneyV = money/100;
//				System.out.println("100원권 "+moneyV+"매");
//				money = money-(100*moneyV);
//				
//				moneyV = money/50;
//				System.out.println("50원권 "+moneyV+"매");
//				money = money-(50*moneyV);
//				
//				moneyV = money/10;
//				System.out.println("10원권 "+moneyV+"매");
//				money = money-(10*moneyV);
//				
//				
//				System.out.println("남은돈 "+money+"원");
//				break;
//			
//		}while(money > 0);
		
		int money;
		Scanner sc = new Scanner(System.in);
		System.out.println("돈 입력");
		money = sc.nextInt();
		
		int money50000;
		int money10000;
		int money5000;
		int money1000;
		int money500;
		int money100;
		int money50;
		int money10;
		
		
		
		money50000 = money/50000;
		money = money%50000;
		
		
		
		money10000 = money/10000;
		money = money%10000;
		
	
		money5000 = money/5000;
		money = money%5000;
		
		money1000 = money/1000;
		money = money%1000;
		
		money500 = money/500;
		money = money%500;
		
		money100 = money/100;
		money = money%100;
		
		money50 = money/50;
		money = money%50;
		
		money10 = money/10;
		money = money%10;
		
		System.out.println(
				"5만원권 "+money50000 + "장\n" +
				"1만원권 "+money10000 + "장\n" +
				"5천원권 "+money5000 + "장\n" +
				"1천원권 "+money1000 + "장\n" +
				"500원 "+money500 + "개\n" +
				"100원 "+money100 + "개\n" +
				"50원 "+money50 + "개\n" +
				"10원 "+money10 + "개\n" 
				); // 
		
		
		System.out.println();
		
	}
		
}

