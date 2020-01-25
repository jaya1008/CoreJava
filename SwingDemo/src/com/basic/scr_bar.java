package com.basic;

import java.awt.*;
import java.awt.event.*;

import javax.swing.JFrame;
import javax.swing.JScrollBar;

class scr_bar extends JFrame implements AdjustmentListener
{
	JScrollBar scr,scb,scg;

	Canvas c;
	Color c1;
	int r,g,b;
	public scr_bar()
	{
		setSize(400,400); 
		setLayout(new FlowLayout());
       scr=new JScrollBar(JScrollBar.HORIZONTAL, 0, 10, 0, 255);
		scb=new JScrollBar(JScrollBar.HORIZONTAL, 0, 10, 0, 255);
		
		scg = new JScrollBar(JScrollBar.HORIZONTAL,0,10,0,255);
		Container con=getContentPane();
		c=new Canvas();
		c.setSize(100,100);
		con.add(scr);
		con.add(scb);
		con.add(scg);
		con.add(c);
	   
		
		scr.addAdjustmentListener(this);
		scb.addAdjustmentListener(this);
		scg.addAdjustmentListener(this);
		show();
	}
	public void adjustmentValueChanged(AdjustmentEvent ae)
	{
		if(ae.getSource()==scr||ae.getSource()==scb||ae.getSource()==scg)
		{
			r=scr.getValue();
		
			b=scb.getValue();
			g=scg.getValue();
			c1=new Color(r,g,b);
			repaint();
		}

	}

	public void paint(Graphics g)
	{
		super.paint(g);
		c.setBackground(c1);
	}

	public static void main(String[] args) 
	{
		new scr_bar();
		System.out.println("Hello World!");
	}
}
