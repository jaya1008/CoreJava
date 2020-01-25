package com.collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class StudentAssignment {

	int rollno;
	HashMap<String,Integer> marks;
	String name;
	
	public StudentAssignment( int r,String nm,HashMap m) {

		rollno=r;
		marks=m;
		name=nm;
		
		
	}

	public void display()
	{
		System.out.println("Roll no :" +rollno);
		System.out.println("Name "+name);
		System.out.println("Marks are");
		
        Set s=marks.entrySet();
		Iterator i=s.iterator();
		while(i.hasNext())
			System.out.println(i.next());
	}
	public void calculateResut()
	{
		
		int sum=0;
		for(int i : marks.values())
		{
			sum=sum+i;
		}
		System.out.println(sum);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<String,Integer> m=new HashMap<String,Integer>();
		
		m.put("English",89);
		m.put("Hindi",80);
		m.put("Science",92);
		m.put("Maths",75);
		m.put("Social Science",72);
		StudentAssignment obj=new StudentAssignment(100, "Abhinav", m);
		
		obj.display();
		obj.calculateResut();
	}

}
