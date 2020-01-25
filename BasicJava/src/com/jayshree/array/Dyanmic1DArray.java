package com.jayshree.array;

import java.util.Scanner;

public class Dyanmic1DArray {

	public void displayArray(int n[])
	{
		System.out.println("Array elements are :");
		for(int i=0; i<n.length; i++)
			System.out.print("\t" +n[i]);
		
		System.out.println();
	}
	public int[] acceptArray()
	{
		System.out.println("Enter the sized of array :");
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		
		int arr[]=new int[size];
		for(int i=0; i<arr.length;i++)
		{
			System.out.println("Please enter the array element "+(i+1));
			int ele=sc.nextInt();
			arr[i]=ele;
		}
		return arr;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Dyanmic1DArray obj=new Dyanmic1DArray();
		int p[]=obj.acceptArray();
		obj.displayArray(p);
	}

}
