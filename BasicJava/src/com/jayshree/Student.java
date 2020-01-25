package com.jayshree;

public class Student 
{
	//Data memember
	int rollno;
	String name,addr;
	int marks[];
	
	public void setDate(int r,String nm,String a,int m[])
	{
		rollno=r;
		name=nm;
		addr=a;
		marks=m;
		
		
	}
	public void display()
	{	
		System.out.println("Rollno :"+rollno);
		System.out.println("Name   :"+name);
		System.out.println("Address:"+addr);
		
		System.out.println("Five Subjects marks are :");
		for(int m:marks)
			System.out.println(m);
	}
	public double calculatePer()
	{
		int sum=0;
		double per=0.0;		
		for(int m:marks)
			sum=sum+m;		
		per=(sum*100)/500;		
			
		return per;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student s1=new Student();
		
		int m[]= {70,89,56,67,90};
		
		s1.setDate(1, "aaa", "pune", m);
		s1.display();
		double p=s1.calculatePer();

		System.out.println("Percentage is "+p);
		
		System.out.println("**************************"); 
		
		Student s2=new Student();
		
		int m1[]= {45,56,71,61,86};
		
		
		s2.setDate(2, "bbb", "Mumbai", m1);
		s2.display();

		 p=s2.calculatePer();

		System.out.println("Percentage is "+p);

			}

}
