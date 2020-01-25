package com.adv;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JPanel;




public class TestColorChooser extends JPanel {

	/**
	 * @param args
	 */
	JButton btn;
	JFrame f;
	JColorChooser ch;
//	Color c=Color.pink;
	public TestColorChooser()
	{
		btn=new JButton("show");
		ch=new JColorChooser(Color.red);
		// f=new JFrame();
		//f.add(ch);
		//f.setSize(280,200);
		//ch.setFileFilter(new MyFileFilter());
	
		setLayout(new FlowLayout());
		
		add(ch);
		//add(ch);
		//setBackground(c);
		//setSize(350,350);
		//setVisible(true);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestColorChooser tc=new TestColorChooser();
		tc.setSize(300,300);
		tc.setVisible(true);
	}

}
