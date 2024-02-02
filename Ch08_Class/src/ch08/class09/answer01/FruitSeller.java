package ch08.class09.answer01;

public class FruitSeller {
	private int numOfApple; //사과 개수
	private int saleMoney;	//판매 금액
	
	public FruitSeller(int numOfApple) {
		this.numOfApple = numOfApple;
	}
	
	public int saleApple(FruitBuyer buyer, int money) {
		//구매자의 사과구매함수를 호출 판매자의 money를 인자값으로 전달해준다. 
		//num에 함수호출해서 리턴받은값을 저장한다
		int num = buyer.buyApple(money);
		numOfApple -= num;
		saleMoney += money;
		return num;
	}
	
	public void showSaleResult() {
		System.out.println("*** 과일 판매자의 현재 상황 ***");
		System.out.println("남은 사과 : " + numOfApple);
		System.out.println("판매 수익 : " + saleMoney);
	}
	
	
}
