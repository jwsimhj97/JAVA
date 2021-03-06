package com.hi;

// 두더지게임 (ver 0.1.0)

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Font;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Label;
import java.awt.Panel;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;

public class Ex10practice extends Frame implements ActionListener{
	static Label gtime, laScore;
	JButton[] btns;
	Button sbtn,ebtn;
	
	public void gameTime(){
		for(int i=60; i>=0; i--){
			gtime.setText(i+"초");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e1) {
				e1.printStackTrace();
			}
		}
	}
	
	public Ex10practice(){
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				dispose();
			}
		});

		Toolkit tool=Toolkit.getDefaultToolkit();
		Image down=tool.createImage("down100.png");
		ImageIcon downIcon=new ImageIcon(down);
		Image up=tool.createImage("up100.png");
		ImageIcon upIcon=new ImageIcon(up);
		
		Panel p=new Panel();
		p.setLayout(new BorderLayout());
		setTitle("두더지게임 (ver 0.1.0)");
		Font f=new Font(Font.SANS_SERIF, Font.BOLD, 20);
		p.setFont(f);
		
		Panel p1=new Panel();
		Panel p2=new Panel();
		Panel p3=new Panel();
		Panel p4=new Panel();
		p2.setLayout(new GridLayout(4,4));
		p3.setLayout(new GridLayout(2,1));
		p.add(p1,BorderLayout.NORTH);
		p.add(p2,BorderLayout.CENTER);
		p.add(p3,BorderLayout.EAST);
		p.add(p4,BorderLayout.SOUTH);
		
		Label title=new Label("두더지게임 (ver 0.1.0)");
		gtime=new Label("60초");
		p1.add(title);
		p1.add(gtime);
		
		btns=new JButton[16];
		for(int i=0; i<btns.length; i++){
			btns[i]=new JButton(i+"");
			btns[i].addActionListener(this);
			btns[i].setIcon(downIcon);
			p2.add(btns[i]);	
		}
		
		sbtn=new Button("시작");
		ebtn=new Button("종료");
		p3.add(sbtn);
		p3.add(ebtn);
		
		laScore=new Label("점수 : 0");
		p4.add(laScore);
		
		
		add(p);
		setBounds(100, 100, 440, 500);
		setVisible(true);
	}

	public static void main(String[] args) {
		new Ex10practice();
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Object obj=e.getSource();
		
		if(obj==sbtn){
			
		}else if(obj==ebtn){
			
		}
		
		
//		if(obj==btns[0]){
//			btns[0].setText("hi");
//		}
		
//		for(int i=0; i<btns.length; i++){
//			btns[i]
//		}
	}

}
