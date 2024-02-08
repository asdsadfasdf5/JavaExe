package ch10.collection02.linkedlist03;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class EmployeeManager {
	private List<Employee> empLinkedList = new LinkedList<>();
	private Scanner sc = new Scanner(System.in);
	private String sabun = "";

	private int viewMenu() {
		System.out.println("[ 사원 선택 ]");
		System.out.println("1. 정규직");
		System.out.println("2. 임시직");
		System.out.println("3. 일용직");
		System.out.println("4. 전체정보보기");
		System.out.println("5. 정규직 보기");
		System.out.println("6. 임시직 보기");
		System.out.println("7. 일용직 보기");
		System.out.println("8. 종료");
		System.out.println("9. 검색");
		System.out.println("10. 수정");
		System.out.println("11. 삭제");
		System.out.println("번호 입력 >> ");
		int sel = Integer.parseInt(sc.next());
		return sel;
	}

	private void searchLinkedList() {
		System.out.println("찾는 사번 검색해주세요");
		// 사번을 가져오기
		String sabun = sc.next();

		for (int i = 0; i < empLinkedList.size(); i++) {
			Employee emp = empLinkedList.get(i);

			if (emp.empno.equals(sabun)) {
				System.out.println("찾으시는 사번 "+"["+sabun+"]");
				empLinkedList.get(i).showEmployeeInfo();
			}
		}

	}



	private void deleteLinkedList() {
		System.out.println("찾는 사번 검색해주세요");
		sabun = sc.next();
		for (int i = 0; i < empLinkedList.size(); i++) {
			Employee emp = empLinkedList.get(i);

			if (emp.empno.equals(sabun)) {
				System.out.println("삭제하려는 사번 "+"["+sabun+"]");
				empLinkedList.remove(i);
				System.out.println("["+sabun+"] 삭제완료");
			}
		}
		viewAllEmployeeInfo();
	}

	private RegularEmployee createRegularEmployee() {
		System.out.print("사번 >> ");
		String empno = sc.next();
		System.out.print("이름 >> ");
		String name = sc.next();
		System.out.print("연봉 >> ");
		int yearSalary = sc.nextInt();
		System.out.print("보너스 >> ");
		int bonus = sc.nextInt();
		RegularEmployee emp = new RegularEmployee(empno, name, yearSalary, bonus);
		return emp;
	}

	private TempEmployee createTempEmployee() {
		System.out.print("사번 >> ");
		String empno = sc.next();
		System.out.print("이름 >> ");
		String name = sc.next();
		System.out.print("연봉 >> ");
		int yearSalary = sc.nextInt();
		System.out.print("계약기간 >> ");
		int hireYear = sc.nextInt();
		TempEmployee emp = new TempEmployee(empno, name, yearSalary, hireYear);
		return emp;
	}

	private PartTimeEmployee createPartTimeEmployee() {
		System.out.print("사번 >> ");
		String empno = sc.next();
		System.out.print("이름 >> ");
		String name = sc.next();
		System.out.print("일당 >> ");
		int dailyPay = sc.nextInt();
		System.out.print("일한 일수 >> ");
		int workDay = sc.nextInt();
		PartTimeEmployee emp = new PartTimeEmployee(empno, name, dailyPay, workDay);
		return emp;
	}

	private boolean saveEmployee(Employee newEmp) {
		boolean isSave = false;
		for (int i = 0; i < empLinkedList.size(); i++) {
			Employee emp = empLinkedList.get(i);
			if (emp.empno.equals(newEmp.empno)) {
				System.out.println("기존의 사번을 삭제하고 새로운 사번을 등록합니다.");
				empLinkedList.remove(i);
				empLinkedList.add(i, newEmp);
				isSave = true;
				break;
			}
		}
		if (!isSave) {
			System.out.println("사원을 추가합니다.");
			isSave = empLinkedList.add(newEmp);
		}
		return isSave;
	}

	private void viewAllEmployeeInfo() {

		for (Employee i : empLinkedList) {
			i.showEmployeeInfo();
		}
	}

	private void viewRegEmployeeInfo() {
		for (int i = 0; i < empLinkedList.size(); i++) {
			Employee emp = empLinkedList.get(i);
			if (emp instanceof RegularEmployee) {
				emp.showEmployeeInfo();
			}
		}
	}

	private void viewTempEmployeeInfo() {
		for (int i = 0; i < empLinkedList.size(); i++) {
			Employee emp = empLinkedList.get(i);
			if (emp instanceof TempEmployee) {
				emp.showEmployeeInfo();
			}
		}
	}

	private void viewPartTimeEmployeeInfo() {
		for (int i = 0; i < empLinkedList.size(); i++) {
			Employee emp = empLinkedList.get(i);
			if (emp instanceof PartTimeEmployee) {
				emp.showEmployeeInfo();
			}
		}
	}

	public void run() {
		boolean isRun = true;
		while (isRun) {
			int selNum = viewMenu();
			Employee emp = null;

			switch (selNum) {
			case EmpMenu.REG_EMP:
				emp = createRegularEmployee();
				break;
			case EmpMenu.TEMP_EMP:
				emp = createTempEmployee();
				break;
			case EmpMenu.PART_EMP:
				emp = createPartTimeEmployee();
				break;
			case EmpMenu.ALL_INFO:
				emp = null;
				viewAllEmployeeInfo();
				break;
			case EmpMenu.REG_INFO:
				viewRegEmployeeInfo();
				break;
			case EmpMenu.TEMP_INFO:
				viewTempEmployeeInfo();
				break;
			case EmpMenu.PART_INFO:
				viewPartTimeEmployeeInfo();
				break;
			case EmpMenu.SEARCH:
				searchLinkedList();
				break;
			case EmpMenu.CHANGE:
//				updateLinkedList();
				break;
			case EmpMenu.DELETE:
				deleteLinkedList();
				break;
			case EmpMenu.EXIT:
				emp = null;
				isRun = false;
				break;
			default:
				emp = null;
				System.out.println("해당 항목이 존재하지 않습니다.");
				break;
			}

			// emp객체가 존재한다면
			if (emp != null) {
				boolean isSave = saveEmployee(emp);
				if (!isSave)
					System.out.println("오류 발생");
			}
		}
		System.out.println("Program Exit...");
	}
}
