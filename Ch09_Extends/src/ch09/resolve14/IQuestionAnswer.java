package ch09.resolve14;

import java.util.Scanner;

public interface IQuestionAnswer {
	void qusetion(); 			//문체출력
	void answer(Scanner sc); 	//해답풀이
	public boolean isRun();		//계속진행 여부
}
