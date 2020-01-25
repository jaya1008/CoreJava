package com.jayshree;

import java.util.Scanner;

public class DemoSwitch {

	public int operation(int op1,int op2,String op)
	{
		
		int r=0;
		switch (op) {
			case "add":
						r=op1+op2;
						break;
			case "sub":
						r=op1-op2;
						break;
			case "mul":
						r=op1*op2;
						break;	
			case "div":
						r=op1/op2;
						break;		
		

			default : 
				       System.out.println("Invalid opearation");
						break;
						
		   
		}
		return r;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		DemoSwitch obj=new DemoSwitch();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter First Number :");
		int op1=sc.nextInt();
		System.out.println("Enter Second Number :");
		int op2=sc.nextInt();
		System.out.println("Enter Opearation like (add/mul/div/sub)");
		String s =sc.next();
		int res=obj.operation(op1, op2, s);
		System.out.println(res);
	}

}
