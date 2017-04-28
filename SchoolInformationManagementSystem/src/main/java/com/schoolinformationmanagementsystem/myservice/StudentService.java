package com.schoolinformationmanagementsystem.myservice;

import java.util.List;

import com.schoolinformationmanagementsystem.model.Student;

public interface StudentService {
//    Student addStudent(Student student);
	//里面进行找删除某学生的业务，和会包括其他的一些 业务操作，例如 删除 该学生所选的所有课程  ，所以有可能还会用到 courseDaoInterface来删除课程之类的
//    Student deleteStudent(int id);
//    Student deleteStudent(String id);
//    List<Student> findStudentsById(String studentId);
	
	//里面会用到 dao的接口 ，autowire 那个接口，具体操作的时候会用到 对应 mapper的xml中 写好的操作
	List<Student> findAllStudents();
    Student findStudentById(int id);
//    Student update(Student student);
}
