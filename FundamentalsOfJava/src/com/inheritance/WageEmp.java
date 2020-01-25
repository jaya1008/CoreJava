package com.inheritance;

public class WageEmp extends  Employee
{

	double hr,rate;
	WageEmp()
	{
		super();
		hr=0;
		rate=0;
	}
	WageEmp(int id, String name, double sal,MyDate doj,int h,int r)
	{
		super(id,name,sal,doj);
		hr=h;
		rate=r;
	}
	public void display()
	{
		super.display();
		System.out.println("Hr "+hr);
		System.out.println("Rate "+rate);
	}
	public double computeSal()
	{
		return super.computeSal()+hr*rate;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WageEmp we=new WageEmp();
		we.display();
		System.out.println("Salary is "+we.computeSal());
		
		WageEmp we1=new WageEmp(101, "Veena", 50000, new MyDate(12,8,18), 50, 100);
		we1.display();
		System.out.println("Salary is "+we1.computeSal());

	}

}
