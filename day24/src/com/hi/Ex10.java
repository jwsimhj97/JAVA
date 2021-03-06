package com.hi;
//두더지게임 (ver 0.1.0)
//60초
//점수 : 맞추면 1점, 틀리면 -2점

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

import javax.swing.Icon;
import javax.swing.JButton;


public class Ex10 extends Frame implements ActionListener{	
	Label laScore;
	String title="두더지게임 (ver 0.1.0)";
	JButton[] jbtn = new JButton[16];
	Button sBtn, eBtn;
	Image imgDown,imgUp;
	Icon iconDown,iconUp;	
	static Label la;
	static int ran=(int)(Math.random()*2)+1;
	int score=0;
	
	class Time extends Thread{
		String time=null;
//		Label la=new Label();
	    @Override
	    public void run(){
	        for(int i=60; i>0; i--){
	            try{
	            	la.setText("두더지게임 (ver 0.1.0)"+i+"초");
//	                System.out.println(i+"초");
	                Thread.sleep(1000);
	            }catch(Exception e){
	                e.printStackTrace();
	            }
	        }
	        System.exit(0);
	    }
	    
	}	
	Time t=new Time();
		
	class Game extends Thread{
		public void run(){
			while(true){
//				jbtn[0]
//				System.out.println(ran);
				for(int i=0; i<16; i++){
					ran=(int)(Math.random()*2)+1;
					if(ran==1){
						jbtn[i].setIcon(iconDown);
					}else if(ran==2){
						jbtn[i].setIcon(iconUp);
					}
				}
				
                try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}
	Game g=new Game();
	
	public Ex10(){
		Toolkit tool1=Toolkit.getDefaultToolkit();
		imgDown=tool1.createImage("down.png");
		iconDown=new javax.swing.ImageIcon(imgDown);
		imgUp=tool1.createImage("up.png");
		iconUp=new javax.swing.ImageIcon(imgUp);
		
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				dispose();
			}
		});		
		setTitle(title);

		Font f=new Font(Font.SANS_SERIF,Font.BOLD,30);
		
		Panel p=new Panel();
		p.setLayout(new BorderLayout());
		p.setFont(f);
		Panel p1=new Panel();
		Panel p2=new Panel();
		Panel p3=new Panel();
		Panel p4=new Panel();
		p.add(p1,BorderLayout.NORTH);
		p.add(p2,BorderLayout.CENTER);
		p.add(p3,BorderLayout.EAST);
		p.add(p4,BorderLayout.SOUTH);
//		p1.add(new Label());
		p1.setLayout(new GridLayout(1,2));
		p2.setLayout(new GridLayout(4,4));
		
		
		laScore=new Label("점수 : 0");
		p4.add(laScore);

		la=new Label("두더지게임 (ver 0.1.0)");
//		la.setSize(1000, 50);
		p1.add(la);
		
		
		
		for(int i=0; i<16; i++){
			p2.add(jbtn[i] = new JButton(i+1+""));
			jbtn[i].setIcon(iconDown);
			jbtn[i].addActionListener(this);
		}		
		
		sBtn=new Button("시작");
		eBtn=new Button("종료");
		sBtn.addActionListener(this);		
		eBtn.addActionListener(this);
		p3.add(sBtn);
		p3.add(eBtn);		
		sBtn.setEnabled(true);
		eBtn.setEnabled(false);		
		
		
		
		
		
		add(p);
		setBounds(100, 100, 800, 800);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new Ex10();		
//		System.out.println(ran);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Object obj=e.getSource();
		
		Button btn=(Button)e.getSource();
		if(btn==sBtn){
			t.start();
			sBtn.setEnabled(false);
			eBtn.setEnabled(true);
			g.start();
			
		}else if(btn==eBtn){
			t.stop();
			sBtn.setEnabled(true);
			eBtn.setEnabled(false);
			g.stop();
//			dispose();
		}else{
			System.out.println("123");
		}
		
		
		
	}


}
