package com.schoolinformationmanagementsystem.mycontroller;

import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.json.MappingJackson2JsonView;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.schoolinformationmanagementsystem.model.Course;
import com.schoolinformationmanagementsystem.model.Major;
import com.schoolinformationmanagementsystem.model.Teacher;
import com.schoolinformationmanagementsystem.myservice.CourseService;
import com.schoolinformationmanagementsystem.myservice.MajorService;
import com.schoolinformationmanagementsystem.vo.major.PartialMajorListVO;



/**
 * @author Keith
 * May 8, 2017
 * 10:21:26 AM
 */
@Controller
@RequestMapping(value="/controller/major")
public class MajorController {
	
	@Autowired
	public MajorService majorService1;
	
	
	@RequestMapping(value="/findAllMajors1",method=RequestMethod.GET)
	@ResponseBody
	public List<Major> findAllMajors1() throws JsonProcessingException
	{
		List<Major> majorList=majorService1.findAllMajors();

		return majorList;
		
	}
	
	
	@RequestMapping(value="/findAllMajors2",method=RequestMethod.GET)
	@ResponseBody
	public List<Major> findAllMajors2() throws JsonProcessingException
	{
		List<Major> majorList=majorService1.findAllMajors();
        /** 
         * ObjectMapper是JSON操作的核心，Jackson的所有JSON操作都是在ObjectMapper中实现。 
         * ObjectMapper有多个JSON序列化的方法，可以把JSON字符串保存File、OutputStream等不同的介质中。 
         * writeValue(File arg0, Object arg1)把arg1转成json序列，并保存到arg0文件中。 
         * writeValue(OutputStream arg0, Object arg1)把arg1转成json序列，并保存到arg0输出流中。 
         * writeValueAsBytes(Object arg0)把arg0转成json序列，并把结果输出成字节数组。 
         * writeValueAsString(Object arg0)把arg0转成json序列，并把结果输出成字符串。 
         */  
        ObjectMapper jasonObjMapper = new ObjectMapper();  
        String strJason=jasonObjMapper.writeValueAsString(majorList);
		//return strJason;
		
		
        //开始返回
        MappingJackson2JsonView view = new MappingJackson2JsonView();
        Map<String, Object> attributes = new HashMap<String, Object>();
        attributes.put("success", Boolean.TRUE);
        attributes.put("allCoursesList", majorList);
        
        
		ModelAndView modelAndView1=new ModelAndView();
		//set the name of view
		//view.setView("/course/showAllCourses");
		modelAndView1.setViewName("/major/showAllMajors");
		//add the object into model and view
        //view.setAttributesMap(attributes);
        //modelAndView1.setView(view);
		modelAndView1.addObject(majorList);
        return majorList;

		
	}
	
	@RequestMapping(value="/findAllMajors3",method=RequestMethod.GET)
	@ResponseBody
	public ModelAndView findAllMajors3() throws JsonProcessingException
	{
		List<Major> majorList=majorService1.findAllMajors();

        
		ModelAndView modelAndView1=new ModelAndView();
		modelAndView1.setViewName("/major/showAllMajors");
		modelAndView1.addObject("allMajorList",majorList);
        return modelAndView1;

		
	}
	
	
	
	@RequestMapping(value="/tofindPartialMajorListBySpecifiedPageNo",method=RequestMethod.GET)
	public ModelAndView tofindPartialMajorListBySpecifiedPageNo()
	{
		//
		//
		//
		//指定 输出的页面 
	    ModelAndView modelAndView1 = new ModelAndView();
	    modelAndView1.setViewName("major/showPartialMajorListPage");
		//
	    //
	    return modelAndView1;
	    //return "asdfa";
		
	}
	
	
	//to insert Teacher page
	@RequestMapping(value="/toInsertMajor", method=RequestMethod.GET)
	public ModelAndView toInsertMajor()
	{
		System.out.println("enter toInsertMajor in majorController");
		//指定 输出的页面 
	    ModelAndView modelAndView1 = new ModelAndView();
	    modelAndView1.setViewName("major/insertMajorPage");
		//
	    //
	    //
	    //
	    return modelAndView1;
	}
	
	
	@RequestMapping(value="/insertMajor", method=RequestMethod.POST)
	public ModelAndView insertMajor(@RequestParam("majorName" ) String majorName1)
	{
		Major major1=new Major();
		//
		major1.setMajorName(majorName1);
		//
		//
		System.out.println("insertMajor in MajorController");
		//
		majorService1.addMajor(major1);
		//
		//
		//指定 输出的页面 
	    ModelAndView modelAndView1 = new ModelAndView();
	    modelAndView1.setViewName("major/showMajorInfoPage");
	    modelAndView1.addObject("major", major1);
		//
	    return modelAndView1;
	}
	
	
	
	
	@ResponseBody
	@RequestMapping(value="/findPartialMajorListBySpecifiedPageNo",method=RequestMethod.POST,produces = "text/html;charset=UTF-8")
	public String findPartialMajorListBySpecifiedPageNo(@RequestParam("pageNo" ) String pageNo)
	{
		//
		//
		List<Major> majorList=null;
		Map<String,Object> map=null;
		//
		int totalPageNum=-1;
		int returnNowPageNo=-1;
		//
		//
		String strJason=null;
		//
		//
		map=majorService1.findPartialMajorListBySpecifiedPageNo(Integer.valueOf(pageNo));
		//
		//
		if(((List<Major>) map.get("majorList"))!=null)
		{
			majorList=(List<Major>) map.get("majorList");
			totalPageNum=(int) map.get("totalPageNum");
			System.out.println(totalPageNum);
		}
		else
		{
			System.out.println("wrong, majorList is null in findPartialMajorListBySpecifiedPageNo in MajorController");
			return null;
		}
		//
		//test the content in majorlist
		for(Major major: majorList)
        {
            System.out.println(major.getMajorName());
            
        }
		//
		//
		//
		//
		//
		//
		//指定 输出的页面 
	    ModelAndView modelAndView1 = new ModelAndView();
	    modelAndView1.setViewName("major/showPartialMajorListPage.jsp");
	    modelAndView1.addObject("partialMajorList", majorList);
	    modelAndView1.addObject("totalPages", majorList);
	    modelAndView1.addObject("nowPageNo", returnNowPageNo);
		//
	    //
	    //PartialMajorListVO partialMajorListVO=new PartialMajorListVO();
	   // partialMajorListVO.setNowPageNo(map.get(arg0));
	    //partialMajorListVO.setTotalPages(totalPages);
	    //
        ObjectMapper jasonObjMapper = new ObjectMapper();  
		try {
			strJason = jasonObjMapper.writeValueAsString(map);
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			System.out.println("something wrong in findPartialMajorListBySpecifiedPageNo in major controller");
			e.printStackTrace();
		}
		//strJason=new String(strJason.getBytes(Charset.forName("utf-8")));
		System.out.println(strJason);
	    //
	    return strJason;
	    //return "asdfa";
		
	}
	
	
	
	
	

	
	
	
	
	

	
	
	
	
	
	
	
	
	

}
