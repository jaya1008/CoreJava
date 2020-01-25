package com.inheritance;

public class Employee {
	//data member
		int id;
		String  name;
		double sal;
		//has-a
		MyDate doj;
	
	    public Employee() {
			// TODO Auto-generated constructor stub
	    	System.out.println("I am in default cons. of Employee");
	    	id=0;
	    	name="default";
	    	sal=20000;
	    	doj=new MyDate();
		}
	    
		public Employee(int id, String name, double sal,MyDate doj) {
			System.out.println("in parametric cons. of Employee");
			this.id = id;
			this.name = name;
			this.sal = sal;
			this.doj=doj;
		}

		public void display()
		{
			
			System.out.println("id "+id);
			System.out.println("Name "+name);
			System.out.println("Sal "+sal);			
			doj.display();
		}
	    public double computeSal()
	    {
	    	return sal;
	    }
	    protected void test()
	    {
	    	System.out.println("Hello  I am Protected method of Employee ");
	    }
		public static void main(String[] args) {
		
			// TODO Auto-generated method stub
			
	
			Employee obj=new Employee();
			obj.display();
			MyDate d=new MyDate(4,7,19);
			Employee obj1=new Employee(1, "aaa", 25000,d);
			
			obj1.display();
			
			Employee obj2=new Employee(2,"bbb",50000,new MyDate(5,7,19));
			obj2.display();
		}

		


}
