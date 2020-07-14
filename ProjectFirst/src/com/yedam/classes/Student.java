package com.yedam.classes;

public class Student {
	//(속성)
	String name; //이름
	int age; // 나이
	double height; //키
	double weight; //몸무게
	//(기능) -> 메소드
	void study() {
		System.out.println("공부합니다.");
	}; //공부한다
	//운동한다
	void eat(String str) {
		System.out.println(str + "을 먹는다.");
	} //먹는다
}
