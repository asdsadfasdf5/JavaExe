package ch09.interface12;

/*
 * 인터페이스는 추상클래스와 같다고 보면된다.
 * 모든 메서드가 추상 메서드
 * 1) 상속을 전제로 한다.
 * 2) 부모의 인터페이스 변수에 자식 객체를 저장할 수 있다.
 * 3) 다형성의 장점을 가진다.( 묶어서 관리 쉽다, 각 변수는 저장된 객체에 따라 각각 개성있게 동작)
 * 4) 클래스와 클래스를 연결해주는 의미가 크다.
 * 5) 유연한 설계를 하는데 있다.
 * 6) Design Pattern
 * 7) literal constant => 의미있는 문자열 constant
 */
/*
 * 인터페이스의 메서드는 public이 없어도 기본적으로 public의 속성을 가지고 있다.
 * 하지만 
 */
public interface StarUnit {
	
//	public abstract void play(); 에서 public 과 asbtract는 생략이 가능하다.
	void walk();

	void attack();

	void die();
}


//public abstract class StarUnit{ // 이렇게 사용하는거랑 같은 방식이다.
//	public abstract void walk();
//
//	public abstract void attack();
//
//	public abstract void die();
//}
