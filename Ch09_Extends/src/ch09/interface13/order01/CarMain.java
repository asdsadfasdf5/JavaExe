package ch09.interface13.order01;

import ch09.interface13.ICar;
import ch09.interface13.factory01.*;

/*
 * 시나리오
 * 1)비트캠프는 자동차 산업을 진출하기 위해 자동차를 OEM생산
 * 자동차의 Specification을 각 자동차의 제조사에 제공하기 위해 interface를 사용해서 구현해야할 기능을
 * method로 정의해서 제조사에 보냄
 * - ICar 인테페이스 정함
 * 
 * 2-A. 자동차 제조사
 * 현대,도요타,포드는 ICar를 상속받아서 구현 클래스를 생성한다.
 * 이 구현 클래스의 메서드 기능은 각 회사의 기술력이 담겨질 것이다.
 * 구현 클래스가 완성되면 BITCAMP에 보내서 테스트 진행
 * 
 * 2-B. Bitcamp
 * 자동차 제조사에서 구현클래스(자동차)를 만드는 동안 
 * Bitcamp는 이미 정해진 약속인 ICar를 토대로 CarTester클래스를 제작한다.
 * 
 * 3. 자동차제조사는 모두 자동차(구현클래스)를 완성해서 납품
 * Bitcamp는 Main에서 자동차 객체를 생성하고 CarTester객체에 주입하여 각 자동차의 테스트를 진행한다.
 * 
 * 4.테스트 후 최종 점수를 비교하여 제조사를 선택한다.
 * 
 */
public class CarMain {
	public static void main(String[] args) throws InterruptedException {
		CarTester carTester =  new CarTester();
		ICar[] carArr = new ICar[] {
				new HyundaiCar(),
				new ToyotaCar(),
				new FordCar()
		};
		int[] score = new int[carArr.length];
		for(int i=0;i<carArr.length;i++) {
			carTester.setCar(carArr[i]);
			
			score[i] += carTester.onOffTest();
			System.out.printf("onOffTest 테스트 점수는 %d입니다\n",score[i]);
			score[i] += carTester.speedTest();
			System.out.printf("speedTest 테스트 점수는 %d입니다\n",score[i]);
			score[i] += carTester.footBreakTest();
			System.out.printf("footBreakTest 테스트 점수는 %d입니다\n",score[i]);
			score[i] += carTester.driveTest();
			System.out.printf("driveTest 테스트 점수는 %d입니다\n",score[i]);
			System.out.println("--------------------------------------");
		}
		// 가장 큰 점수를 받은 값과 인덱스 찾기
		int max = score[0];
		int maxIdx = 0;
		for(int i=1; i<score.length;i++) {
			if(max < score[i]) {
				max = score[i];
				maxIdx = i;
				
			}
		}
		System.out.printf("가장 높은 점수를 받은 차는 %d번째 차의 점수는 %d입니다\n",
				maxIdx+1,max);
		System.out.println(carArr[maxIdx].getClass().getName());
	}
}
