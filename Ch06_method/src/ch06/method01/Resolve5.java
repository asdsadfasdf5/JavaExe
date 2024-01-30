package ch06.method01;

import java.util.Scanner;

public class Resolve5 {

	/*
	 5. star(5); 을 입력하면
	 *
	 **
	 ***
	 ****
	 *****
	 위처럼 출력되는 void star(int num) 메서드를 작성하고 사용해보세요.
	 */

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("star count insert");
		star2(sc.nextInt());
		

		sc.close();
	}

	public static void star(int num) {
		String star = "";
		for (var i = 0; i < num; i++) {
			star += "*";
			System.out.println(star);
		}
	}
	
	public static void star2(int num) { // 2차원 for문이 조금더 사용하기 좋고 면접으로 사용하기도함
		for(int i=1; i<=num;i++) { //세로행의 변화
			for(int j=1;j<=i;j++) { // 가로열의 변화
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
