package ch15.thread01.ch14.sec07.exam02;

public class InterruptExample {

	public static void main(String[] args) {
		Thread thread = new PrintThread();
		thread.start();
		
		try {
			thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO: handle exception
		}
		thread.interrupt();

	}

}
