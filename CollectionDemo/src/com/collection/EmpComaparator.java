package com.collection;

import java.util.Comparator;

public class EmpComaparator implements Comparator<Employee> {

	@Override
	public int compare(Employee e1, Employee e2) {
		// TODO Auto-generated method stub
		System.out.println("in EmpComaparator");
		if(e1.sal==e2.sal)
			return 0;
		else if(e1.sal <e2.sal)
			return -1;
		else
			return 1;
	}

}
