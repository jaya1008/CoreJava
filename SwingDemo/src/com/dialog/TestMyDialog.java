package com.dialog;

import java.awt.*;
import java.awt.event.*;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JTextField;

class MyDialog1 extends JDialog implements ActionListener
{
	JButton b;
	JTextField txt_name;
	String nm=" ";
	MyFrame f;
	
	MyDialog1(MyFrame fr,String str)
	{
		super(fr,str);
		f=fr;
		setSize(300,300);
		setLayout(new FlowLayout());
		 b=new JButton("ok");
		 txt_name=new JTextField(15);
		b.addActionListener(this);
		add(txt_name);
		add(b);	
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		nm=txt_name.getText();
		f.repaint();
		dispose();
	}
   
};

class MyFrame extends JFrame implements 
ActionListener
{
    Button sd;
    MyDialog1 md;
	public 	MyFrame()
	{
		   System.out.println("in costruc");
			Container con=getContentPane();
			setLayout(new FlowLayout());
			sd=new Button("Show Dialog");
			con.add(sd);
			sd.addActionListener(this);
			setSize(700,700);
			setVisible(true);
			 md=new MyDialog1(this,"My new dialog");
	}
	public void actionPerformed(ActionEvent ae)
	{
		
		md.show();
	}	
	public void paint(Graphics g)
	{
		super.paint(g);
		System.out.println("in paint");
		g.drawString(md.nm,100, 150);
	}

};

class TestMyDialog
{
	public static void main(String[] args) 
	{
		MyFrame mf=new MyFrame();
		
	}
}
