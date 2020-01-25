package com.threadmethod;

import java.awt.*;

import javax.swing.JFrame;

class Move extends JFrame implements Runnable
{
	private Thread t1, t2;
	private int x1=0, x2=450;

	Move()
	{
		setSize(500, 400);

		t1 = new Thread(this, "seed");
		t2 = new Thread(this, "infotech");

		t1.start();
		t2.start();

		setVisible(true);
	}

	public void run()
	{
		while(x1+55 <= x2)
		{
			if(Thread.currentThread() == t1)
				x1++;
			else
				x2--;

			






























	}

	public void paint(Graphics g)
	{
		super.paint(g);
		g.setFont(new Font("Arial", Font.BOLD, 20));

		g.setColor(Color.BLUE);
		g.drawString("SEED", x1, 200);

		g.setColor(Color.RED);
		g.drawString("INFOTECH", x2, 200);
	}
}

public class MovingStrings 
{
	public static void main(String[] args) 
	{
		Move m = new Move();
	}
}
