package ch05.array08;

import java.util.Arrays;
import java.util.Scanner;

public class Resolve1 {
	//정수배열 5개 할당. arr sort를 활용. 최솟값 . 최댓값가져오기

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int[] arr = new int[5];
		for(int i =0; i<arr.length;i++) {
			System.out.println("input number");
			arr[i] = sc.nextInt();
		}
		Arrays.sort(arr);
		
		
		for(int i=0; i<arr.length;i++) {
			
			if(i == 0)
				System.out.println("최소값 : "+arr[i]);
			if(i == (arr.length-1)) 
				System.out.println("최댓값 : "+arr[i]);
		}
		
	}
}
