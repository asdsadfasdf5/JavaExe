package ch09.abstract09;

import java.util.Scanner;

public class CalcMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Add add = new Add();
		Sub sub = new Sub();
		Mul mul = new Mul();
		Div div = new Div();

		//자식객체는 부모의 클래스 변수에 저장할 수 있다.
		//객체 지향 언어의 특징
		//관리의 편의성(코드를 줄일 수 있다)
		Calc[] calcs = new Calc[] { add, sub, mul, div };
		
		boolean isRun = true;
		do {

			System.out.println("[2개의 숫자를 입력 후 연산]");
			System.out.print("첫번째 수 입력 >>");
			int num0 = Integer.parseInt(sc.nextLine());
			System.out.print("두번째 수 입력 >>");
			int num1 = Integer.parseInt(sc.nextLine());

			System.out.println("연산 선택(0 Add, 1 Sub, 2 Mul, 3 Div, 4 Exit");
			int sel = Integer.parseInt(sc.nextLine());
			if (sel == 4)
				isRun = false;
			else {
				calcs[sel].setValue(num0, num1);
				System.out.println("결과는 " + calcs[sel].calculate());
			}
		} while (isRun);
		
		System.out.println("Program End");
	}
}
