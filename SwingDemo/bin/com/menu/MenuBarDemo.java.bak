package com.menu;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JSeparator;


public class MenuBarDemo extends JFrame{

	JMenuBar mb;
	JMenu c,s,g;
	JMenuItem r,b,rect,cir,sqr,dark,light;
	
	public MenuBarDemo()
	{
		mb=new JMenuBar();
		setJMenuBar(mb);
		
		c=new JMenu("Color");
		s=new JMenu("Shape");
		
		r=new JMenuItem("red");
		
		g=new JMenu("green");
		dark=new JMenuItem("dark");
		light=new JMenuItem("light");
		g.add(dark);
		
		g.add(light);

		JSeparator js=new JSeparator();
		
		
		b=new JMenuItem("blue");
		rect=new JMenuItem("rectangle");
		cir=new JMenuItem("circle");
		sqr=new JMenuItem("sqare");
		
		mb.add(c);
		mb.add(s);
		
		c.add(r);
		c.add(b);
		c.add(g);
		
		s.add(rect);
		s.add(cir);
		s.add(sqr);
		light.add(js);
		setSize(400,400);
		setVisible(true);
		
		
}
	public static void main(String[] args) {
		new MenuBarDemo();
		// TODO Auto-generated method stub

	}

}
