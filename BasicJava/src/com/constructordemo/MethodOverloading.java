package com.constructordemo;

public class MethodOverloading {
/*
	public int add(int i,int j)
	{
		return i+j;
	}
	public int add(int i,int j,int k)
	{
		return i+j+k;
	}
	
	public int add(int i,int j,int k,int l)
	{
		return i+j+k+l;
	}
*/
	  public int add(int...n)
	
	{
		int sum=0;
		for(int i=0; i<n.length; i++)
		    sum=sum+n[i];
		
		for(int i:n)
			sum=sum+i;
		
		return sum;
	}
	
	public double add(double i,double j)
	{
		return i+j;
		
	}
	public String add(String s,String s1)
	{
		return s+s1;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MethodOverloading obj=new MethodOverloading();
		System.out.println(obj.add(2.5, 5.6));
		System.out.println(obj.add(12,13));
		System.out.println(obj.add(1,2,3 ,4));
		
		System.out.println(obj.add("Hello ", "all"));
	}

}
