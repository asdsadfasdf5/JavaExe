package ch10.collection02.hashmap04;

public abstract class Employee {
	protected String empno; // 사번
	protected String name; // 이름

	public Employee(String empno, String name) {
		this.empno = empno;
		this.name = name;
	}

	public void showEmployeeInfo() {
		System.out.println("-------------------------");
		System.out.println("smpno : " + empno);
		System.out.println("name : " + name);
	}

	public abstract double getMonthPay(); // 추상메서드
}
