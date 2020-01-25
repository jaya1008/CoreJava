package com.seed;

import java.awt.Color;
import java.awt.Graphics;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

import javax.swing.JFrame;


public class ConditionDemo extends JFrame implements Runnable 
{
	Thread b1,b2,b3;
	int b1x,b2x,b3x;
	Lock l;
	private Condition c;
	
	public ConditionDemo()
	{
		
		l=new ReentrantLock();
		c=l.newCondition();
	
		b1=new Thread(this);
		b2=new Thread(this);
		b3=new Thread(this);
		
		b1.start();
		b2.start();
		b3.start();
		
		setSize(600,600);
		setVisible(true);
		getContentPane().setBackground(Color.blue);
	}

	public void paint(Graphics g)
	{
		super.paint(g);
		g.setColor(Color.yellow);
		g.fillOval(b1x, 100,60, 60);
		g.setColor(Color.CYAN);
		g.fillOval(b2x, 250,60, 60);
		g.setColor(Color.magenta);
		g.fillOval(b3x, 400,60, 60);
		
		
	}
	
	
	@Override
	public void run() 
	{
	   try
	   {
		   while(true)
		   {
		if(Thread.currentThread()==b1)
		{
			this.l.lock();
				{
					if(b1x==200)
					{
						c.signal();
						//c.signalAll();
					}	
						
					b1x++;
					
				}
				this.l.unlock();
			Thread.sleep(50);
		}
		
		
		if(Thread.currentThread()==b2)
		{
			this.l.lock();
			
				{
					if(b2x==200)
					{
						System.out.println("b2 wait");
						c.await();
						System.out.println("b2 wakeup");
					}
					b2x++;
					
				}
				this.l.unlock();
			Thread.sleep(30);
		}
		if(Thread.currentThread()==b3)
		{
			this.l.lock();
				{
					if(b3x==200)
					{
						System.out.println("b3 wait");
						c.await();
						System.out.println("b3 wakeup");
					}	
					b3x++;
					
				}
				this.l.unlock();
			Thread.sleep(10);
		}
		repaint();
		   }
	   }
	   catch(InterruptedException e)
	   {
		   e.printStackTrace();
	   }
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		new ConditionDemo();
	}

}
