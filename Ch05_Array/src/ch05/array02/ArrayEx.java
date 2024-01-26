package ch05.array02;

import java.util.Scanner;

public class ArrayEx {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int total = 0;
		System.out.println("학생 수 입력 >>");
		int stuNum = sc.nextInt();
		int[] kor = new int[stuNum];
		
		
		for (int i = 0; i < kor.length; i++) {
			System.out.println((i + 1) + "번째 학생 국어점수 입력 >>");
			kor[i] = sc.nextInt();
			total += kor[i];
			
		}
		double avg = (double) total / 3;
		System.out.println("총점 : " + total);
//		System.out.println("평균 : " + avg);
		// 소수점 2번째자리까지 나타내려면? printf또는 format사용하려면 %.2f
		System.out.printf("평균 : %.2f ", avg);
		
		
		

		
		
	}

}
