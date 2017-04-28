package com.example.hello;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/hello/myUserHomePage")
public class MyUserHomePageController {
	
	@RequestMapping("/showa")
	public String showMyUserHomePage(){
		return "userHomePage";
	}

}
