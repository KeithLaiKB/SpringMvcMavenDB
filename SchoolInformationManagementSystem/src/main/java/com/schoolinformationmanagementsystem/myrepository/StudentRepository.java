package com.schoolinformationmanagementsystem.myrepository;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.schoolinformationmanagementsystem.model.Student;

/*
 * interface 
 * 
 * 
 * the xml in mybatis-mapper would find this file 
 * the file here seems like StudentDaoInterface of dao
 * 
 * 
 * */
@Repository
public interface StudentRepository {
	public List<Student> findAllStudents();
	public Student findStudentById(int id);
}
