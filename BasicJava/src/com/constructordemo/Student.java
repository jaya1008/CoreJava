package com.constructordemo;

public class Student {

	int rollno;
	String name;
	int marks[];
	public void setData(int r,String nm,int m[])
	{
		rollno=r;
		name=nm;
		marks=m;
	}
	public void display()
	{
		System.out.println("Students details are");
		System.out.println("Rollno :"+rollno);
		System.out.println("Name   :"+name);
		System.out.println("Marks  :");
		for(int i=0; i<marks.length; i++)
			System.out.print("\t"+marks[i]);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student obj=new Student();
		int m[]= {67,45,89,81,74};
		obj.setData(1, "Pankaj", m);
		obj.display();
	}

}
