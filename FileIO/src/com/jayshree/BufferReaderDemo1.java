package com.jayshree;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferReaderDemo1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		System.out.println("Please Enter the file you want to read :");
		InputStreamReader in=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(in);
		
		String str=br.readLine();
		
		
	}

}
