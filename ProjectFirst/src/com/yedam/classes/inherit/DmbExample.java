package com.yedam.classes.inherit;

public class DmbExample {
	public static void main(String[] args) {
		DmbCellPhone dcp = new DmbCellPhone("DMB폰", "흰색", 10);
		//
		System.out.println(dcp.model + "," + dcp.color);
		//
		System.out.println(dcp.channel);
		//
		dcp.powerOn();
		dcp.bell();
		dcp.sendVoices("안녕하세요");
		dcp.receiveVoices("반갑습니다");
		//
		dcp.turnOnDmb();
		dcp.turnOffDmb();
		
	}
}
