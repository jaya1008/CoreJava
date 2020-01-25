package com.basics;

public class FinalDemo {

	//case -1
	//final int i=10;
	final int i;
	int j;
	public FinalDemo() {
		// TODO Auto-generated constructor stub
		i=10;
		j=20;
	}
	public  FinalDemo(int i,int j)
	{
		this.i=i;
		this.j=j;
	}
	
	public void show()
	{
		//i=9;
		System.out.println(i);
		System.out.println(j);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		FinalDemo d=new FinalDemo();
		d.show();
		FinalDemo d1=new FinalDemo(3,6);
		d1.show();
		
		final FinalDemo d2=new FinalDemo(10, 20);
		d2.j=30;
	//	d2=new FinalDemo(10,50);
		
		
	}

}
