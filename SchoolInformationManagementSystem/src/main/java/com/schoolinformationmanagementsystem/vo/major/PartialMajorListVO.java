package com.schoolinformationmanagementsystem.vo.major;

import java.util.List;

import com.schoolinformationmanagementsystem.model.Major;

public class PartialMajorListVO {
	private int nowPageNo;
	private int totalPages;
	private List<Major> majorList;
	public int getNowPageNo() {
		return nowPageNo;
	}
	public void setNowPageNo(int nowPageNo) {
		this.nowPageNo = nowPageNo;
	}
	public int getTotalPages() {
		return totalPages;
	}
	public void setTotalPages(int totalPages) {
		this.totalPages = totalPages;
	}
	public List<Major> getMajorList() {
		return majorList;
	}
	public void setMajorList(List<Major> majorList) {
		this.majorList = majorList;
	}


}
