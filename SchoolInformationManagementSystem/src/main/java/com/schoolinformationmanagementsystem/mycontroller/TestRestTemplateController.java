package com.schoolinformationmanagementsystem.mycontroller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/*
 * 
 * for test
 * 
 * */


@RestController //A convenience annotation that is itself annotated with @Controller and @ResponseBody.
@RequestMapping("/test/")
public class TestRestTemplateController {

    //@RequestMapping("/")
	//@RequestMapping("/a") default get
	
	@RequestMapping(value = "/toTest",method = RequestMethod.GET)
	public String index() {
        return "test\n";
    }

}
