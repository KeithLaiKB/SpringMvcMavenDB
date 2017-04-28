package com.schoolinformationmanagementsystem.model;

import java.io.Serializable;

public class Student implements Serializable {

	private int id = -1;
	private String stuId = null;
	private String stuName = null;
	private String gender = null;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getStuId() {
		return stuId;
	}

	public void setStuId(String stuId) {
		this.stuId = stuId;
	}

	public String getStuName() {
		return stuName;
	}

	public void setStuName(String stuName) {
		this.stuName = stuName;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Student() {

	}



}