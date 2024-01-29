package ch06.method01;

import java.util.Scanner;

public class Resolve4 {
	
/*
 4. gugudan(3);
   
   구구단 메서드를 void 리턴형으로 제작하세요.
  3을 입력하면 3단이 출력됩니다.
 */
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("gugudan insert Gu");
		gugudan(sc.nextInt());
		
		sc.close();
	}
	
	public static void gugudan(int a) {
		
		for(int i=1;i<10;i++) System.out.println(a+"*"+i+"= "+a*i );
		
	
	}

}
