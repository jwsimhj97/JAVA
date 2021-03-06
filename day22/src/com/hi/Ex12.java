package com.hi;

import java.awt.Button;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class Ex12 extends Frame implements KeyListener{
	TextField tf;
	JLabel la;
	
	public Ex12(){
		Panel p=new Panel();
		tf=new TextField("",20);
		Button btn=new Button("버튼");
		la=new JLabel("@");
		la.setIcon(new ImageIcon("ebchu.jpg"));
		la.setLocation(0,0);
		la.setSize(100,100);
		this.addKeyListener(this);
//		btn.addKeyListener(this);
//		tf.addKeyListener(this);
//		p.addKeyListener(this);
		p.add(la);
//		p.add(tf);
//		p.add(btn);
		
		add(p);
		setBounds(100,100,600,600);
		setVisible(true);
	}

	public static void main(String[] args) {
		new Ex12();
	}

	@Override
	public void keyTyped(KeyEvent e) {
//		System.out.println("키 누름");		
//		System.out.println("keyTyped:"+e.getKeyChar());
//		System.out.println("keyTyped:"+e.getKeyCode());
		
//		System.out.println("keyTyped:"+tf.getText());
	}

	@Override
	public void keyPressed(KeyEvent e) {
//		System.out.println("키 누르는 순간");		
//		System.out.println("keyTyped:"+e.getKeyChar());
//		System.out.println("keyTyped:"+e.getKeyCode());
		
//		System.out.println("keyPressed:"+tf.getText());
	}

	@Override
	public void keyReleased(KeyEvent e) {
//		System.out.println("키 때는 순간");		
//		System.out.println("keyTyped:"+e.getKeyChar());
//		System.out.println("keyTyped:"+e.getKeyCode());
		
//		System.out.println("keyReleased:"+tf.getText());
		
//		Object obj=e.getSource();
//		Button tf2=(Button) obj;
//		TextField tf2=(TextField) obj;
//		System.out.println(tf2.getLabel());
		int x=la.getLocation().x;
		int y=la.getLocation().y;
		if(e.getKeyCode()==39){
			la.setLocation(x+10,y);
		}else if(e.getKeyCode()==37){
			la.setLocation(x-10,y);
		}else if(e.getKeyCode()==38){
			la.setLocation(x,y-10);
		}else if(e.getKeyCode()==40){
			la.setLocation(x,y+10);
		}
	}

}
