package ch09.resolve14.Q2;

/*

   ITablet를 상속받은 
   삼성, 소니, LG는 Tablet을 구현클래스로 만들고
   OEM을 의뢰한 비트캠프는 TabletTester를 생성합니다.
   이 클래스들이 완성되면 TabletMain에서 테스트를 진행하세요.
 */
public interface ITabletMain {
	void movie();

	void music();

	void readBook();
}
