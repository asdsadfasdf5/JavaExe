package ch12.sec03.exam02;

public class HashCodeExample {

	public static void main(String[] args) {
		Student s1 = new Student(1, "홍길동");
		Student s2 = new Student(1, "홍길동");
		Student s3 = new Student(2, "홍길동");
		
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		System.out.println(s3.hashCode());
		

		if(s1.hashCode() == s2.hashCode()) {//해시코드가 동일한지 검사
//			if(s1의 주소값 == s2의 주소값)
			if(s1.equals(s2)) {
//				if(s1(1, "홍길동" ) == s2(1, "홍길동" ))
				// 데이터가 동일한지 검사
				System.out.println("동등객체입니다.");
			
			}else {
				System.out.println("데이터가 다르므로 동등 객체가 아닙니다.");
			}
		}else {
			System.out.println("해시코드가 다르므로 동등 객체가 아닙니다.");
			
		}
	}

}
