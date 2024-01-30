package ch06.method01;

import java.util.*;

public class Resolve3 {

	/*
	 * 3. int result = total(10, 100); 위처럼 사용하면 result에는 10부터 100까지의 누적합이 저장되어야 합니다
	 * total메서드를 작성하고 사용해보세요.
	 */
	public static void main(String[] args) {
		// total메서드를 불러와 int result에 return값을 저장
		// 이때 total메서드와 result는 서로 같은 변수의 타입을 사용해야한다.
		int result = total(10, 100);
		//result에 저장된 값을 출력.
		System.out.print(result);

	}
	// 메서드에 시작값 종료값 전달 
	public static int total(int a, int b) {
//for문으로 시작값(a)+1를 i에 전달. 반복되는 주기조건 i가 b와 같거나 b가 클때실행 주기마다 i를 +1해준다
		for (int i = a + 1; i <= b; i++) {
			// a에 i값을 누적해서 저장 / a = a+i와 같음
			a += i;
		}
		//for문이 종료되어 리턴값으로 누적되었던 a를 전달
		return a;
	}
}
