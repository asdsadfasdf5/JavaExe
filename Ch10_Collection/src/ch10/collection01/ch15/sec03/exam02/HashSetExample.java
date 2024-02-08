package ch10.collection01.ch15.sec03.exam02;

import java.util.HashSet;
import java.util.Set;

class HashSetExample {

	public static void main(String[] args) {
		//HashSet 컬렉센 생성
		Set<Member> set = new HashSet<Member>();
		
		//Member 객체 저장
		set.add(new Member("홍길동",30));
		set.add(new Member("홍길동",30)); 
		//내부에서 hashCode() -> equals() 비교
		
		/*
		 * 다른 컬렉션들도 Iterator인터페이스 상속을 받아 구현하였다.
		 * Iterator는 데이터의 처음부터 계속 끝까지 가져오는데 사용한다.
		 * 	
		 */
		
		//저장된 객체 수 출력
		System.out.println("총 객체 수 : " + set.size());
		
	}

}
