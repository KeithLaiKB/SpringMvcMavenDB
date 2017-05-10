package com.schoolinformationmanagementsystem.mycontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
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
	
	
	// there is another method to autowired
/*	 @Autowired
	 public StudentController(StudentService studentService1){
	        this.studentService1 = studentService1;
	    }*/
	
	
	
	//return the model and view to resolver
	@RequestMapping(value="/findAllStudents", method=RequestMethod.GET)
	public ModelAndView findAllStudents()
	{
		//
		System.out.println("sdfasd");
		//
		//get the object
		List<Student> stuList=studentService1.findAllStudents();
		//
		//test the object
		System.out.println("size:"+stuList.size()+"\n"+stuList.get(0).getStuName());
		System.out.println("sdfasdaaaaaaaaa");
		//
		//
		ModelAndView modelAndView1=new ModelAndView();
		//set the name of view
		modelAndView1.setViewName("/student/showAllStudents");
		//add the object into model and view
		modelAndView1.addObject("allStudentList", stuList);
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
	
	
	
	//this function return a Student as page 
	//the 'id' in @RequestParam("id" )  should be equal to the name of the variable in the page which sent the request to this controller
	@RequestMapping(value="/findStudentById", method=RequestMethod.POST)
	public Student findStudentById(@RequestParam("id" ) String id1)
	{
		System.out.println("id:"+id1);
		//
		Student stu1=studentService1.findStudentById(Integer.valueOf(id1));
		System.out.println(stu1.getStuName());
		//
		return stu1;
		//
	}

}