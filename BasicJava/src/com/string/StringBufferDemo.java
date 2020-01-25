package com.string;
public class StringBufferDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StringBuffer sb=new StringBuffer("Hello World");
		System.out.println("Length ="+sb.length());
		
		sb.append(" all");
		System.out.println("After appending "+sb +"Length is "+sb.length());
		
		System.out.println(sb.capacity());		
		
		sb.delete(0, 6);
		
		System.out.println("After deleting "+sb);

		System.out.println(sb.equals("sdjfhskdhf"));
		
		System.out.println(sb.charAt(4));
		
		System.out.println(sb.indexOf("all"));
		
		System.out.println(sb.subSequence(0, 5));
		
	    char  ch[]= {'a','b','c'};
	    sb.append(ch);
	    System.out.println("After appending "+sb);
	}

}
