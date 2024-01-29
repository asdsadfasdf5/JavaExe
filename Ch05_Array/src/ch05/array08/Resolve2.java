package ch05.array08;

import java.util.Arrays;
import java.util.Scanner;

public class Resolve2 {
	// 정수배열 5개 할당. arr sort를 활용하지않고. 최솟값 . 최댓값가져오기
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int[] arr = new int[5];
		for (int i = 0; i < arr.length; i++) {
			System.out.println("input number");
			arr[i] = sc.nextInt();
		}
		System.out.println("\n--------------------- 버블정렬");
		Ver_BubleSort(arr);
		System.out.println("\n--------------------- 삽입정렬"	);
		Ver_InserSort(arr);
	}

	public static void Ver_BubleSort(int[] arr) {
		// 버블 정렬
		// 작동 원리 : 배열의 인접한 요소를 반복적으로 교체
		// 작동 순서 : 
		//1. 현재 요소와 다음 요소를 비교
		//2. 현재 요소가 다음 요소보다 크면 바꿈
		//3. 다음요소로 이동 후 반복

		for (int i = 0; i < arr.length - 1; i++) { // i=0. i<arr.length(5)-1. i++
			for (int j = i + 1; j < arr.length; j++) {// j= i+1. j<arr.length(5). j++
				if (arr[i] > arr[j]) {	// arr[i] > arr[j]라면 실행. 현재 요소가 다음요소보다 크다면 실행

					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		for (int tmp : arr) {
			System.out.print(tmp + ", ");

		}
		System.out.println("min : "+arr[0]+"  max : "+arr[arr.length-1]);

	}

	public static void Ver_InserSort(int[] arr) {
		// 삽입 정렬 (선택,버블,삽입중에서 런 타임이 가장빠름)
		// 작동 원리 : 배열의 요소의 위치 할 곳을 탐색하여 위치에 삽입.
		// 작동 순서 :
		// 1. 현재 요소의 숫자와 이전 위치의 요소의 숫자를 비교(처음 시작은 1번째 요소부터 시작한다)
		// 2. 타겟이 되는 요소의 숫자와 이전 위치의 요소보다 작다면 위치를 교환
		// 3. 다음 위치로 이동하며 반복.

		for (int i = 1; i < arr.length; i++) {
			// 이전 요소를 비교하기 위한 i-1
			int j = i - 1;

			// 위치를 교환할 변수하나 생성
			int target = arr[i];

			while (j >= 0 && target < arr[j]) { // j번째 요소가 0보다 크거나 같고 && 이전번째의 요소가 현재요소보다 클때
				arr[j + 1] = arr[j]; // 이전요소의 다음번째에 값을 저장 / 뒤로 밀어버린다.
				j--;
			}
			// while문에 해당하여 탈출한 경우 : j를 총 -1하고 --;를 해서
			// while문에 해당하지 않는 경우 : j는 이전요소+1 현재요소에 = (i=target : 현재요소기 때문에 그대로)
			arr[j + 1] = target; // 현재요소를

		}
		for (int tmp : arr) {
			System.out.print(tmp + ", ");

		}
		System.out.println("min : "+arr[0]+"  max : "+arr[arr.length-1]);
	}

}
