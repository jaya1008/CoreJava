package com.layout;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class GridBag extends JFrame{

	private JLabel l1, l2, l3;
	private JTextField t1, t2;
	private JTextArea ja;
	private JButton jb;
	private GridBagLayout gb;
	private GridBagConstraints gbc;
	private JPanel p;
	
	public GridBag(){
		gb = new GridBagLayout();
		gbc = new GridBagConstraints();
		gbc.fill=GridBagConstraints.HORIZONTAL;
				
		p = new JPanel();
		p.setLayout(gb);
		
		l1 = new JLabel("Name");
		gbc.gridx = 0;
		gbc.gridy = 0;
		gbc.gridwidth = 2;
		gb.setConstraints(l1, gbc);
		
		t1 = new JTextField(10);
		gbc.gridx = 3;
		gbc.gridy = 0;
		gbc.gridwidth = 2;
		gb.setConstraints(t1, gbc);
		
		l2 = new JLabel("Password");
		gbc.gridx = 0;
		gbc.gridy = 1;
		gbc.gridwidth = 2;
		gb.setConstraints(l2, gbc);
		
		t2 = new JTextField(10);
		gbc.gridx = 3;
		gbc.gridy = 1;
		gbc.gridwidth = 2;
		gb.setConstraints(t2, gbc);
		
		l3 = new JLabel("Address");
		gbc.gridx = 0;
		gbc.gridy = 2;
		gbc.gridwidth = 2;
		gb.setConstraints(l3, gbc);
		
		ja = new JTextArea(2, 2);
		gbc.gridx = 3;
		gbc.gridy = 2;
		gbc.gridwidth = 2;
		gbc.gridheight = 2;
		gb.setConstraints(ja, gbc);
		
		jb = new JButton("Submit");
		gbc.gridx = 0;
		gbc.gridy = 7;
		gbc.gridwidth = 8;
		gb.setConstraints(jb, gbc);
		
		pack();
		
		p.add(l1);	p.add(t1);	p.add(l2);	p.add(t2);	p.add(l3);	p.add(ja);	p.add(jb);
	
		add(p);
		
		setSize(300, 300);
		setVisible(true);
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GridBag d = new GridBag();
	}

}
