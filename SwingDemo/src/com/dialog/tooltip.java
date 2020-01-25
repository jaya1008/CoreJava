package com.dialog;
//program for tooltip and Bulitin dialog boxes
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
class tooltip extends JFrame implements ActionListener
{
	Container  con;
	JButton  b1,b2;
	JToolTip jt1;
	JFileChooser jfc;
	JPasswordField jpf;
    JColorChooser jcc;

    tooltip()
	{
	jpf=new JPasswordField(20);
	jcc=new JColorChooser();
	jfc=new JFileChooser();
	setSize(100,100);
	setVisible(true);
	con=getContentPane();
	con.setLayout(new FlowLayout());
	b2=new JButton("b2");
	b1=new JButton("b1");
	b1.addActionListener(this);
	b2.addActionListener(this);
	con.add(b1);
	con.add(b2);
    con.add(jpf);

	    jt1=b1.createToolTip();
		b1.setToolTipText("hellllooo");
		jt1.setComponent(b1);

	}
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource()==b1)
		{
			Color c=jcc.showDialog(this,"color",Color.red);
			con.setBackground(c);
		}




		else
			if(ae.getSource()==b2)
		{
			jfc.showOpenDialog(this);
		}
	}

	public static void main(String[] args)
    {
		new tooltip();
	}
}