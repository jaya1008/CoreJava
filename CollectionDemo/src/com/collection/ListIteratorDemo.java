package com.collection;
import java.util.*;
/* In this demo we use the Iterator on the list to access the data*/
class Dog
{
	public String name;
	Dog(String n)
	{
		name = n;
	}
}
public class ListIteratorDemo 
{
	
	public static void main(String[] args) 
	{
	    List<Dog> d = new ArrayList<Dog>();
	    Dog dog = new Dog("aiko");
	    d.add(dog);
	    d.add(new Dog("clover"));
	    d.add(new Dog("magnolia"));
	    d.add(new Dog("Bandu"));
	    Iterator i3 = d.iterator();
	    while(i3.hasNext())
	    {
	    	Dog d2 = (Dog)i3.next();
	    	System.out.println(d2.name);
	    	
	    }
	    System.out.println("size:"+d.size());
	    System.out.println("aiko"+d.indexOf(dog));
	    d.remove(2);
	    Object []oa = d.toArray();
	    for(Object o:oa)
	    {
	    	Dog d2 = (Dog)o;
	    	System.out.println("oa:"+d2.name);
	    }
	    

	}

}
