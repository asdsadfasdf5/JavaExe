package ch15.thread02.syncerror06;

class Value {
	private int num = 0;

	public int getNum() {
		return num;
	}

	public void Increment() {
		num++;
	}
}

class IncThread extends Thread {
	private Value val;

	public IncThread(Value val) {
		this.val = val;
	}

	@Override
	public void run() {
		for(int i=0;i<100000;i++) {
			val.Increment();
		}
	}
}

public class ThreadSyncError {
	public static void main(String[] args) {
		Value val = new Value();
		IncThread it1 = new IncThread(val);
		IncThread it2 = new IncThread(val);
		
		it1.start();
		// 순서대로 하면 문제없음
		try {
			it1.join();
			
			it2.start();
			it2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("최종값 : "+val.getNum());
	}
}
