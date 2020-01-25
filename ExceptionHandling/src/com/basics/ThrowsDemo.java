package com.basics;

import java.io.IOException;
import java.sql.SQLException;

public class ThrowsDemo {

public void show() throws InterruptedException ,IOException
	{
		for(int i=2; i<=20; i=i+2)
			System.out.println(i);
		Thread.sleep(1000);
	}
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		ThrowsDemo obj=new ThrowsDemo();
		try {
			obj.show();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
