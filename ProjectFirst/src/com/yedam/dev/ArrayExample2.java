package com.yedam.dev;

public class ArrayExample2 {
	public static void main(String[] args) {
//		System result = getString("Hello, World");
		int[] inyAry = {1,2,3,4};
		int[] intAry2 = new int[5];
		intAry2 = new int[] {1,2,3,4};
		
		int[][] intAry3 = new int[3][];
		intAry3[0] = new int[5];
	}
	

		System.out.println(getLargeValue(new int[] { 3, 65, 2, 9, 10 }));
	
		public static int getLargeValue(int[] ary) {
		int maxValue = Integer.MIN_VALUE;

		for (int i = 0; i < ary.length; i++) {
			if (ary[i] > maxValue)
				maxValue = ary[i];
		}

		return maxValue;
	}

	public static int getLargeValue(int a, int b, int c) {
		int maxValue = Integer.MIN_VALUE;
		if (a >= b)
			maxValue = a;
		if (b >= maxValue)
			maxValue = b;
		if (c >= maxValue)
			maxValue = c;
		return maxValue;
	}

}
