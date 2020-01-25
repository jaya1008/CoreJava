package com.controlstructure;

public class FindMaxOfTwo {

	public int findMax(int n,int m)
	{		
		int max=0;
		if(n>m)
			max=n;
		else
			max=m;
		
		return max;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FindMaxOfTwo obj=new FindMaxOfTwo();
		int m=obj.findMax(34, 90);
		System.out.println("Maximum is "+m);
		
	}

}
