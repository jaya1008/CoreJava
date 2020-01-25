package com.collection;

public class Employee implements Comparable<Employee> {

	int eid;
	String nm;
	double sal;
	public Employee() {
		// TODO Auto-generated constructor stub
	}
     
	public Employee(int eid, String nm, double sal) {
		super();
		this.eid = eid;
		this.nm = nm;
		this.sal = sal;
	}
    
	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", nm=" + nm + ", sal=" + sal + "]";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	@Override
	public int compareTo(Employee e) {
		// TODO Auto-generated method stub
		
		System.out.println("in compareTo of Employee");
		return this.nm.compareTo(e.nm);
	}

}
