package com.inheritance;

import java.util.Random;

public class MyDate  {

	//datamember
	int dd,mm,yy;
	
	public MyDate(int dd, int mm, int yy) {
	
		
		
		this.dd = dd;
		this.mm = mm;
		this.yy = yy;
	}
    public MyDate() {
		// TODO Auto-generated constructor stub
    	
    	
    	dd=20;
    	mm=6;
    	yy=2019;
	}
    
    public boolean equals(Object obj)
    {
   
    	
    	System.out.println("I am equals()");
    	MyDate d=(MyDate)obj;
    	if(this.dd==d.dd && this.mm==d.mm&& this.yy==d.yy)    		  	
    		return true;
    	else
    		return false;
    }
    public String toString()
    {
    	return "Date is "+this.dd+"/"+this.mm+"/"+this.yy;
    }
	public void display() {
		//accessing current object through this reference implicity
		System.out.println("Date is "+this.dd+"/"+this.mm+"/"+this.yy);
	}
	public int hashCode()
	{
		System.out.println("in hashCode");
		Random r=new Random();
		return r.nextInt(1000);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MyDate p1=new MyDate(2, 7, 2019);	
		MyDate p2=new  MyDate(3,7,2019);
		
		System.out.println(p1.equals(p2));
//		p1.display();		
//		p2.display();
		
		System.out.println(p1);
		System.out.println(p2);
	     System.out.println(p1.hashCode());
	     System.out.println(p2.hashCode());
		
		
		
	}

}
