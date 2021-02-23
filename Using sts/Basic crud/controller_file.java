package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.dao.Aliendao;
import com.example.demo.model.Alien;

@Controller
public class controller_file {
	@Autowired
	Aliendao ad;
	@RequestMapping("/")
	public String redirect_func()
	{
		return "home.jsp";
	}
	@RequestMapping("/addAlien")
	public String addAlien(Alien a)
	//public String addAlien(@RequestParam String aid, @RequestParam String name)
	{
		/*Alien a = new Alien();
		a.setId(aid);
		a.setName(name);*/
		System.out.println(a.toString());
		ad.save(a);
		return "home.jsp";
	}
	@RequestMapping("/getAlien")
	public ModelAndView getAlien(@RequestParam String id)
	{
		/*Alien a = new Alien();
		a.setId(aid);
		a.setName(name);*/
		//System.out.println(a.toString());
		//ad.save(a);
		ModelAndView mv = new ModelAndView("Show.jsp");
		//ad.deleteById(id);
		Alien a = ad.findById(id).orElse(new Alien());
		mv.addObject("a",a);
		return mv;
		//return "home.jsp";
	}


}
