package ch06.method01;

import java.util.*;

public class Resolve3 {

	/*
	 * 3. int result = total(10, 100); 위처럼 사용하면 result에는 10부터 100까지의 누적합이 저장되어야 합니다
	 * total메서드를 작성하고 사용해보세요.
	 */
	public static void main(String[] args) {
		int result = total(10, 100);
		System.out.print(result);

	}

	public static int total(int a, int b) {

		for (int i = a + 1; i <= b; i++) {
			a += i;
		}
		return a;
	}
}
