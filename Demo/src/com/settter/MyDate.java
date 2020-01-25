package com.settter;

public class MyDate {
	private int dd,mm,yy;
	public MyDate() {
		// TODO Auto-generated constructor stub
		
		System.out.println("I am in default constructor");
		
		dd=13;
		mm=7;
		yy=19;
	}
	public MyDate(int d,int m,int y)
	{
		
		System.out.println("I am in parametric constr");
		dd=d;
		mm=m;
		yy=y;
	}
	public void setDd(int d)
	{
		dd=d;
	}
	public void setMm(int m)
	{
		mm=m;
	}
	public void setYy(int y)
	{
		yy=y;
	}
	public int getDd()
	{
		return dd;
	}
	public int getMm()
	{
		return mm;
	}
	public int getYy()
	{
		return yy;
	}
	public void add(MyDate obj)
	{
		int d=this.dd+obj.dd;
		int m=this.mm+obj.mm;
		int y=this.yy+obj.yy;
		System.out.println(d+"/"+m+"/"+y);
		
	}
	public void display()
	{
		System.out.println("Date is "+dd+"/"+mm+"/"+yy);
	}
	public static void swapDate(MyDate d1,MyDate d2)
	{
		MyDate t;
		t=d1;
		d1=d2;
		d2=t;
		
		System.out.println("\t In swap method");
		d1.display();
		d2.display();
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Before Swapping ");
		MyDate obj=new MyDate();		
		obj.display();
		//System.out.println(obj.dd);
		MyDate obj1=new MyDate(14, 7, 2019);
		obj1.display();
	    
		swapDate(obj, obj1);
		
		System.out.println("After Swapping");

		obj.display();
		obj1.display();
	}

}
