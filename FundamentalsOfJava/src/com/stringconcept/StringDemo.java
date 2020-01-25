package com.stringconcept;

public class StringDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//immuatable
		String s1="hi";
		s1="hello";
		
		String str="Seven Mentor Pvt Ltd";
		int len=str.length();
		System.out.println(str +" Length is "+len);

		char ch=str.charAt(4);
		System.out.println("charAt(4) "+ ch);
		
		String sb=str.substring(5);
		System.out.println("str.substring(5) "+sb);
		String sb1=str.substring(0, 7);
		System.out.println("str.substring(0, 7) "+sb1);
		
		String str1=str.concat(" Shreenath Plaza FC Road");		
		System.out.println("Concationation is "+str1);
		
		boolean b=str.equals("Seven Mentor Pvt Ltd");
		System.out.println(b);
		
		 b=str.equalsIgnoreCase("seven mentor Pvt Ltd");
		System.out.println(b);
		
		
		
	}
	
	

}
