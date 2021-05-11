package com.ojas.app.SpringXmlConfiguration.model;

//========Constructor Injection Has-A relationship================
public class Address {

	private String hno;
	private String colName;
	private String city;
	
	public Address(String hno, String colName, String city) {
		super();
		this.hno = hno;
		this.colName = colName;
		this.city = city;
	}

	@Override
	public String toString() {
		return "Address [hno=" + hno + ", colName=" + colName + ", city=" + city + "]";
	}
	
	
}
