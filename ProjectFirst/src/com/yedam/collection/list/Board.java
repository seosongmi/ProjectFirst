package com.yedam.collection.list;

public class Board {
	private String title; //제목
	private String contents; //내용
	private String writer; //작성자
	
	Board (String title, String contents, String writer) {
		this.title = title;
		this.contents = contents;
		this.writer = writer;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContents() {
		return contents;
	}

	public void setContents(String contents) {
		this.contents = contents;
	}

	public String getWriter() {
		return writer;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}

	@Override
	public String toString() {
		return "Board [title=" + title + ", contents=" + contents + ", writer=" + writer + "]";
	}
	

}
