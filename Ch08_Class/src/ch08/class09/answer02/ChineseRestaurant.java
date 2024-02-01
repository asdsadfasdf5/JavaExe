package ch08.class09.answer02;

import java.util.Scanner;

public class ChineseRestaurant {
	private int shopNum; // 중국집 선택 번호
	private int menuNum; // 중국집 메뉴 번호
	private Scanner sc; // 스캐너
	private final String[] SHOP = {"","중국집 1","중국집 2","중국집 3","중국집 4"};
	private final String[] FOODS = {"","메뉴 1","메뉴 2","메뉴 3","메뉴 4"};

	
	public ChineseRestaurant(Scanner sc) {
		this.sc = sc;
	}
	public int shopNum() {
		int selectShop = Integer.parseInt(sc.nextLine());
		return selectShop;
	}
	public int menuNum() {
		int selectFood = Integer.parseInt(sc.nextLine());
		return selectFood;
	}
	
	
	
	
	
	public String selectShop(int shopNum) {
		return SHOP[shopNum];
	}
	public String[] getSHOP() {
		return SHOP;
	}
	public String[] getFOODS() {
		return FOODS;
	}
	public String selectFoods(int menuNum) {
		return FOODS[menuNum];
	}
	
}
