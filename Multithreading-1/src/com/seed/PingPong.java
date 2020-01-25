package com.seed;

class PingPong implements Runnable
	{
		String word;
		public PingPong(String w)
			{
				word = w;
				new Thread(this).start();
			}
	public void run()
	{
		try
			{
				for( int i=0;i<10;i++ )
					{
						System.out .println(word);
						Thread.sleep( 1000);
					}
			}
		catch(Exception e)
			{
					System.out.println(e);
			}
	}
	public static void main(String args[])
	{
			PingPong ping = new PingPong("yoyo");	
		//	ping.start();
			Runnable pong = new PingPong("honey singh");		    
			new Thread(pong).start();	
		        Thread t=new Thread(ping);
		        t.start();
		
	}
}
