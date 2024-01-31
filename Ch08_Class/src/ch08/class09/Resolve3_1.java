package ch08.class09;

//2. 나는 마트에 가서 5000원을 주고 배 가격 2500를 샀다를 
//클래스로 설계해서 프로그래밍 하세요
public class Resolve3_1 {
//나, 마트
//나:5000원, 마트 배 가격: 2500원
//	나 객체, 마트 객체
//	
	public static void main(String[] args) {

		Resolve3_2 seller = new Resolve3_2(); // 마트
		Resolve3_3 buyer = new Resolve3_3(5000); // 구매자 나 5천원 줌

		seller.showSaleResult();
		buyer.showBuyResult();
		System.out.println();

		buyer.buyBae(seller, 5000);
		System.out.println("배 다 산다");
		seller.showSaleResult();
		buyer.showBuyResult();
	}

}
