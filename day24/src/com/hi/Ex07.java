package com.hi;

import java.awt.Frame;
import java.awt.Label;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Ex07 extends Frame{
	Label la;
	
	public Ex07(){
		la=new Label();
		add(la);
		
		setBounds(100,100,200,100);
		setVisible(true);
	}

	public static void main(String[] args) {
		Ex07 thr=new Ex07();
		while(true){
			Date d=new Date();
			SimpleDateFormat sdf=new SimpleDateFormat("hh:mm:ss");
			String msg=sdf.format(d);
			thr.la.setText("");
			thr.la.setText(msg);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
