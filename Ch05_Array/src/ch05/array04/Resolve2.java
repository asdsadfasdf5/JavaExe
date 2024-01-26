package ch05.array04;

public class Resolve2 {

	public static void main(String[] args) {
		// 2. String 배열을 10명의 이름으로 초기화하고 역순으로 출력하세요

		String[] name = { "김", "이", "박", "최", "유", "백", "강", "재", "현", "오" };

		// 거꾸로 하는방법 0번째와 10번째의 자리를 바꾸면서 0번째는 ++를 10번째는 --를
		int nameL = name.length-1;
		
		for (int i = 0; i < name.length; i++) {
			name[i] = name[nameL-i];
			System.out.println((i+1)+". "+name[i]);
		}
	}

}
