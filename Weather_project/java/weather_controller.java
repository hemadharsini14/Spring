package com.example.demo;

import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class weather_controller {
	@Autowired
	weatherdao wd;
	
	@RequestMapping("/getCity")
	@ResponseBody
	public ModelAndView City(String c_name)
	{
		System.out.println(c_name);
		String link = "http://api.openweathermap.org/data/2.5/weather?q="+c_name+"&units=metric&appid=104b7e6c0443bfc01aeb067228c93409";
		System.out.println(link);
		ModelAndView mv = new ModelAndView("weather_display");
		try {
			String str = wd.request(link);
			JSONObject root = new JSONObject(str);
			JSONArray arr = root.getJSONArray("weather");
			JSONObject obj = arr.getJSONObject(0);
			int id = obj.getInt("id");
			String desc = obj.getString("description");
			String icon = "http://api.openweathermap.org/img/w/"+obj.getString("icon")+".png";
			//String base = root.getString("base");
			JSONObject obj1 = root.getJSONObject("main");
			int temp = obj1.getInt("temp");
			int pressure = obj1.getInt("pressure");
			int humidity = obj1.getInt("humidity");
			System.out.println(id+" "+desc+"  "+temp+" "+pressure+" "+humidity+" "+icon);
			Model_weather mw = new Model_weather();
			mw.setId(id);
			mw.setCity_name(c_name);
			mw.setDesc(desc);
			mw.setIcon(icon);
			mw.setTemperature(temp);
			mw.setPressure(pressure);
			mw.setHumidity(humidity);
			mw.toString();
			System.out.println(mw.getCity_name()+" "+mw.getId()+" "+mw.getDesc()+" "+mw.getTemperature()+" "+mw.getHumidity()+" "+mw.getPressure()+" from mw");
			
			System.out.println("Here at end "+mw.getIcon());
			mv.addObject("mw",mw);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e);
			e.printStackTrace();
		}
		return mv;
	}

}
