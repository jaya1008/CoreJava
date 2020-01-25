package com.seed;
class Demo 
	{
		public static void main(String[] args) 
		{
			Outer o=new Outer();
			Outer.Inner in=o.new Inner();
			in.display();
			
			Outer.Inner in1=new Outer().new Inner();
			//o.show();
		}
	}
