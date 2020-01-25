package com.seed;
class Outer 
	{
		private int a;
		//Inner i=new Inner();
		Outer()
		{
			a=10;
			//i.display();
		}
	
		public void show()
		{
			System.out.println(a);
			//System.out.println(b);
			Inner i=new Inner();
			i.display();
			int j=i.b;
			System.out.println(j);
		}
		class Inner
		{
			public  int b;
			Inner()
			{
				b=20;
			}
			public void display()
			{
				System.out.println(b);
				System.out.println("From Outer "+a);
			}
		};
	
	}