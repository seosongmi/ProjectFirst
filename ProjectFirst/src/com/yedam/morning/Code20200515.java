package com.yedam.morning;

public class Code20200515 {
	public static void main(String[] args) {
		int [][] ary = new int[5][5];
		int cnt = 1;
		for (int i = 0; i < ary.length;i++) {
			for (int j = 0; j<ary[i].length;j++) {
				ary[i][j] = cnt++;
				System.out.print(ary[i][j] + "\t");
				
			}
			System.out.println();
		}
		
		cnt = 1;
		for (int j = 0; j < ary.length;j++) {
			for (int i = 0; i<ary[j].length;i++) {
				ary[i][j] = cnt++;
				System.out.print(ary[j][i] + "\t");
				
			}
			System.out.println();
		}
		
//	for (int i = 0; i< ary.length; i++ ) {
//		for (int i = 0; i < ary.length;i++) {
//			for (int j = 0; j <ary[i].length; j++) {
//				
//			}
//		}
//	}
	}
}
