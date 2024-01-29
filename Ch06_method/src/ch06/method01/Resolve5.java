package ch06.method01;

import java.util.Scanner;

public class Resolve5 {

	/*
	 * 5. star(5); 을 입력하면
	 *
	 **
	 ***
	 ****
	 *****
	 * 위처럼 출력되는 void star(int num) 메서드를 작성하고 사용해보세요.
	 */

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("star count insert");
		star(sc.nextInt());

		sc.close();
	}

	public static void star(int num) {
		String star = "";
		for (var i = 0; i < num; i++) {
			star += "*";
			System.out.println(star);
		}
	}
}
