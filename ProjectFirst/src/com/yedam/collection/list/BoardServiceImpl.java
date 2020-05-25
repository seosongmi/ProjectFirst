package com.yedam.collection.list;

import java.util.List;

public class BoardServiceImpl implements BoardService{

	@Override
	public void inputBoard(List<Board> list, Board board) {
		list.add(board);
	}

	@Override
	public void updateBoard(List<Board> list, Board board) {
		// TODO Auto-generated method stub
		for (int i =0; i<list.size(); i++) {
			if (list.get(i).getTitle().equals(board.getTitle())) {
				list.get(i).setContents(board.getContents());
			}
		}
	}

	@Override
	public void deleteBoard(List<Board> list, Board board) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void listBoard(List<Board> list) {
		// TODO Auto-generated method stub
		for (Board board :list) {
			System.out.println(board);
		}
	}


}
