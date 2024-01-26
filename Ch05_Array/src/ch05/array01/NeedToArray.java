package ch05.array01;

import java.util.Scanner;

public class NeedToArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		// 3명의 국어 점수 입력
		System.out.println("1번째 학생 국어점수 입력 >> ");
		int kor0 = sc.nextInt();
		System.out.println("2번째 학생 국어점수 입력 >> ");
		int kor1 = sc.nextInt();
		System.out.println("3번째 학생 국어점수 입력 >> ");
		int kor2 = sc.nextInt();

		int total = kor0 + kor1 + kor2;
		double avg = (double) total / 3;
		System.out.println("총점 : " + total);
		System.out.println("평균 : " + avg);
		//소수점 2번째자리까지 나타내려면? printf또는 format사용하려면 %.2f
		System.out.printf("평균 : %.2f " , avg);
		
		
		//kor0~2처럼 학생 수가 수만~수억일때 변수를 선언해서 사용하기엔 힘들다. 그래서 필요한것이 배열자료형을 사용하는것이다.
		
		
	}

}
