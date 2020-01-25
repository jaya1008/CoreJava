package com.seed;

import java.awt.*;
import java.applet.*;
import javax.swing.JApplet;

/*<applet CODE="AppletParamDemo" WIDTH="600" HEIGHT="200">
<param NAME ="fontname" VALUE="Arial">
<param NAME ="size" VALUE="40" >
</applet>*/


public class AppletParamDemo extends JApplet
{
	Font f;
	String fontname,str;
	public void init()
	{
		
		fontname=getParameter("font");
		int size=Integer.parseInt(getParameter("size"));
		f=new Font(fontname,Font.BOLD,size);
		str="Passing parameter demo";
	}
	public void paint(Graphics g)
	{
		super.paint(g);
		g.setFont(f);
		g.drawString(str,30,40);
	
	}
}