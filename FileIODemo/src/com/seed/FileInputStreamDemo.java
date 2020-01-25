package com.seed;

import java.io.*;
class FileInputStreamDemo 
{
	public static void main(String[] args) throws IOException
	{
		int size;
		
		FileInputStream f=new FileInputStream("Z:\\Core java\\javaLect\\Demo\\Date1.java");

		int n=f.available();

		for(int i=0;i<n;i++)
		{
			System.out.print((char)f.read());
		}
		f.close();
	}
}
