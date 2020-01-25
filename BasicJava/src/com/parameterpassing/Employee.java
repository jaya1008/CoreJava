package com.parameterpassing;

public class Employee {
	int eid;
	String name;
	public Employee(int e,String nm) {
		// TODO Auto-generated constructor stub
		eid=e;
		name=nm;
	}
	public void display()
	{
		System.out.println("Eid "+eid);
		System.out.println("Ename "+name);
	}
	public void swapEmployee(Employee e1,Employee e2)
	{
		Employee temp;
		temp=e1;
		e1=e2;
		e2=temp;
		
		System.out.println("In swapEmployee()");
		e1.display();
		e2.display();
		
		System.out.println();
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Employee  e1=new Employee(1, "aaa");
		Employee e2=new Employee(2, "bbb");
		System.out.println("Before Swapping");
		e1.display();
		e2.display();
		
		System.out.println();

		
		e1.swapEmployee(e1, e2);
		System.out.println("After Swapping");
		e1.display();
		e2.display();
		
		
	}
	

}