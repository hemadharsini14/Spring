package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Homecontrol {
	/*@RequestMapping("home")
	public ModelAndView home(String name)
	{
		ModelAndView mv = new ModelAndView();
		System.out.println("Hello "+name );
		mv.addObject("name",name);
		mv.setViewName("home");
		return mv;
	}*/
	@RequestMapping("home")
	public ModelAndView home(Alien a)
	{
		ModelAndView mv = new ModelAndView();
		mv.addObject("obj",a);
		return mv;
	}

}
