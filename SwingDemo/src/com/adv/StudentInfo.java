package com.adv;

import java.awt.GridLayout;
import java.util.Vector;

import javax.swing.*;


public class StudentInfo extends JPanel 
{
	JLabel uname;
	JLabel bdate;
	JLabel qual;
	JLabel gender;
	JLabel subjects;
	
	
	JTextField username;
	JComboBox csubjects;
	JComboBox dd,mm,yy;
	
	JRadioButton male,female;
	JButton register,reset;
	
	JPanel p1,p2,p3,p4,p5,p6;
	
	public StudentInfo()
	{
		setLayout(new GridLayout(5,1));
		p1=new JPanel();
		p2=new JPanel();
		p3=new JPanel();
		p4=new JPanel();
		p5=new JPanel();
		p6=new JPanel();
		
		
		uname=new JLabel("Name: ");
		username=new JTextField(15);
		p1.add(uname);
		p1.add(username);
		
		
		bdate=new JLabel("Birth Date: ");
		Vector v1=new Vector();
		for(int i=1;i<=31;i++)
			v1.add(i);
		dd=new JComboBox(v1);
		
		Vector v2=new Vector();
		for(int i=1;i<=12;i++)
			v2.add(i);
		mm=new JComboBox(v2);
		
		Vector v3=new Vector();
		for(int i=1951;i<=1999;i++)
			v3.add(i);
		yy=new JComboBox(v3);
		
		p2.add(bdate);
		p2.add(dd);
		p2.add(mm);
		p2.add(yy);
		
		
		qual=new JLabel("Qualification:");
		Object[] ele={"C++","C","Java","Servlets","EJB","Hibernate"};
		csubjects=new JComboBox(ele);
		
		p3.add(qual);
		p3.add(csubjects);		
		
		gender=new JLabel("Gender:");
		male=new JRadioButton("male");
		female=new JRadioButton("female");
		p4.add(gender);
		p4.add(male);
		p4.add(female);		
		
		register=new JButton("Register");
		reset=new JButton("reset");
		
		p5.add(register);
		p5.add(reset);
		add(p1);
		add(p2);
		add(p3);
		add(p4);
		add(p5);
		
		
		
		
	
	}
}
