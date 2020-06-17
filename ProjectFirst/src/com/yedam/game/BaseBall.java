package com.yedam.game;

import java.util.Random;

public class BaseBall {
	public static void main(String[] args) {
		int[] selectNumber = new int[6];
		Random random = new Random(3);
		System.out.println("선택번호");
		for (int i = 0; i < 6; i++) {
			selectNumber[i] = random.nextInt();
			System.out.println("");
		}
		
		
		
		
		
	}
}
