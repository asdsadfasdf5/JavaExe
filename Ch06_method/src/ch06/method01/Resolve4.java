package ch06.method01;

import java.util.Scanner;

public class Resolve4 {
	
/*
 4. gugudan(3);
   
   구구단 메서드를 void 리턴형으로 제작하세요.
  3을 입력하면 3단이 출력됩니다.
 */
	public static void main(String[] args) {
		//입력받을 스캐너 클래스 생성 및 변수생성
		Scanner sc = new Scanner(System.in);
		//입력받기전 보여줄 출력문
		System.out.println("gugudan insert Gu");
		gugudan(sc.nextInt()); // 입력받은걸 바로 메서드에 보낸다.
		
		sc.close();
	}
	
	public static void gugudan(int dan) {
		// 입력을 전달받은 a에 1~9까지 곱해서 보여주는 sysout문으로 출력하여 보여준다 값을 저장하진않음.
		for(int i=1;i<10;i++) System.out.println(dan+"*"+i+"= "+dan*i );
		
	
	}

}
