package ch09.resolve14;

import java.util.Scanner;

import ch09.resolve14.question02.ITablet;
import ch09.resolve14.question02.factory01.*;
import ch09.resolve14.question02.order01.*;

public class Answer2 implements IQuestionAnswer {

	@Override
	public void qusetion() {
		String qust = "2. ITablet 인터페이스를 만드세요.\r\n" + "   아래 메서드를 멤버로 추가하세요.\r\n" + "   void movie();\r\n"
				+ "   void music();\r\n" + "   void readBook();\r\n" + "   \r\n"
				+ "   ITablet를 상속받은 삼성, 소니, LG는 Tablet을 구현클래스로 만들고\r\n" + "   OEM을 의뢰한 비트캠프는 TabletTester를 생성합니다.\r\n"
				+ "   이 클래스들이 완성되면 TabletMain에서 테스트를 진행하세요.\r\n\r\n";
		System.out.println(qust);

	}

	@Override
	public void answer(Scanner sc) {

		TabletTester tabletTester = new TabletTester();
		ITablet[] tabletArr = new ITablet[] { new SamsungTablet(), new LgTablet(), new LenovoTablet() };
		int[] score = new int[tabletArr.length];
		for (int i = 0; i < tabletArr.length; i++) {
			tabletTester.setTablet(tabletArr[i]);
			int movie = 0, music = 0, readBook = 0;
			try {
				movie = tabletTester.movieTest();
				System.out.printf("onOffTest 테스트 점수는 %d입니다\n", score[i]);
				music = tabletTester.musicTest();
				System.out.printf("speedTest 테스트 점수는 %d입니다\n", score[i]);
				readBook = tabletTester.readBookTest();
				System.out.printf("footBreakTest 테스트 점수는 %d입니다\n", score[i]);

			} catch (Exception ex) {
				ex.printStackTrace();
			}

			score[i] = movie + music + readBook;
			System.out.printf("전체 테스트 점수는 %d입니다\n", score[i]);
			System.out.println("--------------------------------------");
		}
		// 가장 큰 점수를 받은 값과 인덱스 찾기
		int max = score[0];
		int maxIdx = 0;
		for (int i = 1; i < score.length; i++) {
			if (max < score[i]) {
				max = score[i];
				maxIdx = i;

			}
		}
		System.out.printf("가장 높은 점수를 받은 태블릿은 %d번째 태블릿이고 점수는 %d입니다\n", maxIdx + 1, max);
		System.out.println(tabletArr[maxIdx].getClass().getName());
		sc.nextLine(); // 개행문자 실행하면 실행

	}

	@Override
	public boolean isRun() {
		// TODO Auto-generated method stub
		return true;
	}

}
