package ch08.class09.answer05;

import java.util.Scanner;

//			 Rectangle
public class RectangleMain {
	/*
	 * 5. Rectangle클래스를 작성하세요 int타입의 x1, y1, x2, y2 : 사각형을 구성하는 두 점의 좌표 void set(int
	 * x1, int y1, int x2, int y2) : 좌표 설정 int square() : 사각형 넓이 리턴 void show() :
	 * 좌표와 넓이 등 직사각형 정보의 화면 출력 boolean equals(Rectangle r) : 인자로 전달된 객체 r과 현 객체가 동일한
	 * 좌표의 직사각형이면 true 리턴
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("x1값 입력");
		int X1 = Integer.parseInt(sc.nextLine());
		System.out.println("y1값 입력");
		int Y1 = Integer.parseInt(sc.nextLine());
		System.out.println("x2값 입력");
		int X2 = Integer.parseInt(sc.nextLine());
		System.out.println("y2값 입력");
		int Y2 = Integer.parseInt(sc.nextLine());

		Rectangle Rectangle = new Rectangle();
		Rectangle Rectangles = new Rectangle(10,10,30,30);
		
		Rectangle.set(X1, Y1, X2, Y2);

		Rectangle.show();
		
		if(Rectangle.equals(Rectangles)) {
			System.out.println("사각형이 같음");
		}else {
			System.out.println("사각형이 X");
		}
	}

}
