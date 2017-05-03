package com.schoolinformationmanagementsystem.myservice;

import java.util.List;

import com.schoolinformationmanagementsystem.model.Course;
import com.schoolinformationmanagementsystem.model.Student;

/**
 * @author Keith
 * 2017年5月3日
 */
public interface CourseService {
	List<Course> findAllCourses();
}
