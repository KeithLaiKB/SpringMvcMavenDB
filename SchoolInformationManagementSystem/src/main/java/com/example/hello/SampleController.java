package com.example.hello;

//import org.springframework.boot.*;
//import org.springframework.boot.autoconfigure.*;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/sample")
public class SampleController {

	@RequestMapping(value = "/toGreet",method = RequestMethod.GET)
	public String index() {
        return "Greetings from Spring Boot!";
    }

	@RequestMapping(value = "/welcomea", method = RequestMethod.GET)
	public ModelAndView hello() {
		ModelAndView model = new ModelAndView();
		model.setViewName("helloUser");
		model.addObject("hello", "world1");
		model.addObject("world2");
		return model;
	}
	
	
	@RequestMapping(value = "/welcome", method = RequestMethod.GET)
	public String welcomeUser() {
		ModelAndView model = new ModelAndView();
		model.setViewName("helloUser");
		System.out.println("aa");
		return "helloUser";
	}
}