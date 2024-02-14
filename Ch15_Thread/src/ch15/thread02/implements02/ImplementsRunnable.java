package ch15.thread02.implements02;

/*
 * ShowNameThread은 이미 OwnName을 상속 받았으므로
 * Thread의 상속을 받을 수 없다.
 * 이 때는 Runnable을 상속받는다.
 */
class OwnName {
	private String ownName;

	public String getOwnName() {
		return ownName;
	}

	public void setOwnName(String ownName) {
		this.ownName = ownName;
	}

}

public class ImplementsRunnable {
	public static void main(String[] args) {
		// Thread 2개가 vm에 할당되어 준비하고 있는 상태
		ShowOwnNameThread s1 = new ShowOwnNameThread("철수");
		ShowOwnNameThread s2 = new ShowOwnNameThread("영수");
		ShowOwnNameThread s3 = new ShowOwnNameThread("은수");
		ShowOwnNameThread s4 = new ShowOwnNameThread("인수");
		
		// 스레드를 동작( run()을 호출 )
		System.out.println("t1 Thread start");
		Thread t1 = new Thread(s1); t1.start();
		
		System.out.println("t2 Thread start");
		Thread t2 = new Thread(s2); t2.start();
		
		System.out.println("t3 Thread start");
		Thread t3 = new Thread(s3); t3.start();
		
		System.out.println("t4 Thread start");
		Thread t4 = new Thread(s4); t4.start();
		
		System.out.println("main Thread end");

	}

}

class ShowOwnNameThread extends OwnName implements Runnable{
	public ShowOwnNameThread(String OwnName) {
		setOwnName(OwnName);
	}
	@Override
	public void run() {
		for (int i = 0; i < 100; i++) {
			System.out.println("안녕하세요: " + this.getOwnName());

			try {
				Thread.sleep(50);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}