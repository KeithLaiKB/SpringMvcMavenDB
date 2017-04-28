package com.schoolinformationmanagementsystem.myrepository;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.schoolinformationmanagementsystem.model.Teacher;

/*
 * 接口 
 * 
 * mybatis-mapper中的 xml里面 会需要 找到  TeacherDaoInterface
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
