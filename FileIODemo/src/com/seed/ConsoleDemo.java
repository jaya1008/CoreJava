package com.seed;

import java.io.Console;

//execute on cmd to see output

public class ConsoleDemo {

	/**
	 * @param args
	 */

	public static void main(String[] args) {
		Console c=System.console();
		if(c!=null)
		 {
			String username=c.readLine("Enter your name :");
			char[] pwd=c.readPassword();
			c.printf("Hello "+username+ pwd);
	   	}
	
	}

 }
