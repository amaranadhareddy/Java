package com.sapient.service;

public class Emp {
	
	private String name;
	private byte age;
	private String busUnit = "razorfish";
	public String getName() {
		return name;
	}
	public void setName(String name) throws Exception {
		if(!name.matches("[A-Za-z]{3,15}"))
			throw new Exception("name must contain 3-15 alphabets");
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) throws Exception{
		if(age<18 || age>60)
			throw new Exception("age must be between 18 and 60");
		this.age = (byte)age;
	}
	public String getBusUnit() {
		return busUnit;
	}
}
