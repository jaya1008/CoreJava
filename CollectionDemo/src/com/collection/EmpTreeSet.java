package com.collection;

import java.util.TreeSet;

public class EmpTreeSet {



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TreeSet<Employee> t=new TreeSet<Employee>();
		t.add(new Employee(12, "Jayshree", 12000));
		t.add(new Employee(14, "Sarthak", 67000));
		t.add(new Employee(11, "Pankaj", 29000));
		t.add(new Employee(19, "Priya", 9000));
		System.out.println("By comparing names");
		System.out.println(t);
		EmpComaparator c=new EmpComaparator();
		TreeSet <Employee> t1=new TreeSet<>(c);
		t1.add(new Employee(12, "Jayshree", 12000));
		t1.add(new Employee(14, "Sarthak", 67000));
		t1.add(new Employee(11, "pankaj", 29000));
		t1.add(new Employee(19, "priya", 9000));
		System.out.println("By comparing sal");
		System.out.println(t1);
	}

}
