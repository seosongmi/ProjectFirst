package com.yedam.classes.statics;

public class CalExample {
	public static void main(String[] args) {
		Car c1 = new Car(); 
		c1.setSpeed(-10); 
		System.out.println("속도: " + c1.getSpeed());
		c1.setSpeed(60);
		if (c1.isStop()) {
			c1.speed setStop(true);
		}
		System.out.println("현재속도: " + c1.getSpeed());
	}
}