package com.yedam.collection.list;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BoardMain {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		List<Board> list = new ArrayList<>();

		BoardService service = new BoardServiceImpl();

		while (true) {
			System.out.println("=============================");
			System.out.println("1.입력  2.수정 3.삭제 4.전체리스트 5.종료");
			System.out.println("=============================");
			System.out.println("선택> ");
			int menu = scn.nextInt();
			if (menu == 1) {
				System.out.println("제목입력:");
				String title = scn.nextLine();
				System.out.println("내용입력:");
				String content = scn.nextLine();
				System.out.println("작성자입력:");
				String writer = scn.nextLine();
				Board board = new Board(title, content, writer);

				service.inputBoard(list, board);
			} else if (menu == 2) {
				System.out.println("제목입력:");
				String title = scn.nextLine();
				System.out.println("바꿀내용:");
				String content = scn.nextLine();
				Board board = new Board(title, content, null);
				
				service.updateBoard(list, board);
			} else if (menu == 3) {

			} else if (menu == 4) {
				service.listBoard(list);

			}
		}
	}
}
