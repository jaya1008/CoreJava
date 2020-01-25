package com.anon;

public class Driver {

	String name;
	public Driver() {
		// TODO Auto-generated constructor stub
		name="Mr. Xyz";
		
	}
	
	public Driver(String name) {
		super();
		this.name = name;
	}
	public void drive()
	{
		System.out.println(name + " is driving a Car");
	}
	
}
