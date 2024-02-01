package ch09.resolve07.answer02;

public class Triangle {

	int base;
	int height;

	// 생성과 동시에 초기화가 가능한 생성자도 정의
	public Triangle(int base, int height) {
		this.base = base;
		this.height = height;
	}

	// 삼각형의 넓이를 계산해서 반환하는 메소드도 정의
	public int area() {
		return base * height / 2;
	}

	public int getBase() {
		return base;
	}

	public void setBase(int base) {
		this.base = base;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

}
