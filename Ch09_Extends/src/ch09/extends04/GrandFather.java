package ch09.extends04;

public class GrandFather {
	int handsomeScore;

	GrandFather() {
		System.out.println("GrandFather 생성자");
	}

	GrandFather(int score) {
		handsomeScore = score;

	}

	void handsome() {
		System.out.println("Handsome");
	}

}
