package ch10.collection01.ch15.sec03.exam01;

import java.util.HashSet;
import java.util.Set;

public class HashSetExample {
/*
 * Set은 집합이다.
 * 집합은 데이터의 모음일 뿐 '순서가 보장되지 않는다.'
 * 그러므로 중복을 허용하지 않는다( 합집합이라고 생각하면 된다.)
 * 데이터가 입력될 때 기존 데이터가 있는지 확인한다.
 * 이때 사용하는 알고리즘이 Hash알고리즘이다.
 * 
 * 검색속도는 빠르다.
 * 중복허용 X
 * 순서 보장 X
 */
	public static void main(String[] args) {
		//HashSet 컬렉션 생성
		Set<String> set = new HashSet<String>();
		
		//객체 저장
		set.add("Java");
		set.add("JDBC");
		set.add("JSP");
		set.add("Java"); // 중복 객체이므로 저장하지 않음
		set.add("SPRING");
		
		
		//저장된 객체 수 출력
		int size =  set.size();
		System.out.println("총 객체 수 :"+size);
		
		for(String element : set) {
			System.out.println(element);
		}
	}

}
