package ch15.thread01.ch14.sec05.exam02;

public class JoinExample {

	public static void main(String[] args) {
		
		SumThread sumThread = new SumThread();
		sumThread.start();
		try {
			sumThread.join();
		} catch (InterruptedException e) {
			e.getMessage();
		}
		System.out.println("1~100합 : "+sumThread.getSum());
	}

}
