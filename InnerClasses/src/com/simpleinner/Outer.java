package com.simpleinner;

public class Outer {

	int outer_a;
	Outer()
	{
		outer_a=10;
	}
	
	public Outer(int outer_a) {
		super();
		this.outer_a = outer_a;
	}
    public void displayOuter()
    {
    	System.out.println("Outer's display() "+outer_a);
    	Inner in=new Inner();
    	System.out.println("From Outer Inner data is "+in.inner_a);
    }
    class Inner
    {
    	int inner_a;
    	
    	public Inner() {
			// TODO Auto-generated constructor stub
    		inner_a=20;
		}

		public Inner(int inner_a) {
			super();
			this.inner_a = inner_a;
		}
    	public void displayInner()
    	{
    		System.out.println("Inner class's displayInner() "+inner_a);
    		System.out.println("From Inner class displayInner() Outer data is "+outer_a);
    	}
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Outer o=new Outer();
		o.displayOuter();
		Outer.Inner in=o.new Inner();
		in.displayInner();
	}

}
