package com.yedam.morning;

import java.util.Scanner;

public class Code20200529 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);

		int scnt, bcnt;
		int[] a = new int[3];
		int[] b = new int[3];

		// a에 3개 랜덤
		for (int i = 0; i < 3; i++) {
			a[i] = (int) (Math.random() * 9) + 1;	
		}
		
		//a[0]=1, a[1]=3, a[2]=4
		// 중복제거
		for (int i = 0; i < 3; i++) {
			//i=3;
			for (int j =0; j < i; j++) {
				if(a[i]==a[j]) {
					a[i] = (int) (Math.random() * 9) + 1;
					i--;
				}
			}
		}

		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + "\t");
		}
		
		System.out.println();

		
		
		while (true) {
			System.out.println("숫자 3개 입력");
			// b에 3개받기
			for (int i = 0; i < b.length; i++) {
				b[i] = scn.nextInt();
			}
			// 입력한 값
			for (int i = 0; i < b.length; i++) {
				System.out.print(b[i] + "\t");
			}
			System.out.println();
			// a값
//			for (int i = 0; i < a.length; i++) {
//				System.out.print(a[i] + "\t");
//			}
//			System.out.println();
			
			scnt = 0;
			bcnt = 0;
			for (int i = 0; i < 3; i++) {
				if (a[i] == b[i]) {
					scnt++;
				}
				for (int j = 0; j < 3; j++) {
					if (a[i] != b[i] && a[i] == b[j]) {
						bcnt++;
					}
				}
			}
			System.out.print(bcnt + "볼\t");
			System.out.println(scnt + "스트라이크");

			if (scnt == 3) {
				System.out.println("정답");
				break;
			}
		}
	}
}