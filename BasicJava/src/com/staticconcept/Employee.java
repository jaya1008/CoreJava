package com.staticconcept;

public class Employee {
	int id;
	String name;
	int deptno;
	double sal;
	//declared and initalized static variable
	static String compName;
	//="Sevenmentor pvt ltd";

	static {
		
		System.out.println("I am in static block");
		compName="My dream company";
	}
	
	public Employee(int id, String name, int deptno, double sal) {
		super();
		this.id = id;
		this.name = name;
		this.deptno = deptno;
		this.sal = sal;
	}

    public Employee() {
		// TODO Auto-generated constructor stub
	}
    public void display()
    {
    	System.out.println("Eid "+id);
    	System.out.println("Ename "+name);
    	System.out.println("Deptno "+deptno);
    	System.out.println("Sal "+sal);
    	System.out.println("Company Name "+compName);
    }
    public static void displayCompName()
    {
    	System.out.println("From Static method Company Name is "+compName);
    	//System.out.println(id);
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("I am in main()");
		Employee obj=new Employee(1, "Jayshree", 10, 560000);
		obj.display();
		
		Employee.displayCompName();
	}

}
