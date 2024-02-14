package ch15.thread01.ch14.sec06.exam02;

public class WorkObject {
	public synchronized void methodA() {
		Thread thread = Thread.currentThread();
		System.out.println(thread.getName()+ ": methodA 작업 실행");
		//try/catch문을 주석 처리하면 ThreadA와 B가 제각각 동작한다.
		notify();
		try {
			wait();
		} catch (Exception e) {}
	}
	
	
	public synchronized void methodB() {
		Thread thread = Thread.currentThread();
		System.out.println(thread.getName()+ ": methodB 작업 실행");
		notify();
		try {
			wait();
		} catch (Exception e) {}
	}
	
}
