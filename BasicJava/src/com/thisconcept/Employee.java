package com.thisconcept;

public class Employee {

	//datamember
	int id;
	String name;
	double sal;
	static String compname;
	static
	{
		System.out.println("I am in static block");
		compname="Seven Mentor Pvt Ltd";
	}
	public Employee() {
		// TODO Auto-generated constructor stub
		
		System.out.println("in employee default");
		
	}
	
	public Employee(int id,String name,double sal)
	{
		//remove the shadowing effect by this keyword
		System.out.println("in parametric const");
		this.id=id;
		this.name=name;
		this.sal=sal;
	}
	public void display()
	{
		System.out.println("Id   :"+this.id);
		System.out.println("Name :"+this.name);
		System.out.println("Sal  :"+this.sal);
		System.out.println("Cname:"+compname);
	}
	public static void changeCompName(String s)
	{
		compname=s;
	
	}
	public void compareEmp(Employee e1)
	{
		if(this.sal >e1.sal)
		{
			System.out.println(this.name +" is having more salary than "+e1.name);
		}
		else
			System.out.println(e1.name +" is having more salary than "+this.name);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("I am in main");
		Employee obj1=new Employee(1, "Mahesh", 30000);
		obj1.display();
		Employee.changeCompName("Seven Mentor Ltd");
		System.out.println("------------------------");
		Employee obj2=new Employee(2, "Ganesh", 40000);
		obj2.display();
		obj1.display();
		System.out.println("-------------------------");
		obj1.compareEmp(obj2);

		Employee obj=new Employee();
		System.out.println("--------------------------");
		obj.display();
	}

}
