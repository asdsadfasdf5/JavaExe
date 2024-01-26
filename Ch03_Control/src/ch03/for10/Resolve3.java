package ch03.for10;

import java.util.Scanner;

public class Resolve3 {

	public static void main(String[] args) {
//		3. 정수 3개를 입력받고 이 3개의 수로 삼각형을 만들 수 있는지를 판별하세요
//		   삼각형이 가능하려면 두 변의 합이 다른 한 변의 합보다 반드시 커야 합니다. (조건 연산자를 사용하세요)
		
		int num_one;
		int num_two;
		int num_thr;
		
		//삼각형을 만드려면 변의 합이 180일때 두 변의 합이 각각 50이상이여야 한다.
		// 피타고라스 정의로 풀어야함
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("1번째 변의 크기");
		num_one = sc.nextInt();
		System.out.println("2번째 변의 크기");
		num_two = sc.nextInt();
		System.out.println("3번째 변의 크기");
		num_thr = sc.nextInt();

//		if(num_one > num_two+num_thr || num_two  > num_one+num_thr ||
//				num_thr  > num_two + num_one) {
//			System.out.println("삼각형 실패");
//			
//		}else{
//			System.out.println("삼각형 성공");
//		}
		
		boolean bTriangle = false;

		boolean cond0 = num_one + num_two > num_thr;
		boolean cond1 = num_two + num_thr > num_one;
		boolean cond2 = num_thr + num_one > num_two;
		
		bTriangle = cond0 ? (cond1 ? (cond2 ? true : false)
											: false )
								: false;		
	
		
		System.out.println(bTriangle);
		
	}

}
