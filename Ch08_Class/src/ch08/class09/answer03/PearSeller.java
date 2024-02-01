package ch08.class09.answer03;

//2. 나는 마트에 가서 5000원을 주고 배 가격 2500를 샀다를 
//클래스로 설계해서 프로그래밍 하세요
public class PearSeller {
	private int userMoney;
	private int userNumOfPEAR;

	public PearSeller(int money) {
		this.userMoney = money;
		this.userNumOfPEAR = 0;
	}

	public void buyPear(PearBuyer seller, int money) {
		this.userNumOfPEAR += seller.sellPear(money); // 배 갯수 전달
		this.userMoney -= money;

	}

	public void showBuyResult() {
		System.out.println("*** 나의 현재 상황 ***");
		System.out.println("현재 잔액 : " + userMoney);
		System.out.println("내가 산 배 개수 : " + userNumOfPEAR);
	}

}
