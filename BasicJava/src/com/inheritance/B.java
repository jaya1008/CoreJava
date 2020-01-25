package com.inheritance;

class A{
	
	public void showA()
	{
		System.out.println("A class Show()");
	}
	A getObject()
	{
		return new A();
	}
}
public class B extends A{

	public void showB()
	{
		System.out.println("B class Show()");
	}
	
	
	@Override
	A getObject() {
		// TODO Auto-generated method stub
		return new B();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		B b=new B();
		A a=b.getObject();
		//a.showB();
		a.showA();
		a.getObject();
	}	
	

}
