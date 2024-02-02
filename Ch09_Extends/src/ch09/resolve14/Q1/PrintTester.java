package ch09.resolve14.Q1;

public class PrintTester {
	final int PRINT_QUANTITY = 7; // 종이 잔량
	private Print print;
	int pNum = 0; // 인쇄종이 수
	int ppNum = 10; //인쇄 종이 잔량
	
	public PrintTester() {
	}

	public PrintTester(Print print) {
		this.print = print;
	}

	public void setPrint(Print print) {
		this.print = print;
	}

	

	public void print() {
		print.model();
		print.made();
		print.InterfaceType();
		print.printNum(pNum);
		print.quantity(print);
	
	}
	
	
}
