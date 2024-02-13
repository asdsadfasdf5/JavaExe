package ch15.thread01.ch14.sec06.exam02;

public class ThreadB extends Thread{
	private WorkObject workObjedt;
	
	public ThreadB(WorkObject workObject) {
		setName("ThreadB");
		this.workObjedt = workObject;
	}
	@Override
	public void run() {
		for(int i=0;i<10;i++) {
			workObjedt.methodB();
		}
	}
	
}

