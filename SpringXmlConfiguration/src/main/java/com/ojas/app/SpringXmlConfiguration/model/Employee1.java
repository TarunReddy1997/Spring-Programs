package com.ojas.app.SpringXmlConfiguration.model;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;
//==============Collections in Spring
public class Employee1 {

	private List<String> empList;
	private Set<String> empSet;
	private Map<String, String> empMap;
	private Properties properties;
	
	
	public List<String> getEmpList() {
		return empList;
	}
	public void setEmpList(List<String> empList) {
		this.empList = empList;
	}
	public Set<String> getEmpSet() {
		return empSet;
	}
	public void setEmpSet(Set<String> empSet) {
		this.empSet = empSet;
	}
	public Map<String, String> getEmpMap() {
		return empMap;
	}
	public void setEmpMap(Map<String, String> empMap) {
		this.empMap = empMap;
	}
	public Properties getProperties() {
		return properties;
	}
	public void setProperties(Properties properties) {
		this.properties = properties;
	}
	@Override
	public String toString() {
		return "Employee1 [empList=" + empList + ", empSet=" + empSet + ", empMap=" + empMap + ", properties="
				+ properties + "]";
	}
	
	
}
