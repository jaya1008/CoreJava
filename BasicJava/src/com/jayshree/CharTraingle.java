package com.jayshree;

import java.util.Scanner;

public class CharTraingle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		  Scanner sc = new Scanner(System.in);
	        int size = 0;
	        Character c;

	        System.out.println("Enter height of the triangle : ");
	        size = sc.nextInt();

	        System.out.println("Which character you want to use : ");
	        c = sc.next().charAt(0);

	        int i, j, k;

	        for (i = 0; i < size + 1; i++)
	        { 
	        	for (j = size; j > i; j--)
	        	{
	                System.out.print(" ");
	            }
	            for (k = 0; k < (2 * i - 1); k++) 
	            {
	                System.out.print(c);
	            }
	            System.out.println();
	        }


	}

}
