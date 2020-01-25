package com.seed;

import java.io.IOException;

public class SecondDemoForpropagation {

	/**
	 * @param args
	 */
	public void getData() throws Exception 
	{
		 throw  new IOException();
		
	}
	public void show()
	{
		String s=null;
		if(s==null)
			throw new NullPointerException();
		
	}
	public void first()
	{
		try
		{
		second();
		System.out.println("After calling second");
		}
		catch(Exception  e)
		{
			e.printStackTrace();
			
		}
		finally
		{
			System.out.println("am in first() finally");
			
		}
		
	}
	public void second()
	{
		int n[]={1,2,3,4};
		int sum=0;
		
			for(int i=0; i<=5; i++)
				sum=sum+n[i];
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SecondDemoForpropagation obj=new SecondDemoForpropagation();
		try {
		//	obj.first();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally
		{
			System.out.println("in main finally");
			
		}
		
		try
		{
			//obj.show();
		}
		catch(NullPointerException e)
		{
			e.printStackTrace();
			
		}
	
		try {
			obj.getData();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
