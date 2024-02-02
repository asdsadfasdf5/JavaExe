package ch09.interface12;

public class StarMain {

	public static void walk(StarUnit[] units) {
		for(StarUnit unit : units)
			unit.walk(); // StarUnit에 walk()라는 메소드를 실행
	}
	public static void attack(StarUnit[] units) {
		for(StarUnit unit : units)
			unit.attack(); // StarUnit에 walk()라는 메소드를 실행
	}
	public static void die(StarUnit[] units) {
		for(StarUnit unit : units)
			unit.die(); // StarUnit에 walk()라는 메소드를 실행
	}
	public static void main(String[] args) {
		StarUnit[] units = new StarUnit[] {
				new Marine(),
				new Scv(),
				new Hydra()
		};
		
		walk(units); // main메소드에서 초기화 해준 units을 walk메소드에 전달 
		attack(units);
		die(units);

	}

}
