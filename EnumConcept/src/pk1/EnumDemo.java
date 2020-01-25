package pk1;

enum Fruit {
    Apple, Mango, Banana, Jackfruit, Orange
}

class EnumDemo 
{
	public static void main(String[] args) 
	{
		Fruit f;
		f = Fruit.Apple;
		System.out.println("Selected Fruit : "+f);

		System.out.println();
		
		f = Fruit.Orange;

		if(f==Fruit.Apple)
			System.out.println("Fruit is Apple");

		if(f==Fruit.Orange)
			System.out.println("Fruit is Orange");

		switch(f)
		{
			case Apple :
				System.out.println("Apple is sweet");
				break;

			case Mango :
				System.out.println("Mango is sweet");
				break;
			
			case Banana :
				System.out.println("Banana is sweet");
				break;

			case Jackfruit :
				System.out.println("Jackfruit is sweet");
				break;

			case Orange :
				System.out.println("Orange is sweet");
				break;
		}
		

	}
}
