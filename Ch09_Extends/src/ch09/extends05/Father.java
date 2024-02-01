package ch09.extends05;

public class Father extends GrandFather {
	private long money = 1_000_000_000_000_000L;

	public Father() {
		System.out.println("Father 생성자");

	}

	public Father(int score, long money) {
		super(score); // GrandFather의 매개변수 생성자 호출
		this.money = money;
		System.out.println("Father 매개변수 생성자");

	}

	void wealth() {
		System.out.println("money");
	}
}
