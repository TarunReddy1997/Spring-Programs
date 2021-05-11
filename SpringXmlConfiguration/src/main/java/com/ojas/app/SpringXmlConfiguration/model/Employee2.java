package com.ojas.app.SpringXmlConfiguration.model;

import java.util.Map;
import java.util.Set;

public class Employee2 {

	private int id;
	private String name;
	private Set<String> phoneno;
	private Map<String, String> projects;
	
	public Employee2() {
		super();
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

	public Set<String> getPhoneno() {
		return phoneno;
	}

	public void setPhoneno(Set<String> phoneno) {
		this.phoneno = phoneno;
	}

	public Map<String, String> getProjects() {
		return projects;
	}

	public void setProjects(Map<String, String> projects) {
		this.projects = projects;
	}

	@Override
	public String toString() {
		return "Employee2 [id=" + id + ", name=" + name + ", phoneno=" + phoneno + ", projects=" + projects + "]";
	}
	
	
}
