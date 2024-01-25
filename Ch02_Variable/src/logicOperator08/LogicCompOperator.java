package logicOperator08;

import java.util.Scanner;

public class LogicCompOperator {

	public static void main(String[] args) {
		int score;
		String pass;
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("당신의 시험 점수는 =>");
		score = sc.nextInt();
		System.out.println("당신의 면접의 분위기는? ( 화목/공식 ) => ");
		pass = sc.next();
		
		if( score >= 90 && pass.equals("화목")==true) {
			System.out.println("당신은 합격입니다.");
		}else {
			System.out.println("당신은 더 좋은 곳이 있을거");
			
		}
		
		
		
		sc.close();

	}

}
