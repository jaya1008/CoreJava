package com.basic;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class GuiClass extends JFrame{

	/**
	 * @param args
	 */
	JLabel l1,l2,l3;
	JTextField user;
    JPasswordField pwd;	
    JButton valid;
    JButton clear;
    Container con;
    GuiClass()
    {
    	
    	setVisible(true);
    	setSize(400,400);
    	setTitle("User Login Form");
    	con= getContentPane();
    	setLayout(new FlowLayout());
    	 l1=new JLabel("Enter Username");
    	
    	con.add(l1);
    	 user=new JTextField(10);
    	 con.add(user);
    	 l2=new JLabel("Enter Password");
    	 con.add(l2);
    	 pwd=new JPasswordField(10);
    	 con.add(pwd);
    	 
    	 valid=new JButton("Validate");
    	 EventHandlingClass obj=new EventHandlingClass(this);
    	 valid.addActionListener(obj);
    	 con.add(valid);
    	 
    	 clear =new JButton("Clear");
    	// clear.addActionListener(this);
    	 con.add(clear);
    	
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GuiClass g=new GuiClass();
	}

}
