package com.mvc;
import javax.swing.*;
import javax.swing.event.ListDataListener;

import java.util.*;

public class JScrollContainer{
	@SuppressWarnings("rawtypes")
	public static void main(String[] args)
		{
		
       
		JFrame frame = new JFrame("YOYO HONEY SINGH");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		

		JList jt=new JList();
		
		ListModel obj=new MyListModel();
		jt.setModel(obj);
	
		frame.getContentPane().add(jt);
		frame.setSize(400,400);
		frame.setVisible(true);
	}
}
class MyListModel implements ListModel
{
    int s;
    private final Object[] data = { "Hello", new Object(),
            new java.util.Date(), new JLabel("Hello world!"), this, };
    public Object getElementAt(int index) {
    	System.out.println("in ListModel");
        return data[index];
      }

      public int getSize() {
        return data.length;
      }

      public void addListDataListener(ListDataListener ldl) {
        // since the list never changes, we don't need this :-)
      }

      public void removeListDataListener(ListDataListener ldl) {
        // since the list never changes, we don't need this :-)
      }

}

