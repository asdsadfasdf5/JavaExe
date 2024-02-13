package ch15.thread01.ch14.sec07.exam03;

public class PrintThread extends Thread {
	@Override
	public void run() {
		
			while (true) {
				System.out.println("실행중");
				if(Thread.interrupted()) {
					break;
				}
			}

		
		System.out.println("리소스 정리");
		System.out.println("실행종료");
	}
}
