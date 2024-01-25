package ch02.InDecOperator11;

public class InDecOperator {

	public static void main(String[] args) {
		int num = 0;
		System.out.println(num);;
		num++;
		System.out.println(num);;
		++num;
		System.out.println(num);;
		
		int result = num++;
		System.out.println("result = "+ result);
		
		System.out.println("num = " + num);
		
//		num++ : 값을 대입후 증가
//		++num : 증가 후 값을 대입
	
	}

}
