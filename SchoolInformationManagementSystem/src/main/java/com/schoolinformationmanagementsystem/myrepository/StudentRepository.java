package com.schoolinformationmanagementsystem.myrepository;

import java.util.List;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.stereotype.Repository;

import com.schoolinformationmanagementsystem.model.Student;

/*
 * 接口 
 * 
 * mybatis-mapper中的 xml里面 会需要 找到  StudentDaoInterface
 * 
 * 
 *其实就相当于 dao 的interface  (studentDaoInterface)
 * 
 * */
@Repository
public interface StudentRepository {
	public List<Student> findAllStudents();
	public Student findStudentById(int id);
}
