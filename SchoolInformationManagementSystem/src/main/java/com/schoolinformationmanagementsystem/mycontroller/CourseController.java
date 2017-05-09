package com.schoolinformationmanagementsystem.mycontroller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.json.MappingJackson2JsonView;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.schoolinformationmanagementsystem.model.Course;
import com.schoolinformationmanagementsystem.myservice.CourseService;



/**
 * @author Keith
 * May 8, 2017
 * 10:21:26 AM
 */
@Controller
@RequestMapping(value="/controller/course")
public class CourseController {
	
	@Autowired
	public CourseService courseService1;
	
	
	@RequestMapping(value="/findAllCourses1",method=RequestMethod.GET)
	@ResponseBody
	public List<Course> findAllCourses1() throws JsonProcessingException
	{
		List<Course> courseList=courseService1.findAllCourses();

		return courseList;
		
	}
	
	
	@RequestMapping(value="/findAllCourses2",method=RequestMethod.GET)
	@ResponseBody
	public List<Course> findAllCourses2() throws JsonProcessingException
	{
		List<Course> courseList=courseService1.findAllCourses();
        /** 
         * ObjectMapper是JSON操作的核心，Jackson的所有JSON操作都是在ObjectMapper中实现。 
         * ObjectMapper有多个JSON序列化的方法，可以把JSON字符串保存File、OutputStream等不同的介质中。 
         * writeValue(File arg0, Object arg1)把arg1转成json序列，并保存到arg0文件中。 
         * writeValue(OutputStream arg0, Object arg1)把arg1转成json序列，并保存到arg0输出流中。 
         * writeValueAsBytes(Object arg0)把arg0转成json序列，并把结果输出成字节数组。 
         * writeValueAsString(Object arg0)把arg0转成json序列，并把结果输出成字符串。 
         */  
        ObjectMapper jasonObjMapper = new ObjectMapper();  
        String strJason=jasonObjMapper.writeValueAsString(courseList);
		//return strJason;
		
		
        //开始返回
        MappingJackson2JsonView view = new MappingJackson2JsonView();
        Map<String, Object> attributes = new HashMap<String, Object>();
        attributes.put("success", Boolean.TRUE);
        attributes.put("allCoursesList", courseList);
        
        
		ModelAndView modelAndView1=new ModelAndView();
		//set the name of view
		//view.setView("/course/showAllCourses");
		modelAndView1.setViewName("/course/showAllCourses");
		//add the object into model and view
        //view.setAttributesMap(attributes);
        //modelAndView1.setView(view);
		modelAndView1.addObject(courseList);
        return courseList;
		
		
/*        String json = "{\"name\":\"小民\",\"age\":20,\"birthday\":844099200000,\"email\":\"xiaomin@sina.com\"}";  
        

        ObjectMapper mapper = new ObjectMapper();  
        User user = mapper.readValue(json, User.class);  
        System.out.println(user);  */
		
	}

}
