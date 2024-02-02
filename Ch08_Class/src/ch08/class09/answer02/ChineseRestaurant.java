package ch08.class09.answer02;

import java.util.Scanner;

public class ChineseRestaurant {
	// 필드
	private String[] foods;
	private int selectNum;
	private Scanner sc;
	private String name;

	// 기본 생성자는 자동으로 클래스파일 생성시 생긴다.(*.class)

	// 매개변수 생성자
	public ChineseRestaurant(Scanner sc, String name, String[] foods) {
		this.foods = foods;
		this.sc = sc;
		this.name = name;

		// 객체가 생성되면 자동으로 처리해야 하는 작업을 코딩해줄수있다.
		System.out.println(this.name + "식당을 청소한다~");
		System.out.println(this.name + "재료를 준비한다");
	}

	// 메서드
	// 메뉴 메서드
	public void viewMenu() {
		System.out.println("---------[" + this.name + "]----------");
		for (int i = 0; i < foods.length; i++) {
			System.out.println(i + "." + foods[i]);
		}
	}

	public void selectFood() {
		System.out.println("---------[" + this.name + "]----------");
		System.out.print("어떤 음식을 선택하시겠습니까? >>");
		selectNum = sc.nextInt();

	}

	public void deliveryFood() {
		System.out.println("---------[" + this.name + "]----------");
		String food = foods[selectNum];
		System.out.print(food + "이 나왔습니다.");
		System.out.print("맛있게 드세요 ^^");

	}

}
