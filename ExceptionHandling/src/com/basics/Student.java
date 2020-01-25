package com.basics;

public class Student {

	int rollno;
	String name;
	int mark;	
	public Student()
	{
		
	}
	public Student(int rollno, String name, int mark)
			throws InvalidMarksEXception 
	{
		super();
		this.rollno = rollno;
		this.name = name;
		if(mark >100 || mark <0)
			throw new InvalidMarksEXception(mark);
		this.mark = mark;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			Student s=new Student(1, "aaaa", -120);
		} catch (InvalidMarksEXception e) {
			// TODO Auto-generated catch block
		//	e.printStackTrace();
			System.out.println(e);
		}
		
	}

}
