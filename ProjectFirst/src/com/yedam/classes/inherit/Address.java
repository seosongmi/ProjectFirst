package com.yedam.classes.inherit;

import java.util.Scanner;

import com.yedam.classes.Account;

public class Address {
	public static void main(String[] args) {
		 Scanner scn = new Scanner(System.in);
		 Friend[] friends = new Friend[100];
		 
			while(true) {
				System.out.println("-----------------------");
				System.out.println("1.주소추가 2.주소록리스트 3.이름조회 4.종료");
				System.out.println("-----------------------");
				System.out.print("선택> ");
				int menu = scn.nextInt();scn.nextLine();
				if(menu==1) {
					System.out.println("주소추가 선택.");
					System.out.println(" 1.친구 2.대학 3.회사");
					int menu2 = scn.nextInt();scn.nextLine();
						if(menu2==1) {
					System.out.println("친구선택");
					System.out.println("이름을 입력하세요.");
					String name = scn.nextLine();
					System.out.println("전화번호를 입력하세요.");
					int number = scn.nextInt(); scn.nextLine();
					Friend fri = new Friend(name,number);
					for(int i=0;i<friends.length;i++) {
						if(friends[i]==null) {
							friends[i] = fri;
							break;
						}
					}
					} else if(menu2==2) {
						System.out.println("대학 선택");
						System.out.println("이름을 입력하세요.");
						String name = scn.nextLine();
						System.out.println("전화번호를 입력하세요.");
						int number = scn.nextInt(); scn.nextLine();
						System.out.println("전공을 입력하세요.");
						String major = scn.nextLine();
						Friend fri = new College(name,number,major);
						for(int i=0;i<friends.length;i++) {
							if(friends[i]==null) {
								friends[i] = fri;
								break;
							}
						}
					
					}else if(menu2==3) {
						System.out.println("회사 선택");
						System.out.println("이름을 입력하세요.");
						String name = scn.nextLine();
						System.out.println("전화번호를 입력하세요.");
						int number = scn.nextInt(); scn.nextLine();
						System.out.println("부서를 입력하세요.");
						String department = scn.nextLine();
						Friend fri = new Company(name,number,department);
						for(int i=0;i<friends.length;i++) {
							if(friends[i]==null) {
								friends[i] = fri;
								break;
							}
					}
				}
					System.out.println("주소 생성되었습니다.");
				} else if(menu==2) {
					System.out.println("주소리스트 선택.");
					// 전체 배열중에 값이 있는 경우에만 출력(null제외)
					for(Friend fnd : friends) {
						if(fnd != null) {
							fnd.showInfo(fnd.getName(), fnd.getTel());
						}
					}
				} 
					else if(menu==3) {
					System.out.println("이름조회 선택.");
					System.out.println("이름을 입력하세요.");
					String name = scn.nextLine();
					//전체배열중에 값이 있는 경우 && 입력계좌번호와 동일한 건에 처리.
					for(Friend fnd: friends) {
						if(fnd != null && fnd.getName().equals(name)) {
							fnd.showInfo(fnd.getName(), fnd.getTel());
						}
					}
				} else if(menu==4) {
					System.out.println("종료선택.");
					break;
				}
			}
			System.out.println("프로그램 종료");
		}
}

