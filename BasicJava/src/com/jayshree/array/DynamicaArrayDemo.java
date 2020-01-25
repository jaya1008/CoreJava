package com.jayshree.array;

import java.util.Scanner;

public class DynamicaArrayDemo {

	public int[] acceptArray()
	{
		int arr[];
		System.out.println("Enter the size of array :");
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		arr=new int[size];
		for(int i=0; i<arr.length; i++)
		{
			System.out.println("Enter the elements :");
			int ele=sc.nextInt();
			arr[i]=ele;
		
		}
				
		return arr;
	}
	public void printArray(int obj[])
	{
		
		for(int i:obj)
			System.out.println(i);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		DynamicaArrayDemo obj=new DynamicaArrayDemo();
		int a[]=obj.acceptArray();
		
		obj.printArray(a);
	}

}
