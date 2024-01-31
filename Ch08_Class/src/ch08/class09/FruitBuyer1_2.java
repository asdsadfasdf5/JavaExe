package ch08.class09;

public class FruitBuyer1_2 {
	private int money;
	private int numOfApple;
	
	public FruitBuyer1_2(int money) {
		this.money = money;
		this.numOfApple= 0;
		
	}
	public void buyApple(int money) {
		
	}
	
//	public void buyApple(FruitSeller seller, int money) {
//		this.numOfApple += seller.saleApple(money);
//		this.money -= money;
//	}
	public void showBuyResult() {
		System.out.println("*** 과일 구매자의 현재 상황 ***");
		System.out.println("현재 잔액 : "+ money ); 
		System.out.println("사과 개수 : "+ numOfApple );
	}
}
