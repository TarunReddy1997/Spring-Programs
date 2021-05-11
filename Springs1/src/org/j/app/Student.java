package org.j.app;

import java.util.List;
import java.util.Map;

public class Student 
{
	private int regno;
	private List<String> name;
	private double marks;
	private Map<String, Double> stdmarks;
	
	public Student(int regno, List<String> name, double marks, Map<String, Double> stdmarks) 
	{
		super();
		this.regno = regno;
		this.name = name;
		this.marks = marks;
		this.stdmarks = stdmarks;
	}

	@Override
	public String toString() 
	{
		return "Student [regno=" + regno + ", name=" + name + ", marks=" + marks + ", stdmarks=" + stdmarks + "]";
	}
	
}
