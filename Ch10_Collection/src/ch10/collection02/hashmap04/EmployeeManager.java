package ch10.collection02.hashmap04;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class EmployeeManager {
	// Employee의 자식객체들을 저장
	private HashMap<String, Employee> eMap = new HashMap<>();
	private Scanner sc = new Scanner(System.in);

	private int viewMenu() {
		System.out.println("[ 사원 선택 ]");
		System.out.println("1. 정규직");
		System.out.println("2. 임시직");
		System.out.println("3. 일용직");
		System.out.println("4. 전체정보보기");
		System.out.println("5. 정규직 보기");
		System.out.println("6. 임시직 보기");
		System.out.println("7. 일용직 보기");
		System.out.println("8. 사번 검색");
		System.out.println("9. 사번 삭제");
		System.out.println("10. 사번 수정");
		System.out.println("11. 종료");
		System.out.println("번호 입력 >> ");
		int sel = sc.nextInt();
		return sel;
	}

	// 정규직 저장
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

	// 계약직 저장
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

	// 일용직 저장
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

	// 객체 저장
	private boolean saveEmployee(Employee emp) {
		Employee ret = eMap.put(emp.empno, emp);
		if(ret==null)
			System.out.println("새로 저장합니다.");
		else
			System.out.println("기존의 공간에 덮어씁니다.");
		
		return true;
	}

	// 전체 사원 표기
	private void viewAllEmployeeInfo() {
		Set<String> keySet = eMap.keySet();
		Iterator<String> keyInterator = keySet.iterator();
		while (keyInterator.hasNext()) {
			String k = keyInterator.next();
			eMap.get(k).showEmployeeInfo();
		}

	}

	// 정규직 사원만 표기
	private void viewRegEmployeeInfo() {

		Set<String> keySet = eMap.keySet();
		Iterator<String> keyInterator = keySet.iterator();
		while (keyInterator.hasNext()) {
			String k = keyInterator.next();
			if (eMap.get(k) instanceof RegularEmployee) {
				eMap.get(k).showEmployeeInfo();
			}
		}

	}

	// 계약직 사원만 표기
	private void viewTempEmployeeInfo() {
		Set<String> keySet = eMap.keySet();
		Iterator<String> keyInterator = keySet.iterator();
		while (keyInterator.hasNext()) {
			String k = keyInterator.next();
			if (eMap.get(k) instanceof TempEmployee) {
				eMap.get(k).showEmployeeInfo();
			}
		}

	}

	// 일용직 사원만 표기
	private void viewPartEmployeeInfo() {
		Set<String> keySet = eMap.keySet();
		Iterator<String> keyInterator = keySet.iterator();
		while (keyInterator.hasNext()) {
			String k = keyInterator.next();
			if (eMap.get(k) instanceof PartTimeEmployee) {
				eMap.get(k).showEmployeeInfo();
			}
		}

	}
	
	//재사용성이 높은 KeyGet
	private String getEmpNo() {
		System.out.println("사번 입력>>");
		String empNo = sc.next();
		return empNo;
	}
	//검색
	private void searchEmployee(String empno) {
		Employee emp = eMap.get(empno);
		if(emp !=null) {
			emp.showEmployeeInfo();
		}else {
			System.out.println("없습니다");
		}
		
	}

	//수정
	private void modifyEmployee() {
		System.out.println("Main Menu에서 사번과 정보를 입력하시면 새로 갱신됩니다~");
		sc.nextLine();
		sc.nextLine();
	}
	
	//삭제
	private void deleteEmployee(String empno) {
		Employee emp = eMap.get(empno);
		if(emp !=null) {
			emp.showEmployeeInfo();
		}else {
			System.out.println("없습니다");
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
			case EmpMenu.EMPNO_DELETE -> {
				emp = null;
				deleteEmployee(getEmpNo());
				
			}
			case EmpMenu.EMPNO_MODIFY -> {
				emp = null;
				modifyEmployee();
				
			}
			case EmpMenu.EMPNO_SEARCH -> {
				emp = null;
				searchEmployee(getEmpNo());
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
