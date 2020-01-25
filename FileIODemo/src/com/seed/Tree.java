package com.seed;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.tree.*;
import java.io.*;
import java.util.*;
class Tree extends JFrame
{
	JTree jt;
	File file;
	Tree()
	{
		file=new File("c:\\");

		Container con=getContentPane();
		

		/////////////// getFile ////////////////
		DefaultMutableTreeNode top=new DefaultMutableTreeNode("C");

		String val[]=file.list();

		
		for(int i=0;i<val.length;i++)
		{
		
			if(!(new File("c:\\"+val[i])).isDirectory())
			{
						DefaultMutableTreeNode a=new DefaultMutableTreeNode(val[i]);
						top.add(a);
					
			}
			
			
		}
		jt=new JTree(top);
		int v=ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED;
		int h=ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED;
		jt.setBounds(50,50,50,50);
		JScrollPane jsp=new JScrollPane(jt,v,h);
	
		con.add(jsp);
		
		setSize(400,400);
		show();
		setTitle("Tree File");
		
	}
	public static void main(String a[])
	{
		new Tree();
	}
}


		



