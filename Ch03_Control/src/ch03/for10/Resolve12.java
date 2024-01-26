package ch03.for10;

import java.util.Scanner;

public class Resolve12 {

	public static void main(String[] args) {
//		12. 양의 정수를 입력받고 그 수만큼 "감사합니다"를 출력하세요
		int num;
		Scanner sc = new Scanner(System.in);
		System.out.println("양의 정수를 입력");
		num = sc.nextInt();
		while(num > 0) {
			num--;
			System.out.println("감사합니다"+ num);
		}

	}

}
