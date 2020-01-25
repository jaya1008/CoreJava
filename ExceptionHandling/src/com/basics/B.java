package com.basics;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;

class A
{

	public void show() throws IOException
	{
		System.out.println("I am in show() of A");
	}
}

public class B extends A{

	public void show() throws FileNotFoundException
	{
		//super.show();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
