package com.hi;

import java.awt.Button;
import java.awt.Frame;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import org.omg.PortableServer.ServantRetentionPolicyValue;

public class Ex11_t extends Frame implements ActionListener{
	public Ex11_t(){
		Panel p=new Panel();
		p.setLayout(new GridLayout(4,4));
		Button[] btns=new Button[16];		
		for(int i=0; i<16; i++){
			btns[i]=new Button(""+i);
			btns[i].addActionListener(this);
			p.add(btns[i]);
		}
		
		add(p);
		setBounds(100,100,400,400);
		setVisible(true);
	}

	public static void main(String[] args) {
		new Ex11_t();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println(((Button)(e.getSource())).getLabel());
	}

}
