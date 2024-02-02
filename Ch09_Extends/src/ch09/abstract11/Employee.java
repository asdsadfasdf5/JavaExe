package ch09.abstract11;

public abstract class Employee {
	protected String empno; // 사번
	protected String name; // 이름
	protected final int FIX_EMP_CODE;

	public Employee(int FIX_EMP_CODE,String empno, String name) {
		this.FIX_EMP_CODE = FIX_EMP_CODE;
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
