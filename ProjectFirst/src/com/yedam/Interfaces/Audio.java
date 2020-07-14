package com.yedam.Interfaces;

public class Audio implements RemoteControl {

	@Override
	public void turnOn() {
		System.out.println("audio를 켭니다");
	}

	@Override
	public void turnOff() {
		System.out.println("audio를 끕니다");
	}
	
}
