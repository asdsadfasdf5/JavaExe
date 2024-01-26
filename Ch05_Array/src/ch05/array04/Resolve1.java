package ch05.array04;

public class Resolve1 {

	public static void main(String[] args) {
		// 1. String 배열을 10명의 이름으로 초기화하고 순서대로 출력하세요
		
		String[] name = {"김","이","박","최","유","백","강","재","현","오"};
		
		
		for(int i=0;i<name.length;i++) {
			
			System.out.println((i+1)+". "+name[i]);
		}
	}

}
