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

public class LoginDemo extends JFrame  implements ActionListener//1
{
	JTextField txt_name;
	JPasswordField txt_pass;
	JLabel lbl_user,lbl_pass;
	JButton btn_submit,btn_clear;
	Container con;
	public LoginDemo() {
		
		//Basic properties of Frame
		setSize(500,500);
		setTitle("Login Form");
		setLayout(new FlowLayout(FlowLayout.CENTER));
		
		
		//2 Create the Object of Component
		
		txt_name=new JTextField(10);
		txt_pass=new JPasswordField(10);
		lbl_user=new JLabel("Enter username");
		lbl_pass=new JLabel("Enter Password");
		btn_submit=new JButton("Submit");
		btn_clear=new JButton("Clear");
		
		//3 add the component to the container		
		con=getContentPane();
		con.add(lbl_user);
		con.add(txt_name);
		con.add(lbl_pass);
		con.add(txt_pass);		
		con.add(btn_submit);
		btn_submit.addActionListener(this);
		con.add(btn_clear);
		btn_clear.addActionListener(this);
	
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LoginDemo obj=new LoginDemo();
		obj.setVisible(true);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==btn_submit)
		{
			System.out.println("Submit click");
			String user=txt_name.getText();
			String pass=txt_pass.getText();
			if(user.equals("jayshree")&&pass.equals("jaya@123"))
				System.out.println("Valid user");
			else {
				System.out.println("invalid user");
			}
		}
		else
		{
			System.out.println("Clear button Click");
			txt_name.setText("");
			txt_pass.setText("");
		}
			
	}




}
