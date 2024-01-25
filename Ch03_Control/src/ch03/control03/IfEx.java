package ch03.control03;

import java.util.Scanner;

public class IfEx {
	public static void main(String[] args) {
		int score;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("0~100 intput");
		score = sc.nextInt();
		
//		String Text = score >= 90 ? "A" : "B";
		if(score >= 90) {
			System.out.println("A");
		}else if(score >= 80){
			System.out.println("B");
		}else if(score >= 70){
			System.out.println("C");
		}else if(score >= 60){
			System.out.println("D");
		}else{
			System.out.println("F");
		}
		
		sc.close();
	}
}
