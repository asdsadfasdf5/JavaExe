package ch13.sec02.exam02;

public class CarAgency implements Rentable<Car> { // 타입 파라미터 P를 Car으로 대체
	
	@Override
	public Car rent() {
		return new Car(); // 리턴타입이 반드시 Car여야 함
	}
}
