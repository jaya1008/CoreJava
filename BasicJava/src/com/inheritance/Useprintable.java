package com.inheritance;

public class Useprintable {

	public Useprintable() {
		// TODO Auto-generated constructor stub
	}

	public static void printUtility(Printable n[]) {
		
		for(Printable p:n)
		{
			p.print();
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Printable p=new Circle();
//		Printable p1=new MyDate();
//		Printable p2=new Employee();
		
		Printable p[];
		p=new Printable[3];
		p[0]=new Circle();
		p[1]=new MyDate(19,7,19);
		p[2]=new Employee(1, "abc", 45000, new MyDate(10,8, 1981));
		
		printUtility(p);
	}

}
