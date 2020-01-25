package com.jayshree.array;

import java.util.Scanner;

public class Dynamic2dArray {

	public int[][] accept2Darray()
	{
		int arr[][];
		System.out.println("Enter Row size :");
		Scanner sc=new Scanner(System.in);
		int row=sc.nextInt();
		System.out.println("Enter Col size :");
        int col=sc.nextInt();
        arr=new int[row][col];
        
        for(int i=0; i<arr.length; i++)
        {
        	for(int j=0; j<arr[i].length; j++)
        	{
        		System.out.println("Enter the elements :");
        		arr[i][j]=sc.nextInt();
        	}
         }
 		return arr;
	}
	public int[][] accept2Darray1()
	{
		int arr[][];
		System.out.println("Enter Row size :");
		Scanner sc=new Scanner(System.in);
		int row=sc.nextInt();
		arr=new int[row][];
        for(int i=0; i<arr.length; i++)
        {
        	System.out.println("Enter Col size :");
            int col=sc.nextInt();
            arr[i]=new int[col];
        	for(int j=0; j<arr[i].length; j++)
        	{
        		System.out.println("Enter the elements :");
        		arr[i][j]=sc.nextInt();
        	}
         }
 		return arr;
	}
	public void printArray(int p[][])
	{
		for(int i=0; i<p.length; i++)
        {
        	for(int j=0; j<p[i].length; j++)
        	{
        		
        	    System.out.print("\t"+p[i][j]);
        	}
        	System.out.println();
        }
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Dynamic2dArray obj=new Dynamic2dArray();
		int a[][]=obj.accept2Darray();
		obj.printArray(a);
		
	//	int b[][]=obj.accept2Darray1();
		//obj.printArray(b);
	}

}
