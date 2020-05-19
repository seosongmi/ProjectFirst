//p.387 확인문제 5번
package com.yedam.Interfaces;
interface Action {
	void work();
}

public class ActionExample {
	public static void main(String[] args) {
		Action action = new Action() {
			@Override
			public void work() {
				System.out.println("복사를 합니다.");
			}
		};
		action.work(); //복사를 합니다
	}
}
