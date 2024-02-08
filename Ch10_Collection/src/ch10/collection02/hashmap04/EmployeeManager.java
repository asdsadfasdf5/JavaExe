package ch10.collection02.hashmap04;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class EmployeeManager {
	private final int EMP_NUM = 100; // 최대 100명의 ㅅㅏ원
	// Employee의 자식객체들을 저장
	private Employee[] empArr = new Employee[EMP_NUM];
	private HashMap<String, Employee> eHashMap = new HashMap<>();
	private int numOfEmp = 0; // 저장된 사원객체 수 & 다음 사원이 저장될 인덱스
	private Scanner sc = new Scanner(System.in);

	private int viewMenu() {
		System.out.println("[ 사원 선택 ]");
		System.out.println("1. 정규직");
		System.out.println("2. 계약직");
		System.out.println("3. 일용직");
		System.out.println("4. 전체정보보기");
		System.out.println("5. 정규직 보기");
		System.out.println("6. 계약직 보기");
		System.out.println("7. 일용직 보기");
		System.out.println("8. 종료");
		System.out.println("번호 입력 >>");
		int sel = Integer.parseInt(sc.nextLine());
		return sel;
	}

	private RegularEmployee createRegularEmployee() {
		System.out.println("사번 >>");
		String empno = sc.nextLine();
		System.out.println("이름 >>");
		String name = sc.nextLine();
		System.out.println("연봉 >>");
		int yearSalary = Integer.parseInt(sc.nextLine());
		System.out.println("보너스 >>");
		int bonus = Integer.parseInt(sc.nextLine());

		RegularEmployee emp = new RegularEmployee(0, empno, name, yearSalary, bonus);
		return emp;

	}

	// 계약직
	private TempEmployee createTempEmployee() {
		System.out.println("사번 >>");
		String empno = sc.nextLine();
		System.out.println("이름 >>");
		String name = sc.nextLine();
		System.out.println("연봉 >>");
		int yearSalary = Integer.parseInt(sc.nextLine());
		System.out.println("게약기간 >>");
		int hireYear = Integer.parseInt(sc.nextLine());
		TempEmployee emp = new TempEmployee(1, empno, name, yearSalary, hireYear);

		return emp;
	}

	private PartTimeEmployee createpartTimeEmployee() {

		System.out.println("사번 >>");
		String empno = sc.nextLine();
		System.out.println("이름 >>");
		String name = sc.nextLine();
		System.out.println("일급 >>");
		int dailyPay = Integer.parseInt(sc.nextLine());
		System.out.println("일수 >>");
		int workDay = Integer.parseInt(sc.nextLine());
		PartTimeEmployee emp = new PartTimeEmployee(2, empno, name, dailyPay, workDay);

		return emp;

	}

	private boolean saveEmployee(Employee emp) {
		boolean isSave = true;

		if (this.numOfEmp < EMP_NUM) {
			this.empArr[this.numOfEmp] = emp;
			eHashMap.put(emp.empno, emp);
			this.numOfEmp++;
			isSave = true;
		} else
			isSave = false;
		return isSave;
	}

	private void viewAllEmployeeInfo() {
		Set<String> keySet = eHashMap.keySet();
		Iterator<String> keyInterator = keySet.iterator();
		while (keyInterator.hasNext()) {
			String k = keyInterator.next();
			eHashMap.get(k).showEmployeeInfo();
		}

	}

	// 정규직 사원만 표기
	private void viewRegEmployeeInfo() {
		
		Set<String> keySet = eHashMap.keySet();
		Iterator<String> keyInterator = keySet.iterator();
		while (keyInterator.hasNext()) {
			String k = keyInterator.next();
			if (eHashMap.get(k) instanceof RegularEmployee) {
				eHashMap.get(k).showEmployeeInfo();
			}
		}

	}

	// 계약직 사원만 표기
	private void viewTempEmployeeInfo() {
		Set<String> keySet = eHashMap.keySet();
		Iterator<String> keyInterator = keySet.iterator();
		while (keyInterator.hasNext()) {
			String k = keyInterator.next();
			if (eHashMap.get(k) instanceof TempEmployee) {
				eHashMap.get(k).showEmployeeInfo();
			}
		}

	}

	// 일용직 사원만 표기
	private void viewPartEmployeeInfo() {
		Set<String> keySet = eHashMap.keySet();
		Iterator<String> keyInterator = keySet.iterator();
		while (keyInterator.hasNext()) {
			String k = keyInterator.next();
			if (eHashMap.get(k) instanceof PartTimeEmployee) {
				eHashMap.get(k).showEmployeeInfo();
			}
		}

	}

	public void run() {
		boolean isRun = true;
		while (isRun) {
			int selNum = viewMenu();
			Employee emp = null;

			switch (selNum) {
			case EmpMenu.REG_EMP -> {
				emp = createRegularEmployee();
			}
			case EmpMenu.TEMP_EMP -> {
				emp = createTempEmployee();
			}
			case EmpMenu.PART_EMP -> {
				emp = createpartTimeEmployee();
			}
			case EmpMenu.REG_INFO -> {
				emp = null;
				viewRegEmployeeInfo();
			}
			case EmpMenu.TEMP_INFO -> {
				emp = null;
				viewTempEmployeeInfo();
			}
			case EmpMenu.PART_INFO -> {
				emp = null;
				viewPartEmployeeInfo();
			}
			case EmpMenu.ALL_INFO -> {
				emp = null;
				viewAllEmployeeInfo();
			}
			case EmpMenu.EXIT -> {
				isRun = false;
				emp = null;
			}
			default -> {
				emp = null;
				System.out.println("해당 항목이 존재하지 않습니다.");
			}
			}
			if (emp != null) {
				boolean isSave = saveEmployee(emp);
				if (!isSave)
					System.out.println("더 이상 저장 공간이 없습니다.");
			}

		}
		System.out.println("Program Exit");
	}
}
