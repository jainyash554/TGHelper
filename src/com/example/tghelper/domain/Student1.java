package com.example.tghelper.domain;

import java.io.Serializable;

public class Student1 implements Serializable {
	private int studentId;
	private String name;
	private String mobile;
	private String add;
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getAdd() {
		return add;
	}
	public void setAdd(String add) {
		this.add = add;
	}
public String toString()
{
	return name+"\n"+mobile;
	}
}
