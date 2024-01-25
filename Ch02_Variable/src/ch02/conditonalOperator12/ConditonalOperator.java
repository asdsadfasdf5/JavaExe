package ch02.conditonalOperator12;

import java.util.Scanner;

public class ConditonalOperator {

	public static void main(String[] args) {
		int num;
		String str;
		Scanner sc = new Scanner(System.in);
		System.out.println("점수 입력");
		num = sc.nextInt();
		
		// 삼항연산자
		// 조건문 ? 참 : 거짓
		str = num >= 85? "상위권" :"하위권";
		
		
		// if 조건문
		
/**		if(num >= 85) {
//			str = "상위권";
//		}else {
//			str = "하위권";			
		}
**/		
		System.out.println(str);
		sc.close();
	}

}
