package com.seed;

import java.util.regex.*;
class  DemoRegex2
{
	public static void main(String[] args) 
	{
		Pattern p=Pattern.compile(args[0]);
		Matcher m=p.matcher(args[1]);

		boolean b=false;
		System.out.println("Pattern is " +m.pattern());
		while(b=m.find())
		{
				System.out.println(m.start()+ "   "+m.group());
		}
	}
}

////java DemoRegex2 "\d\w" "ab4 56_7ab"

//4 56
//7 7a
 