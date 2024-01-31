package ch08.class07;

import java.util.Scanner;

public class RestaurantMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Restaurant rest = new Restaurant(sc, "새마을 식당",
				new String[]{"연탄불고기","소금구이","차돌박이"});
		rest.viewMenu();
		rest.selectFood();
		rest.deliveryFood();

		Restaurant rest1 = new Restaurant(sc, "낙원 식당",
				new String[]{"낙원고기","낙원구이","낙원돌박이"});
		rest1.viewMenu();
		rest1.selectFood();
		rest1.deliveryFood();
		
		Restaurant rest2 = new Restaurant(sc, "소호정 식당",
				new String[]{"소호정연탄불고기","소호정소금구이","소호정차돌박이"});
		rest2.viewMenu();
		rest2.selectFood();
		rest2.deliveryFood();
		
		sc.close();
	}

}
