package ch08.class09;

/*
 * <class와 class간의 상호작용>
 * 요구사항 : " 사과구매자는 과일판매자한테 사과 2개를 구매했다
 * 				이것을 객체지향 프로그램으로 묘사하라
 * 1) 명사/동사 분류법
 * 		명사 : 클래스(상위개념)
 * 			 필드 (하위개념)
 * 		동사 : 메서드
 * 			 연관성있는 역할의 메서드가 많으면 클래스로 묶는다.
 * 
 * 2) MVC(역할)
 *  1979 : 제록스 팔로알토 연구소
 * 	Model 	: 데이터베이스 제어
 *  View	: 화면, 입출력
 *  Controller : 중간 연결, Business Layer, 통신
 *  
 *  Vo : 필드를 묶어놓은 개념
 *  Dto: MVC간에 메세지를 주고 받을 때 묶어서 전달하자
 */

/* 클래스 : 설계도
 * 객체 : 설계도로 만들어진 실체(object, instance)
 * 
 * 1.FruitMain클래스에		
	현재는 buyer.buyApple(seller, 2000); 처럼 프로그래밍되어
	있습니다.
	아래처럼 seller를 중심으로 수정하세요.
	seller.saleApple(buyer, 2000);
 */
public class FruitMain1_1 {
	public static void main(String[] args) {
		FruitSeller1_3 seller = new FruitSeller1_3(20);
		FruitBuyer1_2 buyer = new FruitBuyer1_2(10000);

		seller.showSaleResult();
//		buyer.showBuyResult();

//		// 구매를원하는 유저가 판매자에게 구매
//		buyer.buyApple(seller, 2000);
//		seller.showSaleResult();
//		buyer.showBuyResult();

		// 판매자가 구매를 원하는 유저에게 환불
		seller.saleApple(buyer, 2000);
		seller.showSaleResult();
//		buyer.showBuyResult();

	}
}
