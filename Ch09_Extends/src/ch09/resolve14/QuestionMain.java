package ch09.resolve14;

import java.util.Scanner;

public class QuestionMain {

	IQuestionAnswer[] qaArr = { new Answer1(), new Answer2(), new Answer3(), new Exit() };

	public int getSelectQuestion(Scanner sc) {
		System.out.println("문제 번호 입력 > ");
		int num = Integer.parseInt(sc.nextLine());
		return num;
	}

	public void printQuestion() {
		for (int i = 0; i < qaArr.length; i++) {
			qaArr[i].qusetion();
		}
	}

	public static void main(String[] args) {
		boolean isRun = true;
		QuestionMain qm = new QuestionMain();

		Scanner sc = new Scanner(System.in);
		while (isRun) {
			qm.printQuestion();
			int sel = qm.getSelectQuestion(sc);
			// 1이상 ~ 3이하
			if (sel >= 1 && sel <= qm.qaArr.length) {
				// 0이상 ~ 2이하
				IQuestionAnswer iqa = qm.qaArr[sel - 1];
				iqa.answer(sc);
				isRun = iqa.isRun();

			} else {
				System.out.println("문제 번호 잘 못 선택");
				sc.nextLine();
			}

			System.out.println("Program End");
		}
		


		sc.close();
	}

}
