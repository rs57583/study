package com.Project1;

public interface BookService {

	public void input();

	public boolean searchBook();// 도서목록을 검사 현재 이 책을 빌릴 수 있는지

	public void print();// 전체정보 출력

	public void select();// 도서대출 엄

	public void recommend();// 추천도서 오

	public void delete();// 반납하기

	public void findTel();// 번호검색
	
}
