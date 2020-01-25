package com.basic;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class FirstUserApp extends JFrame implements ActionListener {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * @param args
	 */
	JLabel l1,l2,l3;
	JTextField user;
    JPasswordField pwd;	
    JButton valid;
    JButton clear;
    Container con;
    FirstUserApp()
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
    	 valid.addActionListener(this);
    	 con.add(valid);
    	 
    	 clear =new JButton("Clear");
    	 clear.addActionListener(this);
    	 con.add(clear);
    	
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FirstUserApp obj=new FirstUserApp();
		

	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		//String s=e.getActionCommand()
		//Button b=e.getSource();
		if(e.getActionCommand().equals("Validate"))
		{	
			System.out.println("am in Validate click");
		
			String u=user.getText();
		
			String p=pwd.getText();
			if(u.equals("seed")&&p.equals("infotech"))
			{
			
				System.out.println("You are a Valid user");
			}
			else
				System.out.println("You are a InValid user");
		
		}
		else if(e.getSource()==clear)
		{
			user.setText("");
			pwd.setText("");
			
			
		}
	}

}
