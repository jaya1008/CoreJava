package com.inheritance;

public class FinalDemo {

	final int f;
	
	public FinalDemo() {
		// TODO Auto-generated constructor stub
		f=6;
	}

	FinalDemo(int f1)
	{
		f=f1;
	}
	public void display()
	{
		//f=12;
		System.out.println(f);
	}
}
