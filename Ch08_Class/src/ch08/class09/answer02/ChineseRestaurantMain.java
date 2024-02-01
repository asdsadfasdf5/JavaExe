package ch08.class09.answer02;

import java.util.Scanner;

public class ChineseRestaurantMain {
// 2. 중화요리집을 임의대로 클래스로 만드세요
	public static void main(String[] args) {
		// 1-1. 1. 중화요리집을 보여준다.
		// 1-2. 1. 메뉴판을 보여준다 2.메뉴판중에서 선택을한다 3.선택한 메뉴를 출력한다.
		Scanner sc = new Scanner(System.in);

		ChineseRestaurant rest = new ChineseRestaurant(sc);

		// 중국집 선택 텍스트 출력
		// 중국집 출력리스트 배열형태로 바꿔야함
		for (String tmp : rest.getSHOP()) {
			System.out.print(tmp + "| ");
		}
		System.out.println();
		System.out.println("중국집 선택하세요.");

		// 중국집 선택 
		int sNum = rest.shopNum();	

		// 선택한 중국집의 메뉴 출력 따로 변수로 만들어서 가져오는게 아닌 객체형태로 불러올때 배열을 집어넣기
		System.out.println("선택한 중국집은 : "+rest.selectShop(sNum));
		// 메뉴 배열 출력
		for (String tmp : rest.getFOODS()) {
			System.out.print(tmp + "| ");
		}
		System.out.println("메뉴를 선택하세요");
		int selectFood = rest.menuNum();	
		// 메뉴 선택 
		int mNum = rest.menuNum();
		// 선택 메뉴 출력
		System.out.println("선택한 중국집은 : "+rest.selectFoods(mNum));

	}

}
