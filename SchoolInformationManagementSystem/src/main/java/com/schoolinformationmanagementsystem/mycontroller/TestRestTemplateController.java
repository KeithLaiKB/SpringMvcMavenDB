package com.schoolinformationmanagementsystem.mycontroller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
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
	@ResponseBody 
	@RequestMapping(value = "/toTest",method = RequestMethod.GET)
	public String index() {
        return "test\n";
    }

}
