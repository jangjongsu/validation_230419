package com.jjcompany.validation.dto;

public class StudentDto {
	private String id;
	private String pw;
	public StudentDto(String id, String pw) {
		super();
		this.id = id;
		this.pw = pw;
	}
	public StudentDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	

}
