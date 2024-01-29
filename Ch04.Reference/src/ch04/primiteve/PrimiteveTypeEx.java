package ch04.primiteve;

public class PrimiteveTypeEx {

	public static void main(String[] args) {
//		아래 변수는 Stack에 생성되었다가
//		main의 영역을 벗어나면 Stack에서 사라진다.
//		지역변수라고 한다.
		byte b = 10;
		char ch = 'A';
		short s = 10000;
		int i = 99999999;
		long l = 999999999999999L;
		float f = 3.14f;
		double d = 3.14;
		System.out.printf("byte Size   : %d\n",Byte.SIZE);
		System.out.printf("char Size   : %d\n",Character.SIZE);
		System.out.printf("short Size  : %d\n",Short.SIZE);
		System.out.printf("int Size    : %d\n",Integer.SIZE);
		System.out.printf("long Size   : %d\n",Long.SIZE);
		System.out.printf("float Size  : %d\n",Float.SIZE);
		System.out.printf("double Size : %d\n",Double.SIZE);
	}

}
