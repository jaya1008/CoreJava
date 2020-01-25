package com.collection;

import java.util.Vector;

class Vector1
{
   public static void main(String args[])
   {
         Vector v=new Vector<>(3, 10);
         
         System.out.println("initial size" + v.size());
         System.out.println("initial capacity" + v.capacity());

          
          v.addElement(new Integer(1));
          v.addElement(new Integer(2));
          v.addElement(new Integer(3));
          v.addElement(new Integer(4));
     
         System.out.println("capacity after addition" + v.capacity());
         System.out.println("capacity after addition size" + v.size());
     
         System.out.println("first element" + (Integer)v.firstElement());
         System.out.println("last element" + (Integer)v.lastElement());
    }
}


         
         



