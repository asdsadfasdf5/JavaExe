package ch13.sec05;

public class GenericExample {

	public static void main(String[] args) {
		//모든 사람이 신청 가능
		Course.registerCouse1(new Applicant<Person>(new Person()));
		Course.registerCouse1(new Applicant<Worker>(new Worker()));
		Course.registerCouse1(new Applicant<Student>(new Student()));
		Course.registerCouse1(new Applicant<HighStudent>(new HighStudent()));
		Course.registerCouse1(new Applicant<MiddleStudent>(new MiddleStudent()));
		System.out.println();
		
		//학생만 신청 가능
//		Course.registerCouse2(new Applicant<Person>(new Person()));
//		Course.registerCouse2(new Applicant<Worker>(new Worker()));
		Course.registerCouse2(new Applicant<Student>(new Student()));
		Course.registerCouse2(new Applicant<HighStudent>(new HighStudent()));
		Course.registerCouse2(new Applicant<MiddleStudent>(new MiddleStudent()));
		System.out.println();
		
		//직장인 및 일반인만 신청 가능
		Course.registerCouse3(new Applicant<Person>(new Person()));
		Course.registerCouse3(new Applicant<Worker>(new Worker()));
//		Course.registerCouse3(new Applicant<Student>(new Student()));
//		Course.registerCouse3(new Applicant<HighStudent>(new HighStudent()));
//		Course.registerCouse3(new Applicant<MiddleStudent>(new MiddleStudent()));
		System.out.println();
		
		
		
	}

}
