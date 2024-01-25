package logicOperator07;

public class LogicOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean logic;
		
		logic = true && true;	// AND
		System.out.println("true && true => "  + logic);
		logic = true && false;	
		System.out.println("true && false => "  + logic);
		logic = true || true;	//OR
		System.out.println("true || true => "  + logic);
		logic = true || false;
		System.out.println("true || false => "  + logic);
		logic = true ^ true;	// Xor
		System.out.println("true ^ true => "  + logic);
		logic = true ^ false;
		System.out.println("true ^ false => "  + logic);
	
		logic = !false;	// Not
		System.out.println("!false => "  + logic);
		
		
	}

}
