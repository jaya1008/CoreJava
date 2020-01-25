package com.basics;
public class Demo1 {

	public void calculateAvg()
	{
		try
		{
			System.out.println("calculateAvg() begin");
			int arr[]= {1,2,3,4,5,6};
			int sum=0;
			for(int i=0; i<=arr.length; i++)
				sum=sum+arr[i];
			double avg=sum/arr.length;
			System.out.println("Sum ="+sum);
			System.out.println("Avg ="+avg);
		
			
		}
		catch(ArithmeticException e)
		{
			System.out.println(e);
			//e.printStackTrace();
			//System.out.println(e.getMessage());
		}
		System.out.println("calculateAvg() ends...");
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("main begin");
		Demo1 obj=new Demo1();
		try
		{
			obj.calculateAvg();
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("in main catch block");
			System.out.println(e);
		}
		System.out.println("main ends...");
		
	}

}
