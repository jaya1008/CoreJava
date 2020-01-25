package com.jayshree;

import java.io.*;
class FileInputStreamDemo 
{
	public static void main(String[] args) throws IOException
	{
		int size;
		
		FileInputStream f=new 
		FileInputStream("E:\\JavaDemo\\JavaFundamentals\\src\\com\\arraydemo\\Array2dDemo.java");

		FileOutputStream fout=new 
				FileOutputStream("CopiedArray2dDemo.java");

		int n=f.available();

		for(int i=0;i<n;i++)
		{
			//System.out.print((char)f.read());
			fout.write(f.read());
		}
		f.close();
		fout.close();
		System.out.println("File written successfully");
	}
}
