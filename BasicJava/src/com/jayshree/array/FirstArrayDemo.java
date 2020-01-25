package com.jayshree.array;



public class FirstArrayDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//first class object
		int n[]= {12,34,56,78};			
		for (int i=0; i<n.length; i++)
		{
			System.out.println(n[i]);
		}
		System.out.println("****************");
		//array using new keyword
		int m[]=new int[5];
		m[0]=2;
		m[1]=4;
		m[2]=6;
		m[3]=8;
		m[4]=10;
		
		for(int i=0; i<m.length; i++)
			 System.out.println(m[i]);
		String str[]=new String[3];
		
		str[0]="Java";
		str[1]="Net";
		str[2]="Python";
		
		for(int i=0; i<str.length; i++)
			System.out.println(str[i]);
	}

}
