package com.hi;

import java.awt.Color;
import java.awt.Dialog;
import java.awt.FileDialog;
import java.awt.Frame;

public class Ex03 extends Frame{

	public Ex03(){
		setBackground(Color.RED);
		
//		Frame f=new Frame();
//		f.setBackground(Color.BLUE);
//		f.setLocation(200,200);
//		f.setSize(300,200);
//		f.setVisible(true);
		
		setLocation(100,100);
		setSize(600,500);
		setVisible(true);
		
//		java.awt.Dialog dl=new Dialog(this,"�������",true);	// true�Ǿ��ִٸ� dl.setVisible�� false�� �Ǳ� �������� ����â�� �������� ���Ѵ� 
//		dl.setLocation(200,200);
//		dl.setSize(300,200);
//		dl.setVisible(true);
		
		java.awt.FileDialog dl=new FileDialog(this,"",FileDialog.SAVE);	// ��ư���� - LOAD ���� / SAVE ����
 		dl.setLocation(200,200);
		dl.setSize(300,200);
		dl.setVisible(true);
		System.out.println(dl.getDirectory()+","+dl.getFile());

	}
	
	public static void main(String[] args) {
		new Ex03();
	}

}