package com.threadmethod;

class DemoPriority  implements Runnable
{
	Thread t1, t2;

	DemoPriority()
	{
		t1 = new Thread(this, "t1");
		t2 = new Thread(this, "t2");

		t1.start();
		t2.start();

		t1.setPriority(Thread.MAX_PRIORITY);
		t2.setPriority(2);
	}

	public void run()
	{
		if(Thread.currentThread() == t1)
			for(int i=1; i<=5; i++)
			{
				System.out.println("Run method of t1 = " + i);
				try
				{
					Thread.sleep(1000);
				}
				catch(InterruptedException ie)
				{
				}
			}
		else
			for(int i=5; i>=1; i--)
			{
				System.out.println("Run method of t2 = " + i);
				try
				{
					Thread.sleep(1000);
				}
				catch(InterruptedException ie)
				{
				}
			}
	}

	public static void main(String[] args) 
	{
		DemoPriority d = new DemoPriority();
	}
}
