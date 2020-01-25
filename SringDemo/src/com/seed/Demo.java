//package com.seed;

public class Demo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="hi";
		System.out.println("s =="+s.hashCode());
		String s1="hi";
		System.out.println("s1 =="+s1.hashCode());
		
		String s2=new String("hi");
		System.out.println("s2 =="+s2.hashCode());
		
		String s3=s2.concat("java student");
		
		System.out.println(s2);
		
		System.out.println("s3 =="+s3.hashCode());
		
		
		/*if(s.equals(s1))
			System.out.println("true");
		else
			System.out.println("false");*/
		
		

	}

}
