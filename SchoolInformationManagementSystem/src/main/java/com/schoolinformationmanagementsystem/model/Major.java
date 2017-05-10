package com.schoolinformationmanagementsystem.model;

import java.io.Serializable;


/**
 * @author Keith
 * May 9, 2017
 * 2:00:11 PM
 */
public class Major implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int majorId=-1;
	private String majorName=null;
	public int getMajorId() {
		return majorId;
	}
	public void setMajorId(int majorId) {
		this.majorId = majorId;
	}
	public String getMajorName() {
		return majorName;
	}
	public void setMajorName(String majorName) {
		this.majorName = majorName;
	}
	
	public Major()
	{
		
		
		
	}
	
}
