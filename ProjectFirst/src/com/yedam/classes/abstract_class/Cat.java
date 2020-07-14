package com.yedam.classes.abstract_class;

public class Cat extends Animal{

	public Cat(String kind) {
		super(kind);
	}

	@Override
	public void sound() {
		System.out.println("야옹");
	}
	
	public abstract void eat(); //추상메소드는 추상클래스에서만 정의 할수있다

}
