package com.jayshree;

import java.util.Scanner;


public class ScannerDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		
		System.out.println("Enter number : ");
		if(s.hasNextInt())
		{
			System.out.println("you entered a integer  : "+s.nextInt());
		}
		else
			if(s.hasNextFloat())
			{
				System.out.println("you entered a float  : "+s.nextFloat());
			}
			else
				if(s.hasNextDouble())
				{
					System.out.println("you entered a double  : "+s.nextDouble());
				}
				else
					
					{
						System.out.println("Token not a number");
					}
		

	}

}
