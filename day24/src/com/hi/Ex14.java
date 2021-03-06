package com.hi;

//두더지게임

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Label;
import java.awt.Panel;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JButton;

public class Ex14 extends Frame implements ActionListener,Runnable{
	Label laTime, laScore;
	JButton[] btns;
	Button btn1, btn2;
	int score=0;
	Panel p2;
	Image img;
		
	public Ex14(){
		Toolkit tool=Toolkit.getDefaultToolkit();
		img=tool.createImage("up100.png");
		Panel p=new Panel();
		p.setLayout(new BorderLayout());
		
		Panel p1=new Panel();
		p2=new Panel();
		Panel p3=new Panel();
		p.add(p1, BorderLayout.NORTH);
		p.add(p2, BorderLayout.CENTER);
		p.add(p3, BorderLayout.EAST);
		p1.setLayout(new GridLayout(1,2));
		p2.setLayout(new GridLayout(4,4));
		
		p1.add(new Label("두더지게임 (ver 0.1.0)"));
		laTime=new Label("60초");
		p1.add(laTime);
		
		btns=new JButton[16];
		for(int i=0; i<btns.length; i++){
			btns[i]=new JButton(i+"");
			p2.add(btns[i]);
			btns[i].setEnabled(false);
			btns[i].addActionListener(this);
			String img;
			if(i<4){
				img="up100.png";
			}else{
				img="down100.png";
			}
			btns[i].setIcon(new ImageIcon(img));
		}
		
		
		
		btn1=new Button("시작");
		btn2=new Button("종료");
		btn1.addActionListener(this);
		btn2.addActionListener(this);
		p3.add(btn1);
		p3.add(btn2);
		
		laScore=new Label("점수 : 0");
		p.add(laScore,BorderLayout.SOUTH);
		
		
		add(p);
		setBounds(100, 100, 500+7, 400+85);
		setVisible(true);
	}
	
	public void mix(){
		Random ran=new Random();
		for(int i=0; i<btns.length; i++){
			btns[i].setIcon(new ImageIcon("down100.png"));
		}
		int su=ran.nextInt(16);
		btns[su].setIcon(new ImageIcon(img));
		
		this.revalidate();
	}

	public static void main(String[] args) {
		Ex14 me=new Ex14();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Object obj=e.getSource();
		if(obj==btn1){
			for(int i=0; i<btns.length; i++){
				btns[i].setEnabled(true);
			}
			Thread thr=new Thread(this);
			thr.start();
			btn1.setEnabled(false);
			score=0;	// 점수 초기화
			laScore.setText("점수 : "+score);
		}else if(obj==btn2){
			dispose();
		}else{
			JButton btn=(JButton) obj;
			Image img=((ImageIcon)(btn.getIcon())).getImage();
			if(img==this.img){
				score++;
			}else{
				score-=2;
			}
			laScore.setText("점수 : "+score);
		}
	}
	
	@Override
	public void run() {
		int time=60; 
		for(int i=time; i>=0; i--){
			mix();
			laTime.setText(i+"초");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		btn1.setEnabled(true);
		for(int i=0; i<btns.length; i++){
			btns[i].setEnabled(false);
		}
	}

}
