package ch09.hasa08;

public class Police {
	
	private int clothes;

	public Police(int clothes) {

		this.clothes = clothes;
	}

	public void putHandCuff() {
		if (clothes > 0) {
			System.out.println("^^");
			clothes--;
		} else {
			System.out.println("TT");
		}
	}
}
