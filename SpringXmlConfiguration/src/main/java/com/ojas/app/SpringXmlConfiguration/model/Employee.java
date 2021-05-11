package com.ojas.app.SpringXmlConfiguration.model;
//=======constructor injection using Xml===============
public class Employee {

	int empno;
	String ename;
	double salary;
	
	public Employee(int empno,String ename,double salary) {
		this.empno = empno;
		this.ename = ename;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [empno=" + empno + ", ename=" + ename + ", salary=" + salary + "]";
	}
	
	
	
}
