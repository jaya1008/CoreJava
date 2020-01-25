package innerstatic;

class Outer
{
	static  int var=10;
	static  int display()
	{
		var=20;
		System.out.println(var);
		inner.display1();
		return var;

	}

	static class inner
	{
		static int var1=5;
		 static void display1()
		{
			System.out.println(var1);
			System.out.println(var);
			display();
		}
	}

	public static void main(String args[])
	{
			int j;
			Outer out=new Outer();
			j=out.display();
			
           inner i=new inner();
		   i.display1();
		   
		  Outer.inner i1=new Outer.inner();
		   i1.display1();



	}

};