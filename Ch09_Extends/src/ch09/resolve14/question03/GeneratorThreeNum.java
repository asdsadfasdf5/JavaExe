package ch09.resolve14.question03;

import java.util.Arrays;

//난수 3개를 생성하는 역할
public class GeneratorThreeNum {

	public static int[] getRandomNum() {
		int[] numArr = new int[3];

		for (int i = 0; i < numArr.length; i++) {
			numArr[i] = (int) (Math.random() * 9 + 1);
			for (int j = 0; j < i; j++) {
				if (numArr[i] == numArr[j]) {
					i--;

				}
			}
		}

		return numArr;

	}

}