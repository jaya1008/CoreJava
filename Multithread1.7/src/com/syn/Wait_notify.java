package com.syn;

import java.util.Scanner;

class Account11
{
	public static long balance = 5000;
	

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
	public void deposit(int rupees)
	{
		balance=balance+rupees;
	}
}
public class Wait_notify implements Runnable
{
	public static  int amount;
	Account11 a;
	Thread t1,t2;
	Wait_notify()//constructor
	{
		a = new Account11();

		t1 = new Thread(this, "Person1");
		t2 = new Thread(this, "Person2");

		t1.start();
		t2.start();
		
		
			
	}
  public void run() 
    {
	//  synchronized(this)//will sync this class
		
		{
		
			try {
				doTransaction();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
	}

	private void doTransaction() throws InterruptedException 
	{	if(Thread.currentThread()==t1)
	{
		synchronized(this)
		{
		System.out.println(Thread.currentThread().getName() + " is checking the balance = " + a.getBalance());

	
		Scanner sc=new Scanner(System.in);
		System.out.println("enter amount");
		amount=sc.nextInt();
	
			if(a.getBalance()<amount)
		
		{
			wait();
			//Thread.sleep(500);
			a.withDraw(amount);
			System.out.println("current balance is "+a.getBalance());
		System.out.println("success");
			
		}
		
		
	    }
		}
	if(Thread.currentThread() == t2)
	{
		synchronized(this)
		{
			a.deposit(amount);
			System.out.println("after depositing balance is"+a.getBalance());
			notify();
		}
	}
	
	
     }
	public static void main(String[] args) 
	{
		

		Wait_notify obj=new Wait_notify();
		
		
	}
	
	

}
