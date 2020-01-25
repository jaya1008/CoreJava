package com.string;

public class StringDemo {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s="SevenMentor";
		System.out.println(s+"length is "+s.length());
		System.out.println("----------------------");
		
		char ch=s.charAt(2);
		System.out.println(ch);
		System.out.println("------------------------");
		String lower=s.toLowerCase();
		System.out.println(s);
		System.out.println(lower);
		System.out.println("------------------------");
		
		String upper=s.toUpperCase();
		System.out.println(upper);
		
		int i=s.compareTo("SevenMentor");
		System.out.println("Comapare result is "+i);
		
		System.out.println("------------------------");
		
		String substr=s.substring(0, 5);
		System.out.println(substr);
		
		System.out.println("-------------------------");
		String sstr=s.substring(6);
		System.out.println(sstr);
		System.out.println("--------------------------");
		String trim=s.trim();
		System.out.println(trim+ " "+trim.length());
		System.out.println("--------------------------");
		
		boolean f=s.equals("SevenMentor");
		System.out.println(f);	
		
		f=s.equalsIgnoreCase("sevenmentor");
		System.out.println(f);
		System.out.println("------------------");
		String str="claring";
        boolean b= str.endsWith("ing");
        System.out.println(b);
		//s.startsWith(prefix)
		System.out.println("----------------------");
	    String str1="This is a StringDemo program"; 
		System.out.println(str1.indexOf("StringDemo"));
		
		System.out.println(str1.replace('i', 'I'));
		
		String cnm=s.concat(" Pvt Ltd");
		System.out.println(cnm);
		
		StringBuffer sb=new StringBuffer("hello");
	//	sb.
	}
	

}
