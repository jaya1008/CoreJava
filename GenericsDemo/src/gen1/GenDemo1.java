package gen1;

import java.io.*;
class GenDemo1 
{
	public static void main(String[] args) 
	{
	 Gen<Integer> iob=new Gen<Integer>(10);

	
		 iob.showType();
		 System.out.println("<<<<<<<<<>>>>>>>>> "+iob.getob());
		
		Integer i= iob.getob();	 
		System.out.println(i);

		 Gen<String> strob=new  Gen<String>("Generic Test");

		 strob.showType();

		 String str=strob.getob();
		 System.out.println("value"+" "+ str);
		// iob=strob;
	}
}


