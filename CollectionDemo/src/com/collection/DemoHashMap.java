package com.collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class DemoHashMap {

	public DemoHashMap() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<Integer,String> obj=new HashMap<>();
		obj.put(1, "Jayshree");
		obj.put(2, "Priyanka");
		obj.put(3, "Pranoti");
		obj.put(4, "Madhura");
		obj.put(5, "Mahi");
		obj.put(5, "Mayank");
		
		System.out.println(obj);
		

//		Iterator i=obj.iterator();
//		while(i.hasNext())
//			System.out.println(i.next());
	}

}
