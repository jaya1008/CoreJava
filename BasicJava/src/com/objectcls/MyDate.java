package com.objectcls;

public class MyDate {

	int dd,mm,yy;
	public MyDate() {
		// TODO Auto-generated constructor stub
		dd=29;
		mm=6;
		yy=2019;
	}
	
	public MyDate(int dd, int mm, int yy) {
		
		this.dd = dd;
		this.mm = mm;
		this.yy = yy;
	}
    public boolean equals(Object obj)
    {
    	System.out.println("In Equals()");
    	MyDate d=(MyDate)obj;

    	if(this.dd==d.dd && this.mm==d.mm&& this.yy==d.yy)
    		return true;
    	else
    		return false;
    }
	public void display()
	{
		System.out.println("Date is "+dd+"/"+mm+"/"+yy);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MyDate d1=new MyDate();
		d1.display();
		MyDate d2=new MyDate(30,6,2019);
		d2.display();
		boolean b=d1.equals(d2);
		System.out.println(b);
	}

}
