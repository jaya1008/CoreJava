package com.inheritance;

import com.hasaconcept.MyDate;

public class WageEmp extends Employee{

	double hrs,rate;
	WageEmp()
	{
		super();
		System.out.println("in default const. of WageEmp");
	}
	WageEmp(int id, String name, double sal, MyDate dob,double h,double r)
	{
		super(id,name,sal,dob);
		hrs=h;
		rate=r;
	}
	public void display()
	{
		System.out.println("WageEmp data is ...");
		super.display();
		System.out.println(hrs);
		System.out.println(rate);
	}
	public double computeSal()
	{
		return sal+hrs*rate;
	}
	public static void main(String[] args) {
		
		WageEmp we =new WageEmp();
		we.display();
		System.out.println("Sal is "+we.computeSal());
		
		System.out.println("**********************");
		
		WageEmp we1=new WageEmp(1, "aaaa", 30000, new MyDate(12, 3, 1990),20, 1000);
		we1.display();
		System.out.println(we1.computeSal());
	}
}
