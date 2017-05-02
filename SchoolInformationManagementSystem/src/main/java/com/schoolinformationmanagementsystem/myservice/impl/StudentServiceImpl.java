package com.schoolinformationmanagementsystem.myservice.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.schoolinformationmanagementsystem.model.Student;
import com.schoolinformationmanagementsystem.myrepository.StudentRepository;
import com.schoolinformationmanagementsystem.myservice.StudentService;

//you'd better write the name of interface ,which could make the code be easy to read,though you can don't write it
@Service(value = "StudentService")
public class StudentServiceImpl implements StudentService{
	
	@Autowired(required=true)
    private  StudentRepository studentRepository;
  //  private final StudentMapper studentMapper;

 /*   @Autowired
    StudentServiceImpl(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
        //this.studentMapper=studentMapper;
        
    }*/
	



	@Override
	public Student findStudentById(int id) {
		// TODO Auto-generated method stub
		return studentRepository.findStudentById(id);
	}


	@Override
	public List<Student> findAllStudents() {
		// TODO Auto-generated method stub
		return studentRepository.findAllStudents();
		//return studentMapper.selectByExample(null);
	}



}
