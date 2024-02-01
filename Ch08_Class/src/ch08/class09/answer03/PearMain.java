package ch08.class09.answer03;

//2. 나는 마트에 가서 5000원을 주고 배 가격 2500를 샀다를 
//클래스로 설계해서 프로그래밍 하세요
public class PearMain {
//나, 마트
//나:5000원, 마트 배 가격: 2500원
//	나 객체, 마트 객체
//	
	public static void main(String[] args) {

		PearBuyer seller = new PearBuyer(); // 마트
		PearSeller buyer = new PearSeller(5000); // 구매자 나 5천원 줌

		seller.showSaleResult();
		buyer.showBuyResult();
		System.out.println();

		buyer.buyPear(seller, 5000);
		System.out.println("@@@@@@@@@@@@@@@  배 다 산다   @@@@@@@@@@@@@@@@@@@");
		seller.showSaleResult();
		buyer.showBuyResult();
	}

}
