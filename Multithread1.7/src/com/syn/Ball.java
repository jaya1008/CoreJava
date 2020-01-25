package com.syn;

import java.awt.*;
import java.awt.event.*;

import javax.swing.JFrame;

public class Ball extends JFrame implements Runnable
{
	private Thread red, green, blue;
	private int rx=1, gx=1, bx=1, ry = 100, gy = 300, by = 500;

	public Ball()
	{
		setSize(900, 900);
		
		red = new Thread(this, "RED");
		green = new Thread(this, "GREEN");
		blue = new Thread(this, "BLUE");

		red.start();

		green.start();
		blue.start();


		setVisible(true);
	}

	public void run()
	{
		while(true)
		{
			try
			{
				if(Thread.currentThread() == red)
				{
					synchronized(this)
					{
						if(rx%300 == 0)
						{
							wait();
						//notifyAll();
						}	
						rx++;
					}
					Thread.sleep(50);
				}
				else
					if(Thread.currentThread() == green)
					{
						synchronized(this)
						{
							if(gx%300 == 0)
							{
								System.out.println("GreenWait");
								wait();
								System.out.println("Green wakeup");
							}	
							gx++;
						}
						Thread.sleep(30);
					}
					else
						if(Thread.currentThread() == blue)
						{
							synchronized(this)
							{
								if(bx%300 == 0)
								{
									System.out.println("BlueWait");
									wait();
									notify();
									System.out.println("blue wakeup");
								}	
								bx++;
							}
							//notify();
							Thread.sleep(10);
						}
			}
			catch (InterruptedException ie)
			{
				ie.printStackTrace();
			}

			repaint();
		}
	}

	public void paint(Graphics g)
	{
		super.paint(g);
		g.setColor(Color.RED);
		g.fillOval(rx, ry, 100, 100);

		g.setColor(Color.GREEN);
		g.fillOval(gx, gy, 100, 100);

		g.setColor(Color.BLUE);
		g.fillOval(bx, by, 100, 100);
	}

	public static void main(String[] args) 
	{
		Ball b = new Ball();
	}
}
