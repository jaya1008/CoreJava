package com.methodlocal;

public class Outer {

	public void show()
	{
		final int i=9;
		class Inner
		{
			public void showInner()
			{
	
				System.out.println(i);
			}
		}
		Inner in =new Inner();
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
