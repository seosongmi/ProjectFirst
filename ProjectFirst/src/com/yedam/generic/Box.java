package com.yedam.generic;

public class Box<Apple> {
	Apple object;
	void set(Apple object) {
		this.object = object;
	}
	
	Apple get() {
		return object;
	}
}
