package ch16.lambda02.sec05.exam03;

public class Person {
	public Member getMember1(Createble1 createble) {
		String id = "winter";
		Member member = createble.create(id);
		return member;
	}

	public Member getMember2(Createble2 createble) {
		String id = "winter";
		String name = "한겨울";
		Member member = createble.create(id,name);
		return member;
	}

}
