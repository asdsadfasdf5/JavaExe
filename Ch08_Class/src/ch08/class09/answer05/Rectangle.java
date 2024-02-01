package ch08.class09.answer05;

public class Rectangle {

	private int x1, x2, y1, y2;

	// 기본 생성자
	public Rectangle() {
		this(0, 0, 0, 0);
	}

	// 매개 생성자
	public Rectangle(int x1, int y1, int x2, int y2) {
		setX1(x1);
		setY1(y1);
		setX2(x2);
		setY2(y2);
	}
	// 좌표설정
	public void set(int x1, int y1, int x2, int y2) {
		setX1(x1);
		setY1(y1);
		setX2(x2);
		setY2(y2);
	}


	// 넓이
	public int square() {
		return Math.abs((x1 - x2) * (y1 - y2));
	}

	public void show() {
		int leftX = x1 < x2 ? x1 : x2 ;
		int topY = y1 < y2 ? y1 : y2 ;
		int rightX = x1 > x2 ? x1 :x2 ;
		int bottomY = y1 > y2 ? y1 : y2 ;
		
		System.out.printf("leftX:%s topY:%s rightX:%s bottomY:%s \n넓이:%s ",
				leftX, topY, rightX, bottomY, square());

	}

	// 기본과 매개생성자 비교
	public boolean equals(Rectangle r) {
		if(this.x1 == r.x1 &&
			this.y1 == r.y1 &&
			this.x2 == r.x2 &&
			this.y2 == r.y2) return true;
//		if (Math.abs(x1 - x2) == Math.abs(r.x1 - r.x2) && Math.abs(y1 - y2) == Math.abs(r.y1 - r.y2))
//			return true;
		return false;

	}

	// getter , setter
	public int getX1() {
		return x1;
	}

	public void setX1(int x1) {
		this.x1 = x1;
	}

	public int getX2() {
		return x2;
	}

	public void setX2(int x2) {
		this.x2 = x2;
	}

	public int getY1() {
		return y1;
	}

	public void setY1(int y1) {
		this.y1 = y1;
	}

	public int getY2() {
		return y2;
	}

	public void setY2(int y2) {
		this.y2 = y2;
	}

}
