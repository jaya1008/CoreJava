package com.collection;

import java.util.Iterator;
import java.util.PriorityQueue;

public class PriorityQueueDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		PriorityQueue<Integer> q=new PriorityQueue<>();
		q.add(1);
		q.add(4);
		q.add(2);
		q.add(89);
		q.add(3);
		q.add(1);
		q.add(21);
		q.add(78);
		
		//System.out.println(q);
	
		Iterator<Integer> iq=q.iterator();
		System.out.println("---------------------");
		while(iq.hasNext())
		{
			System.out.println(iq.next());
		}
		System.out.println("------------------------");
		System.out.println(q.poll());
		System.out.println(q.poll());
		System.out.println(q.poll());
		System.out.println(q.poll());
		System.out.println(q.poll());
		System.out.println(q.poll());
		System.out.println(q.poll());
		System.out.println(q.poll());
		}
	}


