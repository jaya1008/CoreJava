package com.jayshree;

import java.util.regex.*;

class  DemoRegex
{
	public static void main(String[] args) 
	{
		Pattern p=Pattern.compile("ab");
		Matcher m=p.matcher("abaaaba");
		boolean b=false;
		while(b=m.find())
		{
			System.out.println(m.start()+ " "+m.group());
		}
	}
}
