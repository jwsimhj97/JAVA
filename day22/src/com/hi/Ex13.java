package com.hi;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;

public class Ex13 extends Frame implements ActionListener{
	TextArea ta1;
	
	public Ex13(){		
		BorderLayout layout=new BorderLayout();
		Panel p=new Panel();
		p.setLayout(layout);

		Color c=Color.WHITE;
		Font f=new Font(Font.SERIF, Font.BOLD, 22){};
		
		GridLayout ltop=new GridLayout(1,1);
		GridLayout lbtt=new GridLayout(1,3);
		GridLayout lrel=new GridLayout(1,1);
		Panel ptop=new Panel();	// 탑 패널
		Panel pbtt=new Panel();	// 바텀 패널
		Panel prel=new Panel();	// 결과 패널
		ptop.setLayout(ltop);
		pbtt.setLayout(lbtt);
		prel.setLayout(lrel);	
				
		Label la1=new Label("글씨");
		la1.setText("가위 바위 보 게임 (ver 0.2.0)");
		la1.setLocation(50, 0);
		la1.setBackground(c);
		la1.setFont(f);
		ptop.add(la1);
		p.add(ptop);

		p.add(pbtt);	
		JButton btn1=new JButton("가위");
		btn1.addActionListener(this);
		Toolkit tool=Toolkit.getDefaultToolkit();
		java.awt.Image image=tool.createImage("ga.png");
		javax.swing.Icon icon=new javax.swing.ImageIcon(image);
		btn1.setIcon(icon);    
		pbtt.add(btn1);
		
		JButton btn2=new JButton("바위");
		btn2.addActionListener(this);
		Toolkit tool2=Toolkit.getDefaultToolkit();
		java.awt.Image image2=tool2.createImage("ba.png");
		javax.swing.Icon icon2=new javax.swing.ImageIcon(image2);
		btn2.setIcon(icon2);
		pbtt.add(btn2);
		
		JButton btn3=new JButton("보");
		btn3.addActionListener(this);
		Toolkit tool3=Toolkit.getDefaultToolkit();
		java.awt.Image image3=tool3.createImage("bo.png");
		javax.swing.Icon icon3=new javax.swing.ImageIcon(image3);
		btn3.setIcon(icon3);
		pbtt.add(btn3);
		
		ta1=new TextArea("결과",3,10,TextArea.SCROLLBARS_HORIZONTAL_ONLY);
		prel.add(ta1);
		ta1.setFont(f);
//		p.add(prel);
		
		
		p.add(ptop,BorderLayout.NORTH);
		p.add(pbtt,BorderLayout.CENTER);
		p.add(prel,BorderLayout.SOUTH);
		
		add(p);
		setBounds(100,100,500,400);
		setVisible(true);
	}

	public static void main(String[] args) {
		new Ex13();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
//		System.out.println(e.getSource());
		
//		String input=e.toString();
//		System.out.println(input.indexOf("바"));	// 48번째
//		System.out.println(input.indexOf("바", 48));
		
		
		
		
//		if(cmd)
		
//		e.getSource();

//		if(a)
		String a="가위";	// btn1
		String b="바위";	// btn2
		String c="보";		// btn3
		String me=null;
		String comm=null;
		int com=(int)(Math.random()*3)+1;	// 가위=1, 바위=2, 보=3
		
		String input=e.toString();
		if(input.indexOf("가", 48)!=-1){
			me=a;
		}else if(input.indexOf("바", 48)!=-1){
			me=b;
		}else if(input.indexOf("보", 48)!=-1){
			me=c;
		}
		
		if(com==1){
			comm=a;
		}else if(com==2){
			comm=b;
		}else if(com==3){
			comm=c;
		}
		
		if((me==a&&com==1)||(me==b&&com==2)||(me==c&&com==3)){	// 비겼습니다
			ta1.setText("당신:"+me+"\n"+"컴퓨터:"+comm+"\n"+"결과 : 비겼습니다");
		}else if((me==a&&com==3)||(me==b&&com==1)||(me==c&&com==2)){	// 이겼습니다
			ta1.setText("당신:"+me+"\n"+"컴퓨터:"+comm+"\n"+"결과 : 이겼습니다");
		}else if((me==a&&com==2)||(me==b&&com==3)||(me==c&&com==1)){	// 졌습니다
			ta1.setText("당신:"+me+"\n"+"컴퓨터:"+comm+"\n"+"결과 : 졌습니다");
		}
		
//		ta1.setText("ddd");
		
		
	}


}
