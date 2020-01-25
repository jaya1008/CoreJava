package com.collection;
import java.util.*;
public class TreeSetDemo 
{
     	
	public static void main(String[] args)
	{
		TreeSet<Integer> times = new TreeSet<Integer>();
		times.add(1205);
		times.add(1505);
		times.add(1545);
		times.add(1830);
		times.add(2010);
		times.add(2100);
		//Use the methods of NavigableSet
		
		System.out.println(times.lower(1600));//lower returns element less than given element
		System.out.println(times.higher(2000));//returns the grater than the given element
		System.out.println(times.ceiling(1540));//returns grater than equals to given element 
		System.out.println(times.floor(1210));//lower returns element less than = to given element

		System.out.println("The first element:"+times.pollFirst());
		System.out.println("The last element: "+times.pollLast());
		System.out.println(times.descendingSet());
		
	}

}
