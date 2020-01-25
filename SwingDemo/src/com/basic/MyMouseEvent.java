package com.basic;

import java.awt.*;
import java.awt.event.*;

import javax.swing.JFrame;
class MyMouseEvent extends JFrame implements MouseMotionListener
{
	int x,y;
	String str;


	MyMouseEvent()
	{
		setLayout(new FlowLayout());
		x=200;
		y=300;
		setSize(700,500);
		setVisible(true);
		
		this.addMouseMotionListener(this);
		
	
	}
	public void paint(Graphics g)
	{
			super.paint(g);
        str="Hello java"+x+"and "+y; 
	
		g.drawString(str,x,y);
	}
	public void mouseMoved(MouseEvent e)
	{
	  x=e.getX();
	   y=e.getY();
	   repaint();
    
	}
	public void mouseDragged(MouseEvent e)
	{
	    x=e.getX();
	   y=e.getY();
		repaint();
	}
	public static void main(String a[])
	{
		MyMouseEvent me=new MyMouseEvent();
	}
};