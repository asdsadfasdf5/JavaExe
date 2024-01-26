package ch05.array06;

import java.util.Arrays;

public class ArrayEx {

	public static void main(String[] args) {
	//배열의 얕은 복사/ 깊은 복사
		
		//얕은 복사 socre1,2가 scores의 해시코드 주소를 복사한것과같다 
		int[] scores = {100,88,12,123,41};
		int[] score1 = scores;
		int[] score2 = score1;
		
		System.out.println(Arrays.toString(scores));
		System.out.println(Arrays.toString(score1));
		System.out.println(Arrays.toString(score2));
		System.out.println(scores);
		System.out.println(score1);
		System.out.println(score2); //hash code 
		System.out.println();
		
		
		//깊은 복사 ( 힙에 별도의 공간을 생성한 후 scores4는 새로 생성한 공간을 가리키게 된다.
		// ; 기존 공간과 분리되는 공간
		int[] scores4 = Arrays.copyOf(score1, score1.length);
		System.out.println(Arrays.toString(scores));
		System.out.println(Arrays.toString(scores4));
		System.out.println();
		
		scores[2] = 111111;
		System.out.println(Arrays.toString(scores));
		System.out.println(Arrays.toString(scores4));
		
		System.out.println((scores));
		System.out.println((scores4));
		System.out.println();
		
		
		
		
		
	}

}
