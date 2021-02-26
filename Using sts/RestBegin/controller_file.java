package com.example.demo.controller;

import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
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
	@GetMapping("/aliens")
	@ResponseBody
	public List<Alien> showAlien()
	{
		List<Alien>l = (List<Alien>)ad.findAll();
		return l;
		//return ad.findAll().toString();
	}
	@GetMapping("/alien/{id}")
	@ResponseBody
	public String getAlien(@PathVariable("id") String id)
	{
		return ad.findById(id).toString();
	}
	/*@RequestMapping("/getAlien")
	public ModelAndView getAlien(@RequestParam String id)
	{
		/*Alien a = new Alien();
		a.setId(aid);
		a.setName(name);*/
		//System.out.println(a.toString());
		//ad.save(a);
		/*ModelAndView mv = new ModelAndView("Show.jsp");
		//ad.deleteById(id);
		Alien a = ad.findById(id).orElse(new Alien());
		mv.addObject("a",a);
		System.out.println(ad.findByname("hema"));
		System.out.println();
		System.out.println(ad.findById("135"));
		System.out.println();
		System.out.println(ad.findByTechSorted("hema"));
		System.out.println();
		return mv;
		//return "home.jsp";
	}*/


}
