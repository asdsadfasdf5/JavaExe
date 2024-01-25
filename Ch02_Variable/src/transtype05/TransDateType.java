package transtype05;

public class TransDateType {

	public static void main(String[] args) {
		int total = 297;	//총점
		int stNum = 4;		//학생수
		
		double avg = 0.;	//평균
		
		System.out.println("총점은 "+total+"입니다");
		System.out.println("(정수)평균은" + (total/stNum) + "입니다");
		
		avg = total/stNum;
		System.out.println("(실수)평균은" + (avg) + "입니다");
		// (double)total : 컴파일러에 의해 정수 total은 double로 변환
		// 실수와 정수 연산의 결과는
		// 실수의 표현범위 > 정수
		// 결과값은 실수 자료형으로 나온다.
		avg = (double)total/stNum;
		System.out.println("(강제형변환)평균은" + (avg) + "입니다");

		// 다시 반대로 형변환 하려면 다시 형변환을 해줘야한다.
		int nAvg = (int)avg;
		System.out.println("정수 형변환 "+nAvg);

		// char 문자
		char ch = 'a';
		// char은 문자로 취급하지만 아스키코드로 변환이 가능하다 또는 숫자를 char로 변환이 가능하다
		System.out.println(ch);
		System.out.println((int)ch);
		System.out.println((int)'a');
		System.out.println((char)66);
		
	}

}
