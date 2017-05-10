package com.schoolinformationmanagementsystem.myservice;

import java.util.List;

import com.schoolinformationmanagementsystem.model.Course;

/**
 * @author Keith
 * May 9, 2017
 * 2:04:54 PM
 */
public interface CourseService {
	List<Course> findAllCourses();
}
