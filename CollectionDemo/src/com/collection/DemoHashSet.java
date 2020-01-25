package com.collection;


import java.util.*;

class DemoHashSet 
{
	public static void main(String[] args) 
	{
		HashSet hs=new HashSet();
		//LinkedHashSet hs=new LinkedHashSet();
		//TreeSet hs=new TreeSet();

		hs.add("d");
		hs.add("a");
		hs.add("c");
		hs.add("b");
		hs.add("b");
		hs.add("e");
		hs.add("g");
		hs.add("f");
		hs.add("h");
        hs.add("z");
		System.out.println(hs);
		
		TreeSet<Integer> s=new TreeSet<Integer>();
	
	}
}
