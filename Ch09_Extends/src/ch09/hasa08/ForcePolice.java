package ch09.hasa08;

public class ForcePolice extends Police {
	private int handCuffs;
	private Gun gun;
	public ForcePolice(int cloth,int bullet, int handCuffs) {
		super(cloth);
		this.handCuffs = handCuffs;
		gun = new Gun(bullet);
	}
	
	
	public void run() {
		System.out.println("Running!");

	}

	public void fight() {
		System.out.println("Fight!");

	}
	public void putOnHandCuffs() {
		if(this.handCuffs > 0) {
			System.out.println("SNAP");
			this.handCuffs--;
		}else {
			System.out.println("MISS..");
		}
	}
	public void shot() {
		gun.shot();
	}
}
