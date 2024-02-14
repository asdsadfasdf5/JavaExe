package ch16.lambda02.sec05.exam02;

public class MethodReferenceExample {

	public static void main(String[] args) {
		Person person = new Person();
		person.ordering(String :: compareToIgnoreCase);

	}

}
