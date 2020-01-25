package com.seed;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;





public class ReentrantDemo implements Runnable
{
	private Account a;
	private Thread p1, p2;

	public ReentrantDemo()
	{
		a = new Account(1,5000,"acc1");

		p1 = new Thread(this, "Person1");
		p2 = new Thread(this, "Person2");

		p1.start();
		p2.start();
	}

	public void run()
	{
		transaction();
	}

	public void transaction()
	{
		a.mylock.lock();
		System.out.println(Thread.currentThread().getName() + " is checking the balance : " + a.getBal());

		try
		{
			Thread.sleep(1000);
		}
		catch(InterruptedException ie)
		{
			ie.printStackTrace();
		}

		System.out.println(Thread.currentThread().getName() + " is withdrawing...");
		a.withdraw(4500);
		System.out.println("After Withdraw");
		System.out.println(Thread.currentThread().getName() + " balance is : " + a.getBal());
		a.mylock.unlock();
	}

	public static void main(String[] args) 
	{
		ReentrantDemo w = new ReentrantDemo();
	}
}

