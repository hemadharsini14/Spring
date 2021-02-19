package com.example.demo;

import org.springframework.stereotype.Component;

@Component

public class Laptop {
	private int lid;
	private String name;
	
	
	public Laptop() {
		super();
		//this.lid = lid;
		
	}
	
	public int getLid() {
		return lid;
	}
	public void setLid(int lid) {
		this.lid = lid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void summa()
	{
		System.out.println("HEllooo summa");
	}

}
