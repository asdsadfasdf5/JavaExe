package ch05.array04;

import java.util.Scanner;

public class Resolve3 {

	public static void main(String[] args) {
		// 3. 7명의 학생의 학점을 입력받고 총점과 평균을 출력하세요

		System.out.println("7명학생 학점 입력");
		Scanner sc = new Scanner(System.in);

		int[] student = new int[7];
		int total = 0;
		double avg = 0;

		for (int i = 0; i < student.length; i++) {

			System.out.println((i + 1) + "번째 학생 학점 입력");
			student[i] = sc.nextInt();
			total += student[i];

		}
		avg = (double) total/student.length;
		
		System.out.printf("총점: %d\n 평균: %.2f", total,avg);

	}

}
