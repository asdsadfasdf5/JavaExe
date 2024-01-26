package ch03.for10;

public class Resolve6 {

	public static void main(String[] args) {
		// 6. do~while문을 이용해서 1부터 10까지 합을 출력하세요
		
		int i = 1;
		int sum = 0;
		do {
			sum = sum + i;
			System.out.println("i:"+i+", sum:"+sum);
			i++;
		}while(i<=10);

	}

}
