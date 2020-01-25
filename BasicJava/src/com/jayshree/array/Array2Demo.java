package com.jayshree.array;

public class Array2Demo {

	public int [][] sumArray(int n[][],int m[][])
	{
		int res[][]=new int[2][2];
		for(int i=0; i<n.length; i++)
		{
			for(int j=0; j<n[i].length; j++)
			{
				res[i][j]=n[i][j]+m[i][j];
				
			}
		}
		return res;
	}
	public void display(int  arr[][])
	{
		System.out.println("Array elements are :");
		for(int i=0; i<arr.length; i++)
		{
			for(int j=0; j<arr[i].length; j++)
			{
				System.out.print("\t"+arr[i][j]);
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[][]= {{10},{20,30,40},{50,60},{70,80,90,100}};
		
		Array2Demo obj=new Array2Demo();
		obj.display(arr);
		
		int a[][]= {{1,2},{3,4}};
		obj.display(a);
		int b[][]= {{5,6},{7,8}};		
		obj.display(b);
		int r[][]=obj.sumArray(a, b);
		System.out.println("Array addition is ");
		obj.display(r);
		
	}

}
