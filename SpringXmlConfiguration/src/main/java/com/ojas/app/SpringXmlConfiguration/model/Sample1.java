package com.ojas.app.SpringXmlConfiguration.model;

//===============Bean Life cycle Methods...........
public class Sample1 {

	String name;

	
	public Sample1() {
		super();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void display() {
		System.out.println("Welcome "+name);
	}
	
	public void init() {
		System.out.println("this bean is going through init");
	}
	
	public void destroy() {
		System.out.println("this bean is destroyed");
	}
}
