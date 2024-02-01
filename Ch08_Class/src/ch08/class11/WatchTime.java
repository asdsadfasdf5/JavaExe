package ch08.class11;

/*
 *  메서드(함수)의 오버로딩(overloding)
 *  JAVA는 함수의 이름은 동일하지만 매개변수가 다른 함수를 여러 개 만들 수 있다.
 *  실행할 때 매개변수의 종류에 따라 함수를 구별할 수 있기 때문에
 */

public class WatchTime {
	private int hour, min, sec;

	public WatchTime(int hour, int min, int sec) {
		System.out.println("this : " + this);
		this.hour = hour;
		this.min = min;
		this.sec = sec;

	}

	public void viewTime() {

		System.out.printf("[%02d:%02d:%02d]\n", hour, min, sec);
	}

	public static void main(String[] args) {
		WatchTime wtNum = new WatchTime(12, 13, 33);
		System.out.println("WtNum : " + wtNum);
		System.out.printf("WtNum :%x\n ", wtNum.hashCode());
		wtNum.viewTime(); // 호출될때 viewTime(stNum);된다/ 컴파일시에

		WatchTime wtNum1 = new WatchTime(122, 133, 333);
		System.out.println("WtNum1 : " + wtNum);
		System.out.printf("WtNum1 :%x\n ", wtNum.hashCode());
		wtNum.viewTime();

	}
}