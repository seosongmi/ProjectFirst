package com.yedam.exceptions;

//10장 예외처리
abstract class Animal {
	abstract void sound();
}

class Dog extends Animal {
	@Override
	void sound() {
		System.out.println("멍멍");
	}
}

class Cat extends Animal {
	@Override
	void sound() {
		System.out.println("야옹");
	}
}

public class ClassCastExceptionExample {
	public static void main(String[] args) {
		Animal dog = new Dog();
		try {
			changeDog(dog);
		} catch (ClassCastException e) {
			System.out.println("변환불가");
		}

		Animal cat = new Cat();
		try {
			changeDog(cat);
		} catch (ClassCastException e) {
			System.out.println("변환불가");
		}
	}

	public static void changeDog(Animal animal) throws ClassCastException {
//		try {
//		if (animal instanceof Dog) {
		Dog dog = (Dog) animal;
		dog.sound();
//		} else {
//			System.out.println("변경할수없는 클래스입니다");
	}
//		} catch (ClassCastException e) {
//			System.out.println("형 변환을 할수없습니다");
//		}
}
