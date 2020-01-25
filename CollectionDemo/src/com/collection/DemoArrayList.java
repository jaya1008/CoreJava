package com.collection;


import java.util.*;

class DemoArrayList 
{
	public static void main(String[] args) 
	{
		ArrayList<String> al=new ArrayList<String>(5);
		System.out.println("initial size of al...." + al.size());

	
		al.add("c");
		al.add("a");
		al.add("b");
		al.add("d");
		al.add("e");
		al.add(1,"a2");

		System.out.println("size after addition..." + al.size());
		System.out.println("content after addition..." + al);
        
		al.remove("a");
		al.remove(2);
       
		System.out.println("content after modification" + al);
		
		ArrayList<Employee> earr=new ArrayList<>();
		earr.add(new Employee(12, "Jayshree", 12000));
		earr.add(new Employee(14, "Sarthak", 67000));
		earr.add(new Employee(11, "Pankaj", 29000));
		earr.add(new Employee(19, "Priya", 9000));
		
		System.out.println(earr);
		EmpComaparator c=new EmpComaparator();
		earr.sort(c);
		System.out.println("After sorting");
	//	System.out.println(earr);
		
		//Iterator demo
	    Iterator<Employee> i=earr.iterator();
	    while(i.hasNext())
	    {
	    	System.out.println(i.next());
	    }
	    
		
	}
}
