package pk3;

enum Fruit {
    Apple(20), Mango(60), Banana(5), Jackfruit(50), Orange;

	private int price;

	Fruit()
	{
		price = 0;
		System.out.println("in defalut");
	}

	Fruit( int p ) // parameterized constructor
	{
		price = p;
		System.out.println("in parametric");
	}

	int getPrice()
	{
		return price;
	}
	
}

class EnumDemo2
{
	public static void main(String[] args) 
	{
		System.out.println("in main");
		System.out.println("Price of Mango "+Fruit.Mango.getPrice()+"/-");

		System.out.println("Price of each fruit per 5 pieces ");

		for(Fruit ft : Fruit.values()) // one by one each enum member is accessed
			System.out.println(ft +" costs "+ft.getPrice()+"/-");

	}
}
