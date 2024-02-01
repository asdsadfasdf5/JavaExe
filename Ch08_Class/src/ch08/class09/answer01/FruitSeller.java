package ch08.class09.answer01;

public class FruitSeller {
	private int numOfApple;			//사과개수
	private int saleMoney;			//판매금액
		//사과가격 (상수)
	
	public FruitSeller(int numOfApple) {
		this.numOfApple = numOfApple;
	}
//	public int saleApple(int money) {
//		int num = money/APPLE_PRICE;
//		numOfApple -= num;
//		saleMoney += money;
//		return num;
//	}
	public void saleApple(FruitBuyer buyer,int money) {
		//환불이라고 생각하고 설계 / 판매자가 -> 구매자한테 되돌린다.
		//돈을 증가시키고, 받은돈/사과가격=> 사과개수를 증가시킨다.
		//seller.saleApple(buyer, 2000);
//		int count = money/APPLE_PRICE; 
		int count = buyer.buyApple(money); 
		numOfApple += count;
		saleMoney += money;
	}
	
	public void showSaleResult() {
		System.out.println("*** 과일 판매자의 현재 상황 ***");
		
		//this를 붙여도 되고 안붙여도 됨
		System.out.println("남은 사과 : "+ numOfApple ); 
		System.out.println("판매 수익 : "+ saleMoney );
		
	}
	
}
