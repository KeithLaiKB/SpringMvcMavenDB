package com.schoolinformationmanagementsystem.myservice.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.schoolinformationmanagementsystem.model.Teacher;
import com.schoolinformationmanagementsystem.myrepository.TeacherRepository;
import com.schoolinformationmanagementsystem.myservice.TeacherService;

//you'd better write the name of interface ,which could make the code be easy to read,though you can don't write it
@Service(value = "TeacherService")
public class TeacherServiceImpl implements TeacherService{

	
	@Autowired(required=true)
    TeacherRepository teacherRepository1;

	/*private final TeacherRepository teacherRepository1;*/
	
 /*  @Autowired
    public TeacherServiceImpl(TeacherRepository teacherRepository1)
    {
    	this.teacherRepository1=teacherRepository1;
    	
    }*/
    
    
    
	@Override
	public List<Teacher> findAllTeachers() {
		// TODO Auto-generated method stub
		return teacherRepository1.findAllTeachers();
	}

	@Override
	public void addTeacher(Teacher teacher) {
		// TODO Auto-generated method stub
		teacherRepository1.addTeacher(teacher);
	}

	@Override
	public void updateTeacher(Teacher teacher) {
		// TODO Auto-generated method stub
		teacherRepository1.updateTeacher(teacher);
		
	}

	@Override
	public Teacher findTeacherById(int id) {
		return teacherRepository1.findTeacherById(id);
	}

	@Override
	public void deleteTeacherById(int id) {
		// TODO Auto-generated method stub
		teacherRepository1.deleteTeacherById(id);
	}
	
	
	

/*	@Override
	public Teacher addTeacher(Teacher teacher) {
		// TODO Auto-generated method stub
		return teacherRepository1.addTeacher(teacher);
	}
*/
	


}
