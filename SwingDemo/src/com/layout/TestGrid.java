package com.layout;

import java.awt.*;
import java.awt.event.*;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class TestGrid extends JFrame
{
	JLabel l1,l2,l3,l4;
	JPanel p;
	public TestGrid()
	{
		setSize(300,300);
		setTitle("My first window");
		p=new JPanel();
		p.setSize(200,200);
		p.setLayout(new GridLayout(2,2));
		
		l1=new JLabel("One");
		l2=new JLabel("Two");
		l3=new JLabel("Three");
		l4=new JLabel("Four");
		
		p.add(l1);
		p.add(l2);
		p.add(l3);
		p.add(l4);
	
		Container con=getContentPane();
	
		con.add(p);

		
		
	}

	public static void main(String[] args)
	{
		TestGrid frame=new TestGrid();
		frame.show();
	}
}

