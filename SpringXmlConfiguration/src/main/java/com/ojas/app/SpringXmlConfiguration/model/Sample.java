package com.ojas.app.SpringXmlConfiguration.model;

public class Sample {

	String name;
	
	public void setName(String name) {
		this.name = name;
	}
	public void display() {
		System.out.println("welcome "+name);
	}
}
