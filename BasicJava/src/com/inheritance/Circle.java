package com.inheritance;

public  class Circle extends Shape implements Printable{

	double r=3.4;

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Circle c=new Circle();
		c.print();
	}


	@Override
	public void print() {
		// TODO Auto-generated method stub
		
		System.out.println("Area is "+area());
	}


	@Override
	public double area() {
		// TODO Auto-generated method stub
		 return 3.14*r*r;
	}




	

}
