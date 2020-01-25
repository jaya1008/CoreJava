package com.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class EmpComparator implements Comparator<Employee> {

	public EmpComparator() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public int compare(Employee o1, Employee o2) {
		// TODO Auto-generated method stub
		if (o1.sal ==o2.sal)
			return 0;
		else if(o1.sal <o2.sal)
			return -1;
		else
			return 1;
	}

	public static void main(String[] args) {
		ArrayList<Employee> earr=new ArrayList<>();
		earr.add(new Employee(1,"zzz",56888));
		earr.add(new Employee(74,"ppp",13400));
		earr.add(new Employee(19,"jjj",24000));
		earr.add(new Employee(67,"nnn",89000));
		earr.add(new Employee(33,"kkk",30000));
		System.out.println(earr);
		EmpComparator obj=new EmpComparator();
		Collections.sort(earr, obj);
		
		System.out.println(earr);

	}
	
}
