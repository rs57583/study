package com.Project1;

import java.util.ArrayList;
import java.util.List;

public class BookServiceVO {

	private String name;
	private String tel;
	private int grade;
	private String[] booklist = new String [grade+1];
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	
	public String[] getList() {
		return booklist;
	}
	public void setList(String[] list) {
		this.booklist = list;
	}
	
	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
	
	@Override
	public String toString() {
		
		String str = String.format("%4d %5s %4d %4s",
				grade,name,tel,booklist);
		
		return str;
	}
	
	
	
}
