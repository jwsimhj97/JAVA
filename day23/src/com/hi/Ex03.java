package com.hi;

import java.awt.Frame;
import java.awt.event.ComponentEvent;
import java.awt.event.ComponentListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowStateListener;

public class Ex03 extends Frame implements WindowStateListener,MouseWheelListener,FocusListener,ComponentListener{
	
	public Ex03(){
		addWindowStateListener(this);
		addMouseWheelListener(this);
		addFocusListener(this);
		addComponentListener(this);
		
		setBounds(100,100,500,400);
		setVisible(true);
	}

	public static void main(String[] args) {
		new Ex03();
	}

	@Override
	public void windowStateChanged(WindowEvent e) {
		// window만
		System.out.println("windowStateChanged");
	}

	@Override
	public void mouseWheelMoved(MouseWheelEvent e) {
		// 마우스만
		System.out.println("마우스 휠 조작");
	}

	@Override
	public void focusGained(FocusEvent e) {
		// 컴포넌트 공통
		System.out.println("포커스 얻음");
	}

	@Override
	public void focusLost(FocusEvent e) {
		// 컴포넌트 공통
		System.out.println("포커스 잃음");
	}

	@Override
	public void componentResized(ComponentEvent e) {
		System.out.println(this.getSize().width+","+this.getSize().height);
	}

	@Override
	public void componentMoved(ComponentEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void componentShown(ComponentEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void componentHidden(ComponentEvent e) {
		// TODO Auto-generated method stub
		
	}

}
