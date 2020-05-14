package com.yedam.classes.abstract_class;
//추상클래스()
public abstract class Animal {
	String Kind;
	public Animal(String kind) {
		this.Kind = kind;
	}
	public void breathe() {
		System.out.println("숨을 쉰다.");
	}
	public abstract void sound(); //추상메소드 
}
