package ch08.class09.answer03;

//2. 나는 마트에 가서 5000원을 주고 배 가격 2500를 샀다를 
//클래스로 설계해서 프로그래밍 하세요
public class PearBuyer { // 마트정보
	final int PEAR_PRICE = 2_500; // 배가격
	private int money; // 받은 돈
	private int numOfPEAR; // 배를 준 갯수

	public PearBuyer() {
		this.money = 0;
		this.numOfPEAR = 0;
	}

	public int sellPear(int money) { // 배를 삼
		int num = money / PEAR_PRICE; // 받은 돈으로 배의 갯수구함
		numOfPEAR += num; // 배를 준 갯수
		this.money += money; // 받은 돈 저장
		return num;
	}

	public void showSaleResult() {
		System.out.println("*** 마트의 현재 상황 ***");

		// this를 붙여도 되고 안붙여도 됨
		System.out.println("판매한 배 갯수 : " + numOfPEAR);
		System.out.println("판매 수익 : " + money);

	}
}
