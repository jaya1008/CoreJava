package com.hasaconcept;

public class MyDate {

	int dd,mm,yy;
	public MyDate() {
		// TODO Auto-generated constructor stub
	}
	public MyDate(int dd, int mm, int yy) {
		super();
		this.dd = dd;
		this.mm = mm;
		this.yy = yy;
	}
	public void display()
	{
		System.out.println(dd+"/"+mm+"/"+yy);
	}
	public static void main(String[] args) {
		
		MyDate obj=new MyDate();
		obj.display();
		MyDate obj1=new MyDate(20, 7, 2019);
		obj1.display();
	}
}
