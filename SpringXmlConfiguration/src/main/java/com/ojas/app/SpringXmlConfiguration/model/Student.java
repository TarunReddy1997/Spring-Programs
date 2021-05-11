package com.ojas.app.SpringXmlConfiguration.model;

import org.springframework.stereotype.Component;

//Has-A relationship using java
@Component
public class Student {

	String name;
	
	public void setName(String name) {
		this.name = name;
	}
	
	public  String dispName() {
		return "Hello "+name;
	}
}
