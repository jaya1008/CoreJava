package com.jayshree.array;
public class ArrayDemo {

	public void sortArray(int n[])
	{
		for(int i=0; i<n.length; i++)
		{
			for(int j=i+1;j<n.length; j++)
			{
				int temp=0;
				if(n[i]>n[j])
				{
					temp=n[i];
					n[i]=n[j];
					n[j]=temp;
				}
					
			}
		}
		displayArray(n);
		
	}
	public void printReverse(int arr[]) 
	{
		System.out.println("Reverse printing is .....");
		for(int i=arr.length-1; i>=0; i--)
		{
			System.out.print("\t"+arr[i]);
		}
		
	}
	public void sumArrays(int n[],int m[])
	{
		if(n.length==m.length)
		{
			int res[]=new int[n.length];
			for(int i=0; i<n.length; i++)
				res[i]=n[i]+m[i];
			
			displayArray(res);
		}
		
		else
			System.out.println("Addition is not possible");
	}	
	public int arraySum(int arr[])
	{
		int sum=0;
		for(int i=0; i<arr.length; i++)
			sum=sum+arr[i];
		return sum;
	}
	public void displayArray(int n[])
	{
		for (int i=0; i<n.length; i++)
		{
			System.out.print("\t"+n[i]);
		}
		System.out.println();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayDemo obj=new ArrayDemo();
		//first class object
		int n[]= {1,2,3,4,5};
		obj.displayArray(n);
		int r=obj.arraySum(n);
		System.out.println("Array addition is "+r);
		System.out.println();
		//new keyword 
		int arr[];
		arr=new int[5];
		arr[0]=5;
		arr[1]=10;
		arr[2]=15;
		arr[3]=20;
		arr[4]=25;
	
		r=obj.arraySum(arr);
		System.out.println("Array addition is "+r);
		obj.displayArray(arr);
		System.out.println("Array addition is ");
		obj.sumArrays(n,arr);
		
		int s[]= {5,1,3,7,10};
		System.out.println("Unsorted array is ");
		obj.displayArray(s);
		System.out.println("Sorted array is ");
		obj.sortArray(s);
		obj.printReverse(s);
		
	}

}
