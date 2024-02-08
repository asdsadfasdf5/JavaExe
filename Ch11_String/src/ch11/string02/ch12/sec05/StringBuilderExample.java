package ch11.string02.ch12.sec05;

import java.util.ArrayList;
import java.util.List;

class MyStringBuilder{
	private List<Character> chList = new ArrayList();
	
	public MyStringBuilder append(String str) {
		char[] chArr = str.toCharArray();
		for(char ch : chArr) {
			chList.add(ch);
		}
		return this;
	}
	public MyStringBuilder insert(int idx, String str) {
		char[] chArr = str.toCharArray();
		for(int i =idx; i<idx+str.length();i++) {
			chList.add(i,chArr[i]);
		}
		return this;
	}
	@Override
	public String toString() {
		String str = "";
		for(char ch : chList) {
			str += ch;
		}
		return str;
	}
	
	
	
}

class Human {
	private String name;
	private int age;
	private float height;
	private float weight;
	
	//방법1. 필드로 초기화
	public Human(String name, int age, float height, float weight) {
		super();
		this.name = name;
		this.age = age;
		this.height = height;
		this.weight = weight;
	}

	//방법2 setter로 초기화
	public Human setName(String name) {
		this.name = name;
		return this;
	}

	public Human setAge(int age) {
		this.age = age;
		return this;
	}

	public Human setHeight(float height) {
		this.height = height;
		return this;
	}

	public Human setWeight(float weight) {
		this.weight = weight;
		return this;
	}
	
	
}
public class StringBuilderExample {
	public static void main(String[] args) {
		String data = new StringBuilder()
				.append("DEF")//문자열 끝에 추가
				.insert(0, "ABC") //문자열을 지정 위치에 추가
				.delete(3, 4)	//문자열 일부를 삭제
				.toString();	// 완성된 문자열 리턴
		System.out.println(data);
		
		String data2 = new MyStringBuilder()
				.append("DEF")//문자열 끝에 추가
				.insert(0, "ABC") //문자열을 지정 위치에 추가
				.toString();	// 완성된 문자열 리턴
		System.out.println(data2);
		
		
		/*
			Human human0 = new Human("1", 20, 12.1f, 1.2f);
			System.out.println(human0);
		---------------------------------
		 * 	Human human1 = new Human()
		 * 	.setName("1")
		 * 	.setAge(20)
		 * 	.setHeight(12.1f)
		 * 	.setWeight(1.2f)
		 */
		
		
	}

}
