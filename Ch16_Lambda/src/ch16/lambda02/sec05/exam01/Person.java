package ch16.lambda02.sec05.exam01;

public class Person {
	public void action(Calcuable calcuable) {
		double result = calcuable.calc(10, 4);
		System.out.println("result : "+result);
	}
}
