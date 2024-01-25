package ch03.control02;

import java.util.Scanner;

public class IfEx {
	public static void main(String[] args) {
		int score;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("0~100 intput");
		score = sc.nextInt();
		
//		String Text = score >= 90 ? "A" : "B";
		if(score >= 90) {
			System.out.println("true A");
		}else {
			System.out.println("Not A");
		}
		
		
		sc.close();
	}
}
