package com.seed;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Demo {

	public Demo() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		
		
		try {
			Class c = Class.forName("com.seed.DemoAnno");
			
			System.out.println(c.getName());
			
			Field f[] = c.getDeclaredFields();
			
			for(Field a  :f)
			{
				System.out.println(a);
			}
			
			System.out.println("\n\n");
			Method m[] = c.getDeclaredMethods();
			
			for(Method s  :m)
				System.out.println(s);
			
			Constructor c1[] = c.getDeclaredConstructors();
			
			for(Constructor p : c1)
			System.out.println(p);
			
			Annotation a[] = c.getAnnotations();
			for(Annotation s : a)
			{
				System.out.println(s);
			}
			
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}













