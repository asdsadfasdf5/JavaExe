package ch08.class09.answer05;

public class Rectangle {

	private int x1, x2, y1, y2;

	// 좌표설정
	public void set(int x1, int y1, int x2, int y2) {
		this.x1 = x1;
		this.y1 = y1;
		this.x2 = x2;
		this.y2 = y2;
	}

	// 넓이
	public int square() {
		return Math.abs((x1 - x2) * (y1 - y2));
	}

	public void show() {
		int leftX = x1 < x2 ? x1 : x2;
		int topY = y1 < y2 ? y1 : y2;
		int rightX = x1 > x2 ? x1 : x2;
		int bottomY = y1 > y2 ? y1 : y2;

		System.out.println("좌상단 x1 = " + leftX);
		System.out.println("좌상단 y1 = " + topY);
		System.out.println("우하단 x2 = " + rightX);
		System.out.println("우하단 y2 = " + bottomY);
		System.out.println("넓이 = " + square());

	}

	// 기본과 매개생성자 비교
	public boolean equals(Rectangle r) {
		if (this.x1 == r.x1 && this.y1 == r.y1 && this.x2 == r.x2 && this.y2 == r.y2)
			return true;

		return false;

	}

}
