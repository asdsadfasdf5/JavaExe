package ch03.continue11;

public class Resolve2 {

	public static void main(String[] args) {
		// for문(2중X). 별 쌓기. 1~5개까지
		// 별을 하나 더 찍기 위해서는 +=와같은 내용이 필요
		// i가 ++될때 *도 같이 늘려주는 작업이 필요
		System.out.println("---------------ver01");
		ver_one(); // version1
		System.out.println("---------------ver02");
		ver_two(); // version2
	}

	public static void ver_one() {
		for (int i = 1; i <= 5; i++) {
			String star = "*";
			if (i == 1) {
				System.out.println("*");

			} else if (i == 2) {
				System.out.println("**");

			} else if (i == 3) {
				System.out.println("***");

			} else if (i == 4) {
				System.out.println("****");

			} else if (i == 5) {
				System.out.println("*****");

			}

		}
	}

	public static void ver_two() {

		String star = "";
		for (int i = 1; i <= 5; i++) {
			star += "*";
			System.out.println(star);

		}
	}
	public static void ver_thr() {
		
		String star = "";
		for (int i = 1; i <= 5; i++) {
			star += "*";
			System.out.println(star);
			
		}
	}

}
