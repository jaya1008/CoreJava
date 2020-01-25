package com.collection;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

enum coffee
{
	small(50),large(100),medium(75);
	int price;
	coffee(int p)
	{
		price=p;
	}
	public int getprice()
	{
		return price;
	}
	
}

public class Project_for_enum 
{
	
	private int total=0;
	static int bill_no=100;
	int quant;
	String name;
	HashMap<coffee,Integer> obj=new HashMap<coffee, Integer>();
	coffee f;
	public Project_for_enum() 
	{
		bill_no++;
	}
	public void accept()
	{
		int a;
		Scanner sc=new Scanner(System.in);
		do
		{
			System.out.println("1.small(Price per cup: ₹50)");	
			System.out.println("2.medium(Price per cup:₹75)");
			System.out.println("3.large(Price per cup: ₹100)");	
			System.out.println("4.exit");
			System.out.println("enter choice");
			a=sc.nextInt();
			
			
			switch (a) 
			{
			case 1: f=coffee.small;
				    System.out.println("enter quantity");
					int b=sc.nextInt();
					
						obj.put(f,b);
						break;
			case 2:f=coffee.medium;
					System.out.println("enter quantity");
					 b=sc.nextInt();
					
					 obj.put(f,b);
					 break;
			case 3:f=coffee.large;
					System.out.println("enter quantity");
					b=sc.nextInt();
					
					obj.put(f,b);
					break;
			case 4:
						calculate();
						break;
			
			default:System.out.println("invalid choice");
				    break;
			}
		}while(a!=4);
	}
	public void calculate()
	{
		int bill,x=0,y=0,z=0;
		
		if(obj.get(coffee.small) != null)
		{
			 x=obj.get(coffee.small)*50;
			
		}
		if(obj.get(coffee.medium) != null)
		{
			 y=obj.get(coffee.medium)*75;
			
		}
		if(obj.get(coffee.large) != null)
		{
			 z=obj.get(coffee.large)*100;
			
		}
		bill=x+y+z;
		System.out.println("bill no:"+bill_no);
		System.out.println("******************************");
		System.out.println("Total bill is: "+bill);
		System.out.println("******************************");
	/*
	System.out.println((int)obj.get(coffee.small));
	System.out.println((int)obj.get(coffee.medium));
	System.out.println((int)obj.get(coffee.large));
	bill=x+z;
	System.out.println("Bill no is:"+bill_no);
	System.out.println("**********************************************");
	System.out.println("total is:");
	bill=(((int)obj.get(coffee.small)*50)+((int)obj.get(coffee.medium)*75)+((int)obj.get(coffee.large)*100));
	System.out.println(bill);
	*/
	}
	

	public static void main(String[] args) 
	{
		Project_for_enum obj=new Project_for_enum();
		obj.accept();
		Project_for_enum obj1=new Project_for_enum();
		obj1.accept();
	
	
		

	}

}
