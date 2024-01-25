package ch04.control08;

public class WhileEx {

	public static void main(String[] args) {
		// while : ~동안
		
		int i = 0;		//초기식
		
		while(i<1000) { 	// 조건(종료:언제까지)
			i++;		//증감식
			System.out.print(i + ", ");
			
//			System.out.print(i); //실행문
//			if(!(i>=10)) System.out.print(", "); 
		}
	}

}
