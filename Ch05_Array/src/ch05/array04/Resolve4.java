package ch05.array04;

public class Resolve4 {

	public static void main(String[] args) {
//		4. int배열을 10개 생성하세요.
//		int배열에 3의 배수를 차례대로 저장하세요.
//		그리고 거꾸로 출력하세요.
		
		int[] iArr = new int[10];
		int[] reArr = new int[10];
		
		for(int i=0;i<iArr.length;i++) {
			iArr[i] = (i+1)*3;
//			System.out.println(iArr[i]);
		}
		for(int i=0;i<reArr.length;i++) {
			reArr[i] = iArr[(iArr.length-1)-i];
			System.out.println(reArr[i]);
			
		}
	}

}
