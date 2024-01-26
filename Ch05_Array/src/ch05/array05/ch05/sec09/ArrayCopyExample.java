package ch05.array05.ch05.sec09;

public class ArrayCopyExample {

	public static void main(String[] args) {
		// 배열 변수 선언과 배열 생성
		int[] scores = { 95, 71, 84, 93, 87 };
		// 배열 항목 전체 합 구하기
		int sum = 0;
		
		//for each문  자료형(array, arrayList등)가능함 scores배열의 순서대로 score에 값이 대입된다. 반복횟수를 명시적으로 줄수없다.
		for (int score : scores) {
			sum = sum + score;
		}
		System.out.println("점수 총합 = " + sum);
		// 배열 항목 전체 평균 구하기
		double avg = (double) sum / scores.length;
		System.out.println("점수 평균 = " + avg);
	}

}
