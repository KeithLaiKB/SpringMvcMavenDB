package com.schoolinformationmanagementsystem.myservice;

import java.util.List;
import java.util.Map;

import com.schoolinformationmanagementsystem.model.Major;
import com.schoolinformationmanagementsystem.model.Teacher;


/**
 * @author Keith
 * May 9, 2017
 * 2:04:00 PM
 */
public interface MajorService {
	public abstract List<Major> findAllMajors();
	public abstract Major findMajorById(int majorId);
	public abstract int addMajor(Major major);
	public abstract Integer countAllMajorListNum();
	public abstract Map<String,Object> findPartialMajorListBySpecifiedPageNo(int pageNo);
}
