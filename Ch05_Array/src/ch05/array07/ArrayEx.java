package ch05.array07;

import java.util.Arrays;

public class ArrayEx {

	//정렬 sort()
	public static void main(String[] args) {
		int[] scores = {100,80,70,20,50,24};
		
		
		System.out.println(Arrays.toString(scores));
		// 정렬
		Arrays.sort(scores);
		System.out.println(Arrays.toString(scores));
		
		// 배열의 정렬 Arrays.sort(); 데이터가 적을때
		// Array.parallelSort(); 데이터가 많을때
		// 실제로 parallelSort()와 sort()를 비교해보면 약 5000개 정도부터 parallelSort()의 성능이 더 빨라진다고 한다. [출처:https://1-7171771.tistory.com/118]
		
		
	}

}
