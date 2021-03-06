package com.hi;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Dialog;
import java.awt.FileDialog;
import java.awt.Frame;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;
import java.awt.Panel;
import java.awt.PopupMenu;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JDialog;

public class Ex07 extends Frame implements ActionListener{
	MenuBar mb;
	Menu me1,me2;
	MenuItem mi1,mi1_1,mi2,mi3,mi4;
	FileDialog fd;
	Panel p, p2;
	Dialog dl;
	
	public Ex07(){
		BorderLayout layout=new BorderLayout();	// 전체 border layout만들기
		p=new Panel();	// 전체 패널
		p.setLayout(layout);
		
		setTitle("제목없음");
		WindowAdapter win=new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				dispose();
			}
		};
		addWindowListener(win);
		
		mb=new MenuBar();
		me1=new Menu("파일");
		me2=new Menu("도움말");
		mb.add(me1);
		mb.add(me2);
		setMenuBar(mb);	
		mi1=new MenuItem("새파일");
		mi1_1=new MenuItem("열기");
		mi2=new MenuItem("저장");
		mi3=new MenuItem("종료");
		me1.add(mi1);
		me1.add(mi1_1);
		me1.addSeparator();	
		me1.add(mi2);
		me1.addSeparator();	
		me1.add(mi3);
		mi4=new MenuItem("정보");
		me2.add(mi4);		
		mi1.addActionListener(this);
		mi1_1.addActionListener(this);
		mi2.addActionListener(this);
		mi3.addActionListener(this);	
		mi4.addActionListener(this);	
		
		fd=new FileDialog(this, "", FileDialog.LOAD);
		fd.setLocation(200,200);
		fd.setSize(300,200);
		fd.setVisible(false);
		

		dl=new Dialog(this,"제목없음",false);	// true되어있다면 dl.setVisible이 false가 되기 전까지는 다음창을 움직이지 못한다
//		dl;
		dl.setLocation(200,200);
		dl.setSize(300,200);
		dl.setVisible(false);
		dl.addWindowListener(win);		
		
		
		add(p);
		setBounds(100, 100, 600, 400);
		setVisible(true);		
	}

	public static void main(String[] args) {
		new Ex07();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
//		fd.setVisible(true);
		String input=e.toString();		
		mi1.toString();
		if(input.indexOf("새", 48)!=-1){
			fd.setVisible(true);
		}else if(input.indexOf("열", 48)!=-1){
			fd.setVisible(true);
		}else if(input.indexOf("저", 48)!=-1){
			fd=new FileDialog(this, "", FileDialog.SAVE);
			fd.setVisible(true);
		}else if(input.indexOf("종", 48)!=-1){
			dispose();
		}else if(input.indexOf("정", 48)!=-1){
			dl.setVisible(true);
		}
		
		
	}

}
