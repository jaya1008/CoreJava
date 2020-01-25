package com.jayshree;

public class EmployeeCalculateSal {

	int eid;
	String name,addr;
	double sal,pf,ppf,hra,da,netsal;
	public void setData(int i,String nm,String ad,double s)
	{
		eid=i;
		name=nm;
		addr=ad;
		sal=s;
	}
	public void calculateNetSal()
	{
		pf=(sal*10)/100;
		ppf=(sal*2)/100;
		hra=(sal*25)/100;
		da=(sal*5)/100;
		
		netsal=sal+hra+da-pf-ppf;
		
	}
	public void display()
	{
		System.out.println("Employee info is ");
		System.out.println("Emp id "+eid);
		System.out.println("Ename  "+name );
		System.out.println("BasicSal "+sal);
		System.out.println("\t\t Pf "+pf);
		System.out.println("\t\t PPf "+ppf);
		System.out.println("\t\t hra "+hra);
		System.out.println("\t\t da "+da);
		System.out.println("************************");
		System.out.println("\t\t NetSal "+netsal);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		EmployeeCalculateSal e1=new EmployeeCalculateSal();
		e1.setData(1001, "Mangesh", "pune", 10000);
		e1.calculateNetSal();
		e1.display();
	}

}
