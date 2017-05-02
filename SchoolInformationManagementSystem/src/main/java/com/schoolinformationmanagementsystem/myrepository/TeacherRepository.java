package com.schoolinformationmanagementsystem.myrepository;

import java.util.List;


import org.springframework.stereotype.Repository;

import com.schoolinformationmanagementsystem.model.Teacher;


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
public interface TeacherRepository {
	/* public Teacher addTeacher(Teacher teacher); */
	public int addTeacher(Teacher teacher);

	public int updateTeacher(Teacher teacher);
	//
	//
	// find
	public abstract Teacher findTeacherById(int id);

	public abstract List<Teacher> findAllTeachers();
	
	public abstract void deleteTeacherById(int id);
}
