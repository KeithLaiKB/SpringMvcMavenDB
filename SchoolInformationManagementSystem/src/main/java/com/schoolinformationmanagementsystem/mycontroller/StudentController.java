package com.schoolinformationmanagementsystem.mycontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.schoolinformationmanagementsystem.model.Student;
import com.schoolinformationmanagementsystem.myservice.StudentService;


//A convenience annotation that is itself annotated with @Controller and @ResponseBody.
@RestController
@RequestMapping(value="/controller/student")
public class StudentController {

	@Autowired
	private StudentService studentService1;
	
/*	 @Autowired
	 public StudentController(StudentService studentService1){
	        this.studentService1 = studentService1;
	    }*/
	
	
	
	//尝试  页面路径直接来这里 进行获取数据的操作  
	@RequestMapping(value="/findAllStudents", method=RequestMethod.GET)
	public ModelAndView findAllStudents()
	{
		//
		System.out.println("sdfasd");
		//
		//获取数据 
		List<Student> stuList=studentService1.findAllStudents();
		//
		//
		System.out.println("size:"+stuList.size()+"\n"+stuList.get(0).getStuName());
		//
		//s
		System.out.println("sdfasdaaaaaaaaa");

		//
		ModelAndView modelAndView1=new ModelAndView();
		modelAndView1.setViewName("/student/showAllStudents");
		modelAndView1.addObject("allStudentsList", stuList);
		//
		return modelAndView1;
		
	}
	
	
	
	
	
	@RequestMapping(value="/toFindStudentById", method=RequestMethod.GET)
	public ModelAndView toFindStudentById()
	{
		//
		ModelAndView modelAndView1=new ModelAndView();
		modelAndView1.setViewName("/student/findStudentById");
		//
		//
		return modelAndView1;
		//
	}
	
	
	
	
	
	//尝试  页面路径直接来这里 进行获取数据的操作  
	@RequestMapping(value="/findStudentById", method=RequestMethod.POST)
	public Student findStudentById(@RequestParam("id" ) String id1)
	{
		System.out.println("id:"+id1);
		//
		//
		Student stu1=studentService1.findStudentById(Integer.valueOf(id1));
		System.out.println(stu1.getStuName());
		//
		return stu1;
		//
	}
/*	public ModelAndView findStudentById(@RequestParam("id" ) String id1)
	{
		System.out.println("id:"+id1);
		//
		ModelAndView modelAndView1=new ModelAndView();
		modelAndView1.setViewName("/student/showAllStudents");
		modelAndView1.addObject("student", studentService1.findStudentById(Integer.valueOf(id1)));
		//
		return modelAndView1;
	}*/
}