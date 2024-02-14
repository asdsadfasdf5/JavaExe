package ch17.stream01;

import java.util.Arrays;

public class StreamForEach {

	public static void main(String[] args) {
		int[] arr = { 10, 30, 99, 23, 3, 11 };

		// 출력하는 법 1
		System.out.println(Arrays.toString(arr));

		// 출력하는 법 2
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + ", ");
		}
		System.out.println();

		// 출력하는 법3
		for (int iarr : arr) {
			System.out.print(iarr + ", ");
		}
		System.out.println();
		
		// 스트림 사용
		System.out.println("Stream");
		Arrays.stream(arr).forEach(n->System.out.print(n+", "));
	}

}
