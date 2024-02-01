package ch09.resolve07.answer04;

import java.util.Arrays;

public class ArrayUtility2 {

	// s1과 s2를 연결한 새로운 배열 리턴
	public static int[] concat(int[] s1, int[] s2) {
		int len = s1.length + s2.length;
		int[] intArr = new int[len]; // 합치기 위한 새로운 배열

		int cnt = 0;
		for (int i = 0; i < s1.length; i++) {
			intArr[i] = s1[i];
			cnt++;
		}
		for (int i = cnt; i < s2.length; i++) {
			intArr[i] = s1[i];
		}

		return intArr;
	}

	// s1에서 s2배열의 숫자를 모두 삭제한 새로운 배열 리턴
	public static int[] remove(int[] s1, int[] s2) {
		// s1과 s2간의 겹치는 데이터가 없다고 가정하고 최대 s1의 길이만큼 배열을 할당
		int[] intArr = new int[s1.length];
		boolean isExist = false; // s1의 i위치 값이 s2에 존재하는지 판단
		int idx = 0; // s1의 i위치값이 s2에 존재하지 않을 때 intArr에 저장할 위치

		// s1의 값을 1개씩 s2에 있는지 확인
		for (int i = 0; i < s1.length; i++) {
			// s1의 i위치값이 s2전체 중에 존재하는 지 판단
			for (int j = 0; j < s2.length; j++) {
				// 존재한다면 for(int j~)를 탈출
				if (s1[i] == s2[j]) {
					isExist = true;
				}
			}
			// 찾지 못했으면 isExist는 false이므로 새로운 intArr위치에 저장
			if (!isExist) {
				intArr[idx] = s1[i];
				idx++;
			}
			// 다시 s1의 다음 위치 i를 검사해야 하므로 isExist를 false로 정해준다.
			isExist = false;
		}
		/* 중복은 제거되었지만 불필요한 배열의 공간이 남을 수 있으므로 새로 할당 */
		int[] dest = new int[idx];
		for (int i = 0; i < idx; i++) {
			dest[idx] = s1[i];
			idx++;
		}
		return intArr;
	}

}
