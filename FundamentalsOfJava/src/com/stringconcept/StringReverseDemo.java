package com.stringconcept;

public class StringReverseDemo {

	public String strRev(String str)
	{
		String s="";
		for(int i=str.length()-1; i>=0; i--)
			s=s+str.charAt(i);		
		
		return s;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StringReverseDemo obj=new StringReverseDemo();
		System.out.println(obj.strRev("Hello"));
		
		String str="This is String word count demo";
		int count =1;
		for(int i=0; i<str.length()-1; i++)
		{
			if(str.charAt(i)==' ')
				count++;
			
		}
		System.out.println("No of words are "+count);
	}

}
