package com.basic;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;

public class GraphicsDemo extends JFrame{

	/**
	 * @param args
	 */
	GraphicsDemo()
	{
		setSize(500, 500);
		setVisible(true);
		
	}
	public void paint(Graphics g)
	{
		super.paint(g);
	//	Color c=new Color(255, 0, 0);
		Color c1=Color.RED;
		g.setColor(c1);
		
		
		
		g.drawString("Hello Java App", 100,100);
	//	g.drawLine(x1, y1, x2, y2);
		//g.drawArc(x, y, width, height, startAngle, arcAngle);
		//g.drawRect(x, y, width, height);
		//g.drawOval(x, y, width, height);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GraphicsDemo obj=new GraphicsDemo();
		
	}

}
