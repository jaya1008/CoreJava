package com.arraydemo;

import java.util.Scanner;

public class Array2dDemo {
	
	public int[][] acceptArray()
	{
		
		int arr[][];
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter row size :");		
		int row=sc.nextInt();
		System.out.println("Please enter col size :");
		int col=sc.nextInt();
		
		arr=new int[row][col];
		
		for(int i=0; i<arr.length; i++)
		{
			for(int j=0; j<arr[i].length; j++)
			{
				System.out.println("Please enter the element ");
				arr[i][j]=sc.nextInt();
			}
		}
		
		return arr;
	}
	public void displayArray(int a[][])
	{
		
		System.out.println("Array elements are :");
		for(int i=0; i<a.length; i++)
		{
			for(int j=0; j<a[i].length; j++)
			{
				System.out.print("  "+a[i][j]);
			}
			System.out.println();
		}
		
		
	}
	public static void main(String[] args) {
	
		Array2dDemo obj=new Array2dDemo();
		// first class syntax for 2-d array
		int arr[][]= {{10,20},{30,40,50},{60,70,80,90},{100}};
		
		obj.displayArray(arr);
		//2-d array with new keyword
		
		int arr1[][];
		arr1=new int[2][2];
		
		arr1[0][0]=1;
		arr1[0][1]=2;
		arr1[1][0]=3;
		arr1[1][1]=4;
		
		obj.displayArray(arr1);
		
		int p[][]=obj.acceptArray();
		obj.displayArray(p);
	}

}
