package com.hi;

import java.awt.CheckboxMenuItem;
import java.awt.Frame;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;
import java.awt.PopupMenu;

public class Ex06 extends Frame{
	
	public Ex06(){
		setTitle("����");
		Menu mn2=new Menu("Help");
		
		MenuItem mi1=new MenuItem("item1");
		MenuItem mi2=new MenuItem("item2");
		MenuItem mi3=new CheckboxMenuItem("item3",true);
		MenuItem mi4=new MenuItem("����ù��°");
		Menu mn3=new Menu("�����޴�");
		mn3.add(mi4);
		Menu mn1=new Menu();
		mn1.setLabel("File");
		mn1.add(mi1);
		mn1.add(mn3);
		mn1.addSeparator();		// checkbox�� ������ ������̰���
		mn1.add(mi3);
				
		MenuBar mb=new MenuBar();
		mb.add(mn1);
		mb.add(mn2);
		setMenuBar(mb);
		
		setBounds(100,100,600,500);
		setVisible(true);
	}

	public static void main(String[] args) {
		new Ex06();
	}

}