package ch08.class09;

//2. 나는 마트에 가서 5000원을 주고 배 가격 2500를 샀다를 
//클래스로 설계해서 프로그래밍 하세요
public class Resolve3_3 {
	private int userMoney;
	private int userNumOfBAE;

	public Resolve3_3(int money) {
		this.userMoney = money;
		this.userNumOfBAE = 0;
	}

	public void buyBae(Resolve3_2 seller, int money) {
		this.userNumOfBAE += seller.sellBae(money); // 배 갯수 전달
		this.userMoney -= money;

	}

	public void showBuyResult() {
		System.out.println("*** 나의 현재 상황 ***");
		System.out.println("현재 잔액 : " + userMoney);
		System.out.println("내가 산 배 개수 : " + userNumOfBAE);
	}

}
