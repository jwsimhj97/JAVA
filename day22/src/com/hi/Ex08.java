package com.hi;

import javax.swing.JFrame;

public class Ex08 extends JFrame{
	
	public Ex08(){
		// DISPOSE_ON_CLOSE; 	== 0 �ƹ��͵� ��������
		// HIDE_ON_CLOSE;	 	== 1
		// DO_NOTHING_ON_CLOSE;	== 2
		// EXIT_ON_CLOSE;	 	== 3 �ý����� �����Ų��(exit(0)) -> �������� ��������� DO_NOTHING_ON_CLOSE�� �̿�
		setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		setBounds(100,100,400,300);
		setVisible(true);
	}
	public static void main(String[] args) {
		new Ex08();
	}

}