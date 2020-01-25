package com.layout;

import java.awt.*;
import java.awt.event.*;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class TestFlow extends JFrame
{
	JLabel LE,LW,LN,LS,LC;
	public TestFlow()
	{
		setSize(300,200);
		setTitle("My first window");
		setLayout(new FlowLayout());
		LE=new JLabel("East");
		LW=new JLabel("West");
		LN=new JLabel("North");
		LS=new JLabel("South");
		LC=new JLabel("Center");
		Container con=getContentPane();
		con.add(LE);		con.add(LW);
		con.add(LS);		con.add(LN);
		con.add(LC); 
		
		
	}

	public static void main(String[] args)
	{
		TestFlow frame=new TestFlow();
		frame.show();
	}
}


// default layout for panel