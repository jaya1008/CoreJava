package com.basic;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EventHandlingClass implements ActionListener {

	GuiClass obj;
	EventHandlingClass(GuiClass o)
	{
		obj=o;
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String u=obj.user.getText();
		
		String p=obj.pwd.getText();
		
		if(u.equals("seed")&&p.equals("infotech"))
		{
		
			System.out.println("You are a Valid user");
		}
		else
			System.out.println("You are a InValid user");
	
		
	}

}
