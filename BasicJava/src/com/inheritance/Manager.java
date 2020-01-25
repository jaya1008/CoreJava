package com.inheritance;

public class Manager extends Employee{
	
    double bonus;
    int nop;
    public Manager() {
		// TODO Auto-generated constructor stub
    	super();
    	System.out.println("in default Manager");
    	bonus=0;
    	nop=0;
	}
    Manager(int id,String name,double s,double b,int n)
    {
   // 	super(id,name,s);
    	System.out.println("in parametric of Manager");
    	
    	bonus=b;
    	nop=n;
    }
    
	@Override
	public String toString() {
		return "Manager [bonus=" + bonus + ", nop=" + nop + ", id=" + id + ", name=" + name + ", sal=" + sal + "]";
	}
	
	@Override
	public double computeSal() {
		// TODO Auto-generated method stub
		return super.computeSal()+bonus;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Manager obj=new Manager();
		System.out.println(obj);
		System.out.println(obj.computeSal());
		Manager obj1=new Manager(2,"bbb",30000,2000, 10);
		System.out.println(obj1);
		double s=obj1.computeSal();
		System.out.println(s);
	}

}
