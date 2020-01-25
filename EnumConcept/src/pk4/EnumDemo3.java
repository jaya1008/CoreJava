package pk4;

enum Fruit {
    Apple, Mango, Banana, Jackfruit, Orange
}

class EnumDemo3
{
	public static void main(String[] args) 
	{
		Fruit f1,f2,f3;

		System.out.println("Here are all fruit constants"+
			" and their ordinal values");
		for(Fruit ft : Fruit.values())
			System.out.println(ft+" : "+ft.ordinal());

		f1 = Fruit.Apple;
		f2 = Fruit.Mango;
		f3 = Fruit.Apple;

		if(f1.compareTo(f2)<0)
			System.out.println(f1 +" comes before "+f2);

		if(f1.compareTo(f2)>0)
			System.out.println(f1 +" comes after "+f2);
		
		if(f1.compareTo(f3)==0)
			System.out.println(f1 +" equals "+f3);

		if(f1.equals(f2))
			System.out.println(" Error ");

		if(f1.equals(f3))
			System.out.println(f1 +" equals "+f3);
		
		if(f1==f3)
			System.out.println(f1 +" == "+f3);
	
	}
}
