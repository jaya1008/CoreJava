package innerlocal;
class Outer 
{
	private int a;
	Outer()
	{
		a=10;
	}
	public void display()
	{
		System.out.println("in outer's display");
		
	}
	public void show()
	{
		System.out.println(a);
		int i=5;
		  class Inner
		  {
			private    int b;
			Inner()
			{
				b=20;
			//	i=10;
			}
			public  void display()
			{
		 //display();
				System.out.println(b);
		
			}
	     }
		Inner in=new Inner();
		in.display();
		
	}
public static void main(String[] args) 
	{
		Outer o=new Outer();
		o.show();
	}
}



