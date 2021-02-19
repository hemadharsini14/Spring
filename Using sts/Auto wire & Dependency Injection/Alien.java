package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(value="prototype")
public class Alien {
	private int id;
	private String name;
	@Autowired
	private Laptop l;
	
	
	public Alien(int id) {
		super();
		System.out.println("Vanakam  ");
		this.id = id;
		 //l = new Laptop(lid);
		 //l.summa();
		//this.name = name;
	}
	
	public Laptop getL() {
		return l;
	}
	public void setL(Laptop l) {
		this.l = l;
	}
	
	public void func()
	{
		System.out.println(id);
		l.summa();
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	

}
