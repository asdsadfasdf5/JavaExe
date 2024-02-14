package ch17.stream01;

import java.util.Arrays;
import java.util.Optional;

public class StreamReduce {
	public static void main(String[] args) {
		int[] nArr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

		
				
		int sum = Arrays.stream(nArr)
		.reduce(0, (a, b) -> a+b);
		System.out.println(sum);
		
		
	}
}
