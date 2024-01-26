package ch03.for10;

import java.util.Scanner;

public class Resolve14 {

	public static void main(String[] args) {
//		14. 입력받은 숫자의 구구단을 출력하세요
//		   예를 들어 3을 입력하면 
//		   3 x 1 = 3
//		   3 x 2 = 6
//		   ...
//		   3 x 9 = 27

		int num;
		Scanner sc = new Scanner(System.in);
		System.out.println("입력받은 숫자의 구구단을 출력");
		num = sc.nextInt();
		int i=0;
		while(i < 9) {
			i++;
			System.out.println(num+"X"+i+"="+ num*i);
			
			System.out.printf("%d * %d = %d\n", 
					num, i, num*i);
		}
	}

}
