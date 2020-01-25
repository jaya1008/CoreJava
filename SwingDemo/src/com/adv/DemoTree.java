package com.adv;

import java.awt.*;
import javax.swing.*;
import javax.swing.tree.*;

class DemoTree extends JFrame
{
    DemoTree()
    {
		Container cp=getContentPane();
		cp.setLayout(new FlowLayout());

		DefaultMutableTreeNode tp=new DefaultMutableTreeNode("java options");

		DefaultMutableTreeNode t1=new DefaultMutableTreeNode("core java");
		tp.add(t1);
		DefaultMutableTreeNode tt1=new DefaultMutableTreeNode("inheritance");
		t1.add(tt1);
		DefaultMutableTreeNode tt2=new DefaultMutableTreeNode("polymorphism");
		t1.add(tt2);
		DefaultMutableTreeNode t2=new DefaultMutableTreeNode("advance java");
		tp.add(t2);
		DefaultMutableTreeNode tt3=new DefaultMutableTreeNode("JSP");
		t2.add(tt3);
		DefaultMutableTreeNode tt4=new DefaultMutableTreeNode("EJB");
        t2.add(tt4);
        JTree t=new JTree(tp);
		cp.add(t);
	}
	public static void main(String[] args) 
	{
		DemoTree t=new DemoTree();
		t.setSize(300,300);
		t.setVisible(true);
	}
}
