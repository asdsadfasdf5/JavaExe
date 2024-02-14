package ch17.stream01;

import java.util.Arrays;
import java.util.List;

class Custom {
	private int age;
	private String name;
	public int getAge() {
		return age;
	}
	public Custom setAge(int age) {
		this.age = age;
		return this;
	}
	public String getName() {
		return name;
	}
	public Custom setName(String name) {
		this.name = name;
		return this;
	}
}

public class StreamMap {
	public static void main(String[] args) {
		List<Custom> customerList = Arrays.asList(
				new Custom().setName("kk").setAge(11),
				new Custom().setName("yy").setAge(22),
				new Custom().setName("ee").setAge(33),
				new Custom().setName("uu").setAge(55),
				new Custom().setName("bb").setAge(44)
				);
		
		customerList.stream()
			.map(c->c.getName())
			.forEach(s->System.out.print(s+", "));
		System.out.println();
		
		customerList.stream()
			.map(c->c.getAge())	//int -> Object로 스트림(AutoBoxing)
			.forEach(s->System.out.print(s+", "));
		System.out.println();
		
		
		customerList.stream()
			.mapToInt(c->c.getAge()) // int -> int ( 위보다 성능이 낫다)
			.forEach(s->System.out.print(s+", "));
		System.out.println();
		
		
	}
}
