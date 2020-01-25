package com.basic;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class KeyListenerDemo extends JFrame//  implements KeyListener{
{
	/**
	 * @param args
	 */
	JLabel l1,l2,l3;
	JTextField user;
    JPasswordField pwd;	
    JButton valid;
    JButton clear;
    Container con;
	KeyListenerDemo()
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
    	 pwd.addKeyListener(new KeyAdapter() {
    		
    			@Override
    			public void keyPressed(KeyEvent e) {
    				// TODO Auto-generated method stub
    				if(e.getKeyCode()==KeyEvent.VK_ENTER)
    				{
    					String u=user.getText();
    					
    					String p=pwd.getText();
    					if(u.equals("jayshree")&&p.equals("chaudhary"))
    					{
    					
    						System.out.println("You are a Valid user");
    					}
    					else
    						System.out.println("You are a InValid user");
    				
    					
    				}
    			
    				
    				
    			}
    		 
		}); 
			
			
			
		
		
    	 
    
    	
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		KeyListenerDemo obj=new KeyListenerDemo();
	}
	/*@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		
		if(e.getKeyCode()==KeyEvent.VK_ENTER)
		{
			String u=user.getText();
			
			String p=pwd.getText();
			if(u.equals("seed")&&p.equals("infotech"))
			{
			
				System.out.println("You are a Valid user");
			}
			else
				System.out.println("You are a InValid user");
		
			
		}
		
	}
	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}*/

}
