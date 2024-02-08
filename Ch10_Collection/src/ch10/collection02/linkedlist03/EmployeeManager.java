package ch10.collection02.linkedlist03;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class EmployeeManager {
	private final int EMP_NUM = 100;	// 100명 사원이 최대
	// Employee의 자식객체들을 저장
//	private Employee[] empArr = new Employee[EMP_NUM];
	private List<Employee> empLinkArr = new LinkedList<>();
	
	private int numOfEmp = 0;	// 저장된 사원객체 수, 다음 사원이 저장될 index
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
		System.out.println("8. 종료");
		System.out.println("9. 검색");
		System.out.println("10. 수정");
		System.out.println("11. 삭제");
		System.out.println("번호 입력 >> ");
		int sel = Integer.parseInt(sc.next());
		return sel;
	}
	
	private String searchLinedList() {
		System.out.println("찾는 사번 검색해주세요");
		String sabun = sc.next();
		
		return sabun;
	}
	private void insertLinedList() {
		System.out.println("찾는 사번 검색해주세요");
		String sabun = sc.next();
		
		
	}
	private void deleteLinedList() {
		System.out.println("찾는 사번 검색해주세요");
		String sabun = sc.next();
		
		
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
		RegularEmployee emp = 
				new RegularEmployee(empno, name, yearSalary, bonus);
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
		TempEmployee emp = 
				new TempEmployee(empno, name, yearSalary, hireYear);
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
		PartTimeEmployee emp = 
				new PartTimeEmployee(empno, name, dailyPay, workDay);
		return emp;
	}
	private boolean saveEmployee(Employee newEmp) {
		System.out.println("saveEmp_Start");
		for(int i=0;i<empLinkArr.size();i++) {
			Employee emp = empLinkArr.get(i);
			if(emp.empno.equals(newEmp.empno)) {
				System.out.println("if_saveEmp_Start");
				System.out.println("같은 사번입니다.");
			}else {
				System.out.println("else_saveEmp_Start");
				empLinkArr.add(emp);
			}
		}
		System.out.println("saveEmp_End");
		
		
		return true;
	}
	private void viewAllEmployeeInfo() {
//		for(int i=0;i<this.empLinkArr.size();i++) {
////			this.empArr[i].showEmployeeInfo();
//			this.empLinkArr.get(i).showEmployeeInfo();
//		}
		for(Employee i : empLinkArr) {
			i.showEmployeeInfo();
		}
	}
	private void viewRegEmployeeInfo() {
		for(int i=0;i<this.empLinkArr.size();i++) {
			Employee emp = this.empLinkArr.get(i);
			if(emp instanceof RegularEmployee)
				this.empLinkArr.get(i).showEmployeeInfo();
		}
	}
	private void viewTempEmployeeInfo() {
		for(int i=0;i<this.numOfEmp;i++) {
			Employee emp = this.empLinkArr.get(i);
			if(emp instanceof TempEmployee)
				this.empLinkArr.get(i).showEmployeeInfo();
		}
	}
	private void viewPartTimeEmployeeInfo() {
		for(int i=0;i<this.numOfEmp;i++) {
			Employee emp = this.empLinkArr.get(i);
			if(emp instanceof PartTimeEmployee)
				this.empLinkArr.get(i).showEmployeeInfo();
		}
	}
	public void run() {
		boolean isRun = true;
		while(isRun) {
			int selNum = viewMenu();
			Employee emp = null;
			
			switch(selNum) {
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
				searchLinedList();
				break;
			case EmpMenu.CHANGE:
				
				break;
			case EmpMenu.DELETE:
				
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
			if(emp != null) {
				boolean isSave = saveEmployee(emp);
				if(!isSave)
					System.out.println("더 이상 저장 공간이 없습니다.");
			}
		}
		System.out.println("Program Exit...");
	}
}






