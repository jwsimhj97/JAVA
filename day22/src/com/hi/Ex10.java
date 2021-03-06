package com.hi;

import java.awt.Button;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Ex10 extends Frame implements MouseListener{
	
	public Ex10(){		
		Panel p=new Panel();
		
		Button btn1=new Button("이벤트대상 버튼");
		btn1.addMouseListener(this);
		p.add(btn1);
		
		add(p);
		setBounds(100,100,400,300);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new Ex10();
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		System.out.println("클릭됨(이벤트 대상에서 움직임없이 누르고 땔때");
	}

	@Override
	public void mousePressed(MouseEvent e) {
		System.out.println("마우스 눌렀을때");
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		System.out.println("마우스 누른것을 땔때");
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		System.out.println("이벤트 대상위로 마우스가 올라갔을때");
	}

	@Override
	public void mouseExited(MouseEvent e) {
		System.out.println("이벤트 대상위로 마우스가 빠져나갈때");
	}

}
