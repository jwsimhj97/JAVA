package com.hi;

import java.awt.Button;
import java.awt.Frame;
import java.awt.Panel;
import java.util.Scanner;

public class Ex05 extends Frame{
	Scanner sc=new Scanner(System.in);
	
	public Ex05(){
		Panel p=new Panel();
		add(p);
		setBounds(100,100,500,400);
		setVisible(true);
		sc.nextLine();
		
		Button btn=new Button("나중에 추가");
		p.add(btn);
		
		// 화면갱신
//		repaint();		// 화면을 다시그려라
//		validate();		// 체크해라
//		revalidate();	// 다시체크해라
	}

	public static void main(String[] args) {
		new Ex05();
	}

}
