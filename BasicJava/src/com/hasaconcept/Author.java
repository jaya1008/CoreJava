package com.hasaconcept;

public class Author {

	String name,email,addr;
	int id;
	
	Author()
	{
		
	}
	public Author(String name, String email, String addr, int id) {
		
		this.name = name;
		this.email = email;
		this.addr = addr;
		this.id = id;
	}

	public void display()
	{
		System.out.println("id " +id);
		System.out.println("name "+name);
		System.out.println("addr "+addr);
		System.err.println("email "+email);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
