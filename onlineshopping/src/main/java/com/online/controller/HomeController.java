package com.online.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

	@RequestMapping(value="/")
	public ModelAndView welcome()
	{
		ModelAndView mv = new ModelAndView("index");
		mv.addObject("welcome","Hi There, welcome to my page");
		return mv;
	}
	
}
