package com.schoolinformationmanagementsystem.mycontroller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.schoolinformationmanagementsystem.model.Teacher;
import com.schoolinformationmanagementsystem.myservice.StudentService;
import com.schoolinformationmanagementsystem.myservice.TeacherService;


@Controller
@RequestMapping(value="/controller/teacher")
public class TeacherController {

//	@Autowired
	private TeacherService teacherService1;
	
	
	
/*	 @Autowired
	    public TeacherController(TeacherService teacherService1){
	        this.teacherService1 = teacherService1;
	    }*/
	
	
	@RequestMapping(value="/findAllTeachers", method=RequestMethod.GET)
	public ModelAndView findAllTeachers()
	{
		List<Teacher> teacherList1=teacherService1.findAllTeachers();
		System.out.println("find all teachers in TeacherController");
		//指定 输出的页面 
	    ModelAndView modelAndView1 = new ModelAndView();
	    modelAndView1.setViewName("teacher/showAllTeachers");
	    //设定传给页面的值
	    modelAndView1.addObject("allTeachersList",teacherList1 );
	    return modelAndView1;
		
	}
	
	
	//to insert Teacher page
	@RequestMapping(value="/toInsertTeacher", method=RequestMethod.GET)
	public ModelAndView toInsertTeacher()
	{
		//指定 输出的页面 
	    ModelAndView modelAndView1 = new ModelAndView();
	    modelAndView1.setViewName("teacher/insertTeacherPage");
		//
	    //
	    //
	    //
	    return modelAndView1;
	}
	//
	//
	//insert teacher into database
	@RequestMapping(value="/insertTeacher", method=RequestMethod.POST)
	public ModelAndView insertTeacher(@RequestParam("teacherId" ) String teacherId1,@RequestParam("teacherName" ) String teacherName1,@RequestParam("gender" ) String gender1)
	{
		Teacher teacher1=new Teacher();
		//
		teacher1.setTeacherId(teacherId1);
		teacher1.setTeacherName(teacherName1);
		teacher1.setGender(gender1);
		//
		//
		System.out.println("insertTeachers in TeacherController");
		//
		teacherService1.addTeacher(teacher1);
		//
		//
		//指定 输出的页面 
	    ModelAndView modelAndView1 = new ModelAndView();
	    modelAndView1.setViewName("teacher/showTeacherInfoPage");
	    modelAndView1.addObject("teacher", teacher1);
		//
	    return modelAndView1;
	}
	//
	//
	//
	//
	//
	//to update Teacher page
	@RequestMapping(value="/toUpdateTeacher", method=RequestMethod.GET)
	public ModelAndView toUpdateTeacher(@RequestParam("id" ) String id1)
	{
		Teacher teacher1=teacherService1.findTeacherById(Integer.valueOf(id1));
		//指定 输出的页面 
	    ModelAndView modelAndView1 = new ModelAndView();
	    modelAndView1.setViewName("teacher/updateTeacherPage");
	    modelAndView1.addObject("teacher", teacher1);
		//
	    return modelAndView1;
	}
	//
	//
	//update teacher in database
	@RequestMapping(value="/updateTeacher", method=RequestMethod.POST)
	public ModelAndView updateTeacher(@RequestParam("id" ) String id1,@RequestParam("teacherId" ) String teacherId1,@RequestParam("teacherName" ) String teacherName1,@RequestParam("gender" ) String gender1)
	{
		//
		//
		Teacher teacher1=teacherService1.findTeacherById(Integer.valueOf(id1));
		//
		//teacher1.setTeacherId(teacherId1);
		teacher1.setTeacherName(teacherName1);
		teacher1.setGender(gender1);
		//
		System.out.println("updateTeacher in TeacherController");
		//
		teacherService1.updateTeacher(teacher1);
		//
		//
		//指定 输出的页面 
	    ModelAndView modelAndView1 = new ModelAndView();
	    modelAndView1.setViewName("teacher/showTeacherInfoPage");
	    modelAndView1.addObject("teacher", teacher1);
		//
	    return modelAndView1;
	}
	//
	//update teacher in database
	@RequestMapping(value="/deleteTeacherById", method=RequestMethod.GET)
	public String deleteTeacherById(@RequestParam("id" ) String id1)
	{
		//
		Teacher teacher1=null;
		//
		teacher1=teacherService1.findTeacherById(Integer.valueOf(id1));
		//
		if(teacher1==null)
		{
			return null;
		}
		//
		//
		System.out.println("deleeteTeachers in TeacherController");
		//
		teacherService1.deleteTeacherById(Integer.valueOf(id1));
		//
		//
		//
	    return "redirect:/controller/teacher/findAllTeachers";
	}
	//
	//
/*	@RequestMapping(value="/insertTeacher", method=RequestMethod.POST)
	public ModelAndView insertTeachers(@RequestParam("teacherId" ) String teacherId1,@RequestParam("teacherName" ) String teacherName1,@RequestParam("gender" ) String gender1)
	{
		Teacher teacher1=new Teacher();
		//
		teacher1.setTeacherId(teacherId1);
		teacher1.setTeacherName(teacherName1);
		teacher1.setGender(gender1);
		//
		//
		System.out.println("insertTeachers in TeacherController");
		//
		teacherService1.addTeacher(teacher1);
		//
		//
		//指定 输出的页面 
	    ModelAndView modelAndView1 = new ModelAndView();
	    modelAndView1.setViewName("teacher/showTeacherInfoAfterAddTeacher");
		//
	    return modelAndView1;
	}*/


}