package ch05.array08;

public class SwapEx {

	public static void main(String[] args) {
		/*
		 * 파이썬의 경우 2개의 변수의 값을 바꾸려면
		 * a = 10 
		 * b = 20
		 * a, b = b, a 
		 */

		//자바의 경우 값을 임시로 저장해줄 변수하나가 필요하다.
		int tmp;
		int a = 10;
		int b = 20;
		tmp = a;
		a = b;
		b = tmp;
		
	}

}
