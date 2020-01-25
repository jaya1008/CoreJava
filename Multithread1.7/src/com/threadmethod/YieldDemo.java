package com.threadmethod;

class Test implements Runnable
{
	public void run()
	{
		for(int i=1; i<=5; i++)
		{
			System.out.println(Thread.currentThread().getName() + " " + i);
			//Thread.yield();	// gives chance to the same priority thread to run
		}
	}
}

public class YieldDemo 
{
	public static void main(String[] args) 
	{
		Test tt = new Test();

		Thread t1 = new Thread(tt, "First");
		Thread t2 = new Thread(tt, "Second");
				
		t1.start();
		t2.start();
		
	//	t1.setPriority(7);
		//t2.setPriority(8);
	}
}
