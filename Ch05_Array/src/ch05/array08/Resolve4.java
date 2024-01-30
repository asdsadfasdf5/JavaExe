package ch05.array08;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Resolve4 {
	// 1. 정수배열 5개 할당
	// 2. Arrays.sort를 사용하지 말고 배열을 오름차순으로 정렬하도록 저장 그리고 출력
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int[] arr = new int[5];
		
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println("정수 5개 입력");
			arr[i] = sc.nextInt();
		}
		
//---------------------------------------------------- 난수로만든 배열		
//		int[] newArr = new int[100_000];
//		// 난수로 0~100,000사이의 임의의 정수를 배열에 저장
//		for(int i=0;i<newArr.length;i++) {
//			double dVal = Math.random();
//			newArr[i] = (int) (dVal*100_000);
//		}
//		System.out.println(Arrays.toString(newArr));
//---------------------------------------------------- 난수로만든 배열		
		
//		Ver_InserSort(arr);
//		ver_choSort(arr);
//		Ver_Test(arr);
		Ver_BubleSort(arr);
	}
	public static void ver_choSort(int[] arr) {
		//선택정렬
		//i번째 데이터를 선택
		//i를 최소값으로 가정
		for(int i=0; i<arr.length;i++) {
			int sel = arr[i];
			int minIdx = i;
			//i다음부터 마지막까지 반복
			for(int j=i+1;j<arr.length;j++) {
				//현재 선택한 데이터보다 작은 값이 나타나면
				if(sel > arr[j]) {
					minIdx = j;
					sel = arr[j];
				}
			}
					
		}
		System.out.print(Arrays.toString(arr));
	}
	
	public static void Ver_BubleSort(int[] arr) {
		// 버블 정렬
		// 작동 원리 : 배열의 인접한 요소를 반복적으로 교체
		// 작동 순서 : 
		//1. 현재 요소와 다음 요소를 비교
		//2. 현재 요소가 다음 요소보다 크면 바꿈
		//3. 다음요소로 이동 후 반복

		for (int i = 0; i < arr.length - 1; i++) { 
			for (int j = 0; j < arr.length-1-i; j++) {
				if (arr[j] > arr[j+1]) {	
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		
		System.out.println(Arrays.toString(arr));
	}

	public static void Ver_InserSort(int[] arr) {
		// 삽입 정렬 (선택,버블,삽입중에서 런 타임이 가장빠름)
		// 작동 원리 : 배열의 요소의 위치 할 곳을 탐색하여 위치에 삽입.
		// 작동 순서 :
		// 1. 현재 요소의 숫자와 이전 위치의 요소의 숫자를 비교(처음 시작은 1번째 요소부터 시작한다)
		// 2. 타겟이 되는 요소의 숫자와 이전 위치의 요소보다 작다면 위치를 교환
		// 3. 다음 위치로 이동하며 반복.

		for (int i = 1; i < arr.length; i++) {
			// array[1]부터 시작
			// 이전 요소를 비교하기 위한 i-1을 j에 값 저장
			int j = i - 1;

			// 위치를 교환할 변수하나 생성
			int target = arr[i];
								
			while (j >= 0 && target < arr[j]) { // j가 0보다 크거나 같고 && 이전번째의 요소가 현재요소보다 클때
				arr[j + 1] = arr[j]; // 이전배열의 값을 현재배열의 값으로 저장
				j--;
			}
			// while문에 해당하여 탈출한 경우 : j를 총 -1하고 --;를 해서
			// while문에 해당하지 않는 경우 : j는 이전요소+1 현재요소에 = (i=target : 현재요소기 때문에 그대로)
			arr[j + 1] = target; // 현재요소를

		}
		System.out.println("배열 오름차순 출력 : "+Arrays.toString(arr));
	}
	
	public static void Ver_Test(int[] arr) {
		
		Integer[] arr01 = {1,2,3,4,5};
		Arrays.sort(arr01,Collections.reverseOrder());
		
		
		System.out.println("배열 오름차순 출력 : "+Arrays.toString(arr01));
	}
}
