package com.hasaconcept;

public class Employee {

	int id;
	String name;
	double sal;
	MyDate dob;
	public Employee() {
		// TODO Auto-generated constructor stub
		id=0;
		name="default";
		sal=0;
		dob=new MyDate();
	}
	
	public Employee(int id, String name, double sal, MyDate dob) {
		
		this.id = id;
		this.name = name;
		this.sal = sal;
		this.dob = dob;
	
	}

	public void display()
	{
		System.out.println("Employee details are :");
		System.out.println(id);
		System.out.println(name);
		System.out.println(sal);
		dob.display();
		System.out.println();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee obj=new Employee();
		obj.display();
		
		Employee obj1=new Employee(1, "aaaa", 30000, new MyDate(12, 3, 1990));
		obj1.display();
		
		MyDate d=new MyDate(10, 8, 1982);
		
		Employee obj2=new Employee(2, "Pankaj", 350000, d);
		
		obj2.display();
		

	}
}