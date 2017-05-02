package com.example.hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;



@RestController //A convenience annotation that is itself annotated with @Controller and @ResponseBody.
@RequestMapping("/hello/greeting")
public class GreetingController {
	
	
	
	
    //@RequestMapping("/")
	//@RequestMapping("/a") default get
	@RequestMapping(value = "/toGreet",method = RequestMethod.GET)
	public String showMyGreeting() {
        return "hello user!"+"<a href='/hello/myUserHomePage/showa'>user home page</a>";
		//return "hello";
    }



}
