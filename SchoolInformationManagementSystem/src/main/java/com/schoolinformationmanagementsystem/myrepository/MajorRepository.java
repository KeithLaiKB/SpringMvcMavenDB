package com.schoolinformationmanagementsystem.myrepository;

import java.util.List;
import java.util.Map;

import com.schoolinformationmanagementsystem.model.Major;

public interface MajorRepository {

	public abstract int addMajor(Major major);
	// find
	public abstract Major findMajorById(int id);
	public abstract List<Major> findAllMajors();
	public abstract Integer countAllMajorListNum();
	public abstract List<Major> findPartialMajorListByStRowIdAndRecordNum(Map<String, Integer> map);
}
