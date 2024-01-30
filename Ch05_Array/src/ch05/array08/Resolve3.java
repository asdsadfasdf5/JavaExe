package ch05.array08;

import java.util.Arrays;
import java.util.Scanner;

public class Resolve3 {
	// 1. 정수배열 5개 할당
	// 2. sysout(Arrays.toString(numArr);으로 출력 했을 때 거꾸로 출력되도록 배열의 값을 거꾸로 저장
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int[] arr = new int[5]; // 정수배열 5개 할당
		for (int i = 0; i < arr.length; i++) {
			System.out.println("정수 5개 입력");
			arr[i] = sc.nextInt(); // 정수를 받아서 arr길이만큼 순서대로 값을 저장
		}
		
		Arrays.sort(arr);
		int[] arrCopy = new int[5];
		for(int i=0; i<arrCopy.length;i++) {
			arrCopy[i] = arr[(arr.length-1)-i];
			
		}
		//강사님 코드
		for(int i =0; i<arr.length/2;i++) {
			int fIdx = i;
			int lIdx = arr.length-1-i;
			int pre = arr[fIdx];
			int suf = arr[lIdx];
			arr[fIdx]= suf;
			arr[lIdx]= pre;
			System.out.println("처리전 : "+Arrays.toString(arr));
		}
		System.out.println("처리후 : "+Arrays.toString(arr));
		//배열 거꾸로 출력
		System.out.println("배열 거꾸로 출력 : "+Arrays.toString(arrCopy));
	}

	
}
