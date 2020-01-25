package com.menu;
import javax.swing.*;

import java.awt.*;
import java.awt.event.*;

public class MenuPopUpDemoClass {

JMenuBar mb;
JMenu file,edit,format,help;
JMenuItem New,Open,Save,Print,Undo,Delete,Exit,Copy,Cut,font,WordWrap,Paste,menuItem;
JPopupMenu pmenu;

public MenuPopUpDemoClass() {

	JFrame frame=new JFrame();
	
	frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
	
	mb=new JMenuBar();
	frame.setJMenuBar(mb);
	
	file=new JMenu("File");
	edit=new JMenu("Edit");
	format=new JMenu("Format");
	help=new JMenu("Help");
	
	mb.add(file);
	mb.add(edit);
	mb.add(format);
	mb.add(help);
	
	New=new JMenuItem("New");
	Open =new JMenuItem("Open");
	Save=new JMenuItem("Save");
	Print=new JMenuItem("Print");
	Undo=new JMenuItem("Undo");
	Delete=new JMenuItem("Delete");
	Exit=new JMenuItem("Exit");
	Copy=new JMenuItem("Copy");
	Cut=new JMenuItem("Cut");
	font=new JMenuItem("Font");
	WordWrap=new JMenuItem("Word Wrap");
	Paste=new JMenuItem("Paste");
		
	file.add(New);
	file.add(Open);
	file.add(Save);
	file.add(Print);
	file.add(Exit);
	
	//file.addSeparator();
	
	edit.add(Undo);
	edit.add(Cut);
	edit.add(Copy);
	edit.add(Paste);
	edit.add(Delete);
	
	//edit.addSeparator();
	
	format.add(WordWrap);
	format.add(font);
	
	pmenu=new JPopupMenu();
	
	menuItem=new JMenuItem("Copy");
	pmenu.add(menuItem);
	menuItem=new JMenuItem("Cut");
	pmenu.add(menuItem);
	menuItem=new JMenuItem("Paste");
	pmenu.add(menuItem);
	menuItem = new JMenuItem("Undo");
	pmenu.add(menuItem);
	
	
	menuItem.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e){}
	});
	
	frame.addMouseListener(new MouseAdapter() {
		public void mousePressed(MouseEvent me){
			if(me.isPopupTrigger()){
				pmenu.show(me.getComponent(), me.getX(), me.getY());
			}
		}
		public void mouseReleased(MouseEvent Me){
			if(Me.isPopupTrigger()){
				pmenu.show(Me.getComponent(), Me.getX(), Me.getY());
			}
		}
	});
	
	frame.setTitle("Menu and PopUpMenu Demo");
	frame.setSize(500,500);
	frame.setVisible(true);
	
}
	public static void main(String[] args) {
		
		MenuPopUpDemoClass mc=new MenuPopUpDemoClass();
	}

	

}
