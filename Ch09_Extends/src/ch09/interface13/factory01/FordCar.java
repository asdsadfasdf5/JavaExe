package ch09.interface13.factory01;

import ch09.interface13.ICar;

public class FordCar implements ICar {

	@Override
	public void turnOn() throws InterruptedException {
		System.out.println("FordCar - It takes a good time~F");
		Thread.sleep((long)(Math.random()*500) + 500);
		
	}

	@Override
	public void turnOff() throws InterruptedException{
		System.out.println("FordCar - The engine turns off smoothly.~F");
		Thread.sleep((long)(Math.random()*500) + 500);

	}

	@Override
	public void accel() throws InterruptedException{
		System.out.println("FordCar - The Excel is turbo-operated.~F");
		Thread.sleep((long)(Math.random()*500) + 500);
	}

	@Override
	public void footBreak() throws InterruptedException{
		System.out.println("FordCar - The brakes operate smoothly.~F");
		Thread.sleep((long)(Math.random()*500) + 500);
	}

}
