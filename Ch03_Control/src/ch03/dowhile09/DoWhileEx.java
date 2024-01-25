package ch03.dowhile09;

public class DoWhileEx {

	public static void main(String[] args) {
		// 1~10까지 출력
		// do while은 최소 한번 무조건 실행먼저 하고 조건을 검사하는 것
	
		int i = 1; 					//초기값
		do {
			System.out.println(i);	//실행
			i++;					//증가
		}while(i <= 10);			//조건

	}

}
