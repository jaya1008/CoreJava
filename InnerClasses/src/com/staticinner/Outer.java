package com.staticinner;

public class Outer {

	static int outer_i=20;
	public void show()
	{
		System.out.println("From Outer class's show() callinf Inner class method");
		Inner in=new Inner();
		in.show();
	}
	static class Inner
	{		
		int i;
		Inner()
		{
			i=10;
		}
		public void show()
		{
			System.out.println("From Inner Outer's data is "+outer_i);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Outer.Inner in=new Outer.Inner();
		
		Outer o=new Outer();
		o.show();

	}

}
