package com.threadmethod;

class DemoJoin  extends Thread
{
	public void run()
	{
		for(int i=1; i<=5; i++)
		{
			System.out.println("Run method i = " + i);
		}
	}

	public static void main(String[] args) throws InterruptedException
	{
		System.out.println("In main thread");

		Thread t = new DemoJoin();
		t.start();
		
		System.out.println("\nIs t alive? " + t.isAlive());

		t.join();

		System.out.println("\nIs t alive? " + t.isAlive());

		for(int i=1; i<=5; i++)
			System.out.println("Main method i = " + i);

		System.out.println("Main exited");
	}
}
