package ch09.resolve14;

import java.util.Scanner;

public class Exit implements IQuestionAnswer {

	@Override
	public void qusetion() {
		String qust = "4. exit \r\n\r\n";
		System.out.println(qust);
	}

	@Override
	public void answer(Scanner sc) {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean isRun() {
		// TODO Auto-generated method stub
		return false;
	}

}
