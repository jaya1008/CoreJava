package com.seed;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;


public class RandomAccessDemo {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		
		RandomAccessFile rs=new RandomAccessFile(".\\src\\file1.java","r");
		
		long size=rs.length();
		
		long curser=size/2;
		
		rs.seek(curser);
		
		String ch;
		
		while((ch=rs.readLine())!=null)
		{
			System.out.println(ch);
		}

	}

}
