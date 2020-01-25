package com.layout;

import java.awt.*;
import java.awt.event.*;

import javax.swing.JButton;
import javax.swing.JFrame;

public class TestBorder extends JFrame
{
	JButton LE,LW,LN,LS,LC;
	public TestBorder()
	{
		setVisible(true);
		setSize(300,200);
		setTitle("My first window");
		setLayout(new BorderLayout());
		LE=new JButton("Delhi");
		LW=new JButton("Mumbai");
		LN=new JButton("North");
		LS=new JButton("South");
		LC=new JButton("Center");
		//LC=new Button("Center");
	//	LE.setBackground(Color.black);
//		LN.setAlignment(Label.CENTER);
//		LS.setAlignment(Label.CENTER);
//		LC.setAlignment(Label.CENTER);
		Container con=getContentPane();
		con.add(LE,BorderLayout.EAST);
		//con.add(LE,"East");		
		con.add(LW,"West");
		con.add(LC,"Center");
		con.add(LS,"South");		
		con.add(LN,"North");
//		con.add(new Button("new north"),"North");


		
		
	}

	public static void main(String[] args)
	{
		TestBorder frame=new TestBorder();
		
	}
}


//default layout for frame