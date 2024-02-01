package ch09.resolve07.answer05;


/*
 * 클래스 설계에서 접근권한 설정
 * 1) 필드  -> private
 * 	  메서드 -> public
 * 2) 메서드 중에서 내부에서만 사용하는 메서드 -> private
 */
public class Child {
	private int ballCnt;

	// 1) 어린아이가 가지고 있는 구슬 개수 정보를 담을 수 있다
	public Child(int ballCnt) {
		this.ballCnt = ballCnt;
	}

//	2) 놀이를 통한 구슬의 주고받음을 표현하는 메소드가 존재한다
	public void give(Child other, int cnt) {
		sub(cnt);
//		other.sub(cnt);
	}

	public void get(Child other, int cnt) {
		add(cnt);
//		other.add(cnt);
	}

	private void add(int cnt) {
		this.ballCnt += cnt;
	}

	private void sub(int cnt) {
		this.ballCnt -= cnt;
	}

//	 3) 어린이의 현재 구슬 개수를 출력하는 메소드가 존재한다.
	public int getBallCnt() {
		return ballCnt;
	}

}
