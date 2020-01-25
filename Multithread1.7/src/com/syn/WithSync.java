package com.syn;

class Account1
{
	private long balance = 5000;

	public long getBalance()
	{
		return balance;
	}

	public void withDraw(int amount)
	{
		if(balance > amount)
		{
			balance = balance - amount;
			System.out.println("The amount is withdrawn by  " + Thread.currentThread().getName());
		}
		else
			System.out.println(Thread.currentThread().getName() + " : Insufficient amount");
	}
}

public class  WithSync implements Runnable
{
	private Account1 a1;
	private Thread t1, t2;

	WithSync()
	{
		a1 = new Account1();

		t1 = new Thread(this, "Person1");
		t2 = new Thread(this, "Person2");

		t1.start();
		t2.start();
	}

	public void run()
	
	{  synchronized(this)
		{
		
			doTransaction();
		}
	}

	public   void doTransaction()
	{
		System.out.println(Thread.currentThread().getName() + " is checking the balance = " + a1.getBalance());

		a1.withDraw(4500);
	}

	public static void main(String[] args) 
	{
		WithSync wo = new WithSync();
	}
}
