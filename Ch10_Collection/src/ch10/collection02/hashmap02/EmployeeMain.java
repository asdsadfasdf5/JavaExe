package ch10.collection02.hashmap02;

public class EmployeeMain {
	public static void testInstanceOf() {
		
		// instanceof를 사용하면 객체 == 객체 또는 자식 객체로 비교해주기때문에 간단하게 비교가능하다.
		RegularEmployee regEmp = new RegularEmployee(0,"111", "이름", 7000, 3000);

		Employee emp = regEmp;

		if (emp instanceof RegularEmployee) {
			System.out.println("emp는 RegularEmployee의 객체이거나 자식객체입니다.");
		}

		if (emp instanceof TempEmployee) {
			System.out.println("emp는 TempEmployee의 객체이거나 자식객체입니다.");
		}

		if (emp instanceof PartTimeEmployee) {
			System.out.println("emp는 PartTimeEmployee의 객체이거나 자식객체입니다.");
		}

	}

	public static void main(String[] args) {
		EmployeeManager em = new EmployeeManager();
		em.run();
		
		testInstanceOf();
	}
}
