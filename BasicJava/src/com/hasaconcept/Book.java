package com.hasaconcept;

public class Book {

	int id;
	String name,pub;
	double price;
	Author a;
	
	public Book(int id, String name, String pub, double price, Author a) {
		
		this.id = id;
		this.name = name;
		this.pub = pub;
		this.price = price;
		this.a = a;
	}
    public void display()
    {
    	System.out.println("id "+id);
    	System.out.println("name "+name);
    	System.out.println("pub "+pub);
    	System.out.println("price "+price);
    	a.display();
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
