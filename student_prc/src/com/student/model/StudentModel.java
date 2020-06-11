package com.student.model;

public class StudentModel {
	private int id;
	private int sex;
	private String username;
	private String password;
	private String love;
	
	public StudentModel(int id, int sex,String username, String password,String love) {
	super();
	this.id=id;
	this.username=username;
	this.love=love;
	this.password=password;
	this.sex=sex;
}
}