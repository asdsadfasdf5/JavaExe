package ch03.continue11;

public class Resolve1 {

	public static void main(String[] args) {
//		for문. 1~100의 정수 중에서 3의 배수의 총합. 출력
		int sum=0;
		for (int i = 1; i <= 100; i++) {
			if(i%3==0) {
				System.out.printf("%d, \n",i);
				sum += i;
				System.out.println("sum = "+sum);
			}
		}
	}

}