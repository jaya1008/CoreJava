package com.constructordemo;

public class Employee {

	//Data memember of class
	int eid;
	String name;
	double sal;
	public  Employee() {
		// TODO Auto-generated constructor stub
		System.out.println("In default constructor");
		eid=0;
		name="default";
		sal=0;
	}
	public void display()
	{
	
		System.out.println("Eid   :"+eid);
		System.out.println("Ename :"+name);
		System.out.println("Sal   :"+sal);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Employee obj=new Employee();
		obj.display();
	}

}
