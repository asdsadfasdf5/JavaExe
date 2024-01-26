package ch05.array03;

import java.util.Arrays;


public class ArrayEx {

	public static void main(String[] args) {
		// 배열의 초기화
		// 배열은 클래시이고 kor은 스택(stack)에 위차하여 참조값 (해시코드)가 들어있고 실제 배열의 값들은 힙(heap)메모리에 위치한다.

		// 정식 선언은 int[] kor = new int[3]이지만 프로그래머의 편의를 위해 아래처럼 초기화를 허용한다.
		// C언어때부터 관습.
		int[] kor = { 98, 99, 89 };
		System.out.println("배열의 크기: " + kor.length);

		int[] math = { 100, 80, 75, 41, 12 };
		System.out.println("배열의 크기: " + math.length);

		int[] eng = new int[] { 100, 80, 75, 41, 12 };
		System.out.println("배열의 크기: " + eng.length);

		System.out.println(Arrays.toString(kor));
		System.out.println(Arrays.toString(math));
		System.out.println(Arrays.toString(eng));

		for (int i = 0; i < kor.length; i++) {
			System.out.print(kor[i] + " ");
		}
		for (int i = 0; i < math.length; i++) {
			System.out.print(math[i] + " ");
		}
		for (int i = 0; i < eng.length; i++) {
			System.out.print(eng[i] + " ");
		}
	}

}
