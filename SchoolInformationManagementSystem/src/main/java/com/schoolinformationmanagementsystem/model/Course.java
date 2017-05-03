package com.schoolinformationmanagementsystem.model;

import java.io.Serializable;

/**
 * @author Keith
 * 2017年5月3日
 */
public class Course implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	//
	//
	int courseId=-1;
	String courseName=null;
	int increTeacherId=-1;
	public int getCourseId() {
		return courseId;
	}
	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public int getIncreTeacherId() {
		return increTeacherId;
	}
	public void setIncreTeacherId(int increTeacherId) {
		this.increTeacherId = increTeacherId;
	}
	public Course(){
		
		
	}
}
