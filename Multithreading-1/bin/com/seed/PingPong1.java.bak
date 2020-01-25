package com.seed;

class PingPong1 extends Thread
{
	String word;
	
	public PingPong1(String w)
		{
		word = w;
		}
		public void run()
		{
		try
		{
			for( int i=0;i<10;i++ )
				{
					System.out .println(word);
					Thread.sleep(1000);
				}
		}
		catch(Exception e)
			{
				System.out.println(e);
		    }
		}
	public static void main(String args[])
	{
			PingPong1 	t1 = new PingPong1("yoyo");
			t1.start();

			Thread t2 = new PingPong1("honey singh");
			t2.start();
		

	}
}



	
