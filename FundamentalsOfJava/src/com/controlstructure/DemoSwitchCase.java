package com.controlstructure;

import java.util.Scanner;

public class DemoSwitchCase {

	
	public void display(int d,int m,int y)
	{
		System.out.println("in display()");
		String mon="";
		switch(m)
		{
		case 1:
			    mon="Jan";
				break;
		case 2:
			   mon="Feb";
			   break;
		case 3:
				mon="March";
				break;
		case 4:
				mon="Apr";
				break;
		case 5:
				mon="May";
				break;
		case 6:
					
				mon="Jun";
				break;
		default:
				mon="Not a valid month";
				}
		System.out.println("Date is "+d+"-"+mon+"-"+y);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		
		System.out.println("Please enter dd :");
		int dd=sc.nextInt();
		
		System.out.println("Please enter mm :");
		int mm=sc.nextInt();
		
		System.out.println("Please enter yy :");
		int yy=sc.nextInt();
		
		DemoSwitchCase obj=new DemoSwitchCase();
		obj.display(dd, mm, yy);
		
	}

}
