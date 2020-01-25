package com.seed;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class  Account
{
	int id,bal;
	String name;
	Lock  mylock=new ReentrantLock();
	 Account(int id,int bal,String name)
	{
		 this.id=id;
		 this.bal=bal;
		 this.name=name;
	}

   void setBal(int amt)
	{
         bal=amt;

	}

	int getBal()
	{
		return bal;
	}
	public void withdraw(int amt)
	{
		
		bal=bal-amt;
	}
	
}
