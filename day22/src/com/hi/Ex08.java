package com.hi;

import javax.swing.JFrame;

public class Ex08 extends JFrame{
	
	public Ex08(){
		// DISPOSE_ON_CLOSE; 	== 0 아무것도 하지않음
		// HIDE_ON_CLOSE;	 	== 1
		// DO_NOTHING_ON_CLOSE;	== 2
		// EXIT_ON_CLOSE;	 	== 3 시스템을 종료시킨다(exit(0)) -> 좋지않은 방법임으로 DO_NOTHING_ON_CLOSE을 이용
		setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		setBounds(100,100,400,300);
		setVisible(true);
	}
	public static void main(String[] args) {
		new Ex08();
	}

}
