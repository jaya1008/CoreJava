package com.dialog;

import javax.swing.*;
import java.awt.*;
class JColorChooserDemo extends JFrame
{
		JColorChooserDemo()
		{
			Container con=getContentPane();			
			Color co=new Color(0,0,134);		
			setVisible(true);
			setSize(200,200);
//			JColorChooser jcc=new JColorChooser();
//			co=jcc.showDialog(this,"color",Color.pink);
//			con.setBackground(co);
			JFileChooser jfc=new JFileChooser("f:");
			jfc.showOpenDialog(this);
			
		}
		public static void main(String a[])
	    {
			new JColorChooserDemo();
	     }

};