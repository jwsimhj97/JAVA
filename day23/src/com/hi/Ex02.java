package com.hi;

import java.awt.Frame;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.event.TextEvent;
import java.awt.event.TextListener;

public class Ex02 extends Frame implements TextListener{
	TextField tf;

	public Ex02(){
		Panel p=new Panel();
		
		tf=new TextField(15);
		tf.addTextListener(this);
		p.add(tf);
		
		add(p);
		setBounds(100,100,600,400);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new Ex02();
	}

	@Override
	public void textValueChanged(TextEvent e) {
		System.out.println(tf.getText());
	}

}
