package com.yedam.exceptions;

public class NullPointerExceptions {
	public static void main(String[] args) {
		String str = null;
		try {
			System.out.println(str.toString());
			Class.forName("java.lang.String2");
		} catch (NullPointerException e) {
			System.out.println("실행중 오류가 발생");
		} catch (Exception e) {
			System.out.println("알수없는 예외발생.");
			e.printStackTrace();
		}
		
		
		System.out.println("프로그램 종료");
	} // 예외처리
}
