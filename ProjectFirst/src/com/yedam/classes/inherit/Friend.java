package com.yedam.classes.inherit;

public class Friend {
	public String name;
	public int tel;
	public Friend(String name, int tel) {
		this.name = name;
		this.tel = tel;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getTel() {
		return tel;
	}
	public void setTel(int tel) {
		this.tel = tel;
	}
	public void showInfo(String name, int tel) {
		System.out.println("이름: " + name + ", 전화번호: " + tel);
	}
}
