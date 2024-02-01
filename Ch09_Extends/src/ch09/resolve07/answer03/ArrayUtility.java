package ch09.resolve07.answer03;

public class ArrayUtility {

	// int배열을 double배열로 변환
	public static double[] intToDouble(int[] source) {
		int len = source.length;
		double[] dest = new double[len];
		for (int i = 0; i < len; i++) {
			dest[i] = (double) source[i];
		}
		return dest;
	}

	// double배열을 int배열로 변환
	public static int[] doubleToInt(double[] source) {

		int len = source.length;
		int[] dest = new int[len];
		for (int i = 0; i < len; i++) {
			dest[i] = (int) source[i];
		}
		return dest;
	}
}
