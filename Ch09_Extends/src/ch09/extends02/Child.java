package ch09.extends02;

public class Child extends Father{
	float day = 365 + 1.0f/4;
	
	public Child() {
		System.out.println("Child 생성자");
	}
	void play() {
		System.out.println("life good");
	}
}
