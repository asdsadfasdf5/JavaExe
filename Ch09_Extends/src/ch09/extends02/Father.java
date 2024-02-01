package ch09.extends02;

public class Father extends GrandFather{
	long money =1_000_000_000_000_000L;
	Father(){
		System.out.println("Father 생성자");
	}
	void wealth() {
		System.out.println("money");
	}
}
