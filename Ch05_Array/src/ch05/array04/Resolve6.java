package ch05.array04;

import java.util.Scanner;

public class Resolve6 {

	public static void main(String[] args) {
//		6. 5명의 학생의 이름과 점수를 입력받고
//		   해당학생의 이름과 학점이 A, B, C, D, F로 출력되도록 하세요
//		  A : 90이상, B : 80이상, C : 70이상, D : 60이상, F : 60미만
		Scanner sc = new Scanner(System.in);
		
		String[] stuName = new String[5];
		int[] stuScore = new int[5];
		char chScore;
		//   0~4 5번    <  1~5 5
		for(int i=0;i<stuName.length;i++) {
			System.out.println((i+1)+"번째 학생이름");
			stuName[i] = sc.nextLine();

			System.out.println((i+1)+"번째 학생점수");
			stuScore[i] = sc.nextInt();
			
			sc.nextLine(); //개행문자(엔터)를 제거하기위해 추가
		}
		
		
		
		int i=0;
		while(true) {
			
			if(i == (stuScore.length)) {break;}
			
			if(stuScore[i] >= 90) {
				chScore = 'A';
				System.out.println(stuName[i]+"학생, "+chScore+"학점");
			}else if(stuScore[i] >= 80) {
				chScore = 'B';
				System.out.println(stuName[i]+"학생, "+chScore+"학점");
				
			}else if(stuScore[i] >= 70) {
				chScore = 'C';
				System.out.println(stuName[i]+"학생, "+chScore+"학점");
				
			}else if(stuScore[i] >= 60) {
				chScore = 'D';
				System.out.println(stuName[i]+"학생, "+chScore+"학점");
				
			}else if(stuScore[i] < 60) {
				chScore = 'F';
				System.out.println(stuName[i]+"학생, "+chScore+"학점");
				
			}
			
			i++;
		}
	
		sc.close();
	}

}
