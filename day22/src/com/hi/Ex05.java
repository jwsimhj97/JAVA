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
		
		Button btn=new Button("���߿� �߰�");
		p.add(btn);
		
		// ȭ�鰻��
//		repaint();		// ȭ���� �ٽñ׷���
//		validate();		// üũ�ض�
//		revalidate();	// �ٽ�üũ�ض�
	}

	public static void main(String[] args) {
		new Ex05();
	}

}