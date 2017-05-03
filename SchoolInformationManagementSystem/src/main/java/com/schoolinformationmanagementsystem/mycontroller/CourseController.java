package com.schoolinformationmanagementsystem.mycontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.schoolinformationmanagementsystem.model.Course;
import com.schoolinformationmanagementsystem.myservice.CourseService;

/**
 * @author Keith
 * 2017年5月3日
 */
@Controller
@RequestMapping(value="/controller/course")
public class CourseController {
	
	@Autowired
	public CourseService courseService1;
	
	@ResponseBody
	@RequestMapping(value="/findAllCourses",method=RequestMethod.GET)
	public List<Course> findAllCourses()
	{
		List<Course> courseList=courseService1.findAllCourses();
		return courseList;
	}

}
