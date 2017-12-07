package com.rtm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/hello")
public class HelloController {
	
	
	@RequestMapping("/world")
	public ModelAndView hello() {
		ModelAndView mv = new ModelAndView();
		mv.addObject("msg", "hello SpringMvc");
		mv.setViewName("hello");
		return mv;
	}

}
