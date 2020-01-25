package com.basics;

public class MulticatchDemo {

	public static void show()
	{
		try
		{			
			String s=null;
			System.out.println("lenghth is "+s.length());
			int n=10/0;
		}
		catch(NullPointerException | ArithmeticException  e)
		{
			System.out.println("in catch");
			System.out.println(e);
			System.out.println(e.getMessage());
		}
	}
	public static void main(String[] args) {
		
		MulticatchDemo.show();
		
	}
}
