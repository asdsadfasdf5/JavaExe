package ch08.class06;


public class HumanMain {
	
	public static void viewInfo(Human human) {
//		System.out.println("이름 : " + human.name );
//		System.out.println("나이 : " + human.age );
//		System.out.println("점수 : " + human.score );
		
		System.out.println("이름 : " + human.getName() );
		System.out.println("나이 : " + human.getAge());
		System.out.println("점수 : " + human.getScore());
	}
	public static void main(String[] args) {
		Human human = new Human();
//		human.name = "홍길동"; 
//Human클래스의name을 private로 변경시 The field Human.name is not visible
//		human.age = 24;
//		human.score = 4.5;
		
		human.setName("홍길동");
		human.setAge(24);
		human.setScore(4.5);
		
		viewInfo(human);

		human.setAge(-24);
		human.setScore(-4.5);
		viewInfo(human);
		
		/*
		 * 중간에 많은 연산&처리가 있었다.
		 * 그러다 age, score값의 음수가 들어갔다.
		 */
	}
}
