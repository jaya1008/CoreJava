package com.basics;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FinallyDemo {

	public FinallyDemo() {
		// TODO Auto-generated constructor stub
	}
   public int show()
   {
	   System.out.println("in show()");
	   FileInputStream fin=null;
	   try
	   {
		
		  fin=new FileInputStream("E:\\test.txt");
		  int n=10/0;
	   } 
	   catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		   System.out.println("i am in catch");
		   System.out.println(e);
	   }
	   finally
	   {
		   System.out.println("Hello  I am in finally"); 
		   
		   try {
			fin.close();
		    }
		     catch (IOException | NullPointerException e) 
		    {
			// TODO Auto-generated catch block
			   System.out.println(e);
		    }
	   }
	   System.out.println("show() ends..");
	   return 1;
	 
   }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("in main");
		FinallyDemo obj=new FinallyDemo();
		int i;
		try {
			i = obj.show();
			System.out.println(i);
		} catch (ArithmeticException e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		}
		
		System.out.println("main ends...");
	}

}
