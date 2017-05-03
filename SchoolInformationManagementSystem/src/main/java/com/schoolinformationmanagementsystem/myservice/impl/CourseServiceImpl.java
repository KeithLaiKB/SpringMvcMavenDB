package com.schoolinformationmanagementsystem.myservice.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.schoolinformationmanagementsystem.model.Course;
import com.schoolinformationmanagementsystem.model.Student;
import com.schoolinformationmanagementsystem.myrepository.CourseRepository;
import com.schoolinformationmanagementsystem.myrepository.StudentRepository;
import com.schoolinformationmanagementsystem.myservice.CourseService;
import com.schoolinformationmanagementsystem.myservice.StudentService;

//you'd better write the name of interface ,which could make the code be easy to read,though you can don't write it
@Service(value = "CourseService")
public class CourseServiceImpl implements CourseService{
	
	@Autowired(required=true)
    private  CourseRepository courseRepository;
  //  private final StudentMapper studentMapper;

	@Override
	public List<Course> findAllCourses() {
		// TODO Auto-generated method stub
		return courseRepository.findAllCourses();
	}

 /*   @Autowired
    StudentServiceImpl(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
        //this.studentMapper=studentMapper;
        
    }*/
	




}
