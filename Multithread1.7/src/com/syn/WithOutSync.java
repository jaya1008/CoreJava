package com.syn;

class Account
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

public class  WithOutSync implements Runnable
{
	private Account a;
	private Thread t1, t2;

	WithOutSync()
	{
		a = new Account();

		t1 = new Thread(this, "Person1");
		t2 = new Thread(this, "Person2");

		t1.start();
		t2.start();
	}

	public void run()
	{
		doTransaction();
	}

	public void doTransaction()
	{
		System.out.println(Thread.currentThread().getName() + " is checking the balance = " + a.getBalance());

		a.withDraw(4500);
	}

	public static void main(String[] args) 
	{
		WithOutSync wo = new WithOutSync();
	}
}
