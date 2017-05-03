package com.schoolinformationmanagementsystem.myrepository;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.schoolinformationmanagementsystem.model.Course;

/*
 * interface 
 * 
 * 
 * the xml in mybatis-mapper would find this file 
 * the file here seems like StudentDaoInterface of dao
 * 
 * 
 * */

/**
 * @author Keith
 * 2017年5月3日
 */
@Repository
public interface CourseRepository {
	public List<Course> findAllCourses();
}
