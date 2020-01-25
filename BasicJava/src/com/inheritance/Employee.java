package com.inheritance;


import com.hasaconcept.MyDate;

public class Employee implements Printable
{
	int id;
	String name;
	double sal;
	MyDate dob;
	public Employee() {
		// TODO Auto-generated constructor stub
		System.out.println("I am in default const. of Employee");
		id=0;
		name="default";
		sal=0;
		dob=new MyDate();
	}
	
	public Employee(int id, String name, double sal, MyDate dob) {
		System.out.println(" I am in parametric const Employee");
		this.id = id;
		this.name = name;
		this.sal = sal;
		this.dob = dob;
	}

	public void print()
	{
		System.out.println("Employee details are :");
		System.out.println(id);
		System.out.println(name);
		System.out.println(sal);
		dob.display();
		System.out.println();
	}
	public double computeSal()
	{
		return sal;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee obj=new Employee();
		obj.print();
		
		Employee obj1=new Employee(1, "aaaa", 30000, new MyDate(12, 3, 1990));
		obj1.print();
		
		MyDate d=new MyDate(10, 8, 1982);
		
		Employee obj2=new Employee(2, "Pankaj", 350000, d);
		
		obj2.print();
		

	}
	
	

}
