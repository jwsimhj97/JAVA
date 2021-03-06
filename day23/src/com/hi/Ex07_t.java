package com.hi;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Dialog;
import java.awt.FileDialog;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ex07_t extends Frame implements ActionListener{
	MenuItem mi1,mi2,mi3,mi4,mi5;
	TextArea ta;
	String title="제목없음";
	
	public Ex07_t(){
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				dispose();
			}
		});
		
		setTitle(title);
		MenuBar bar=new MenuBar();
		Menu mn1=new Menu("파일");
		Menu mn2=new Menu("도움말");
		bar.add(mn1);
		bar.add(mn2);
		mi1=new MenuItem("새파일");
		mi2=new MenuItem("열기");
		mi3=new MenuItem("저장");
		mi4=new MenuItem("종료");
		mi5=new MenuItem("정보");
		mn1.add(mi1);
		mn1.add(mi2);
		mn1.addSeparator();
		mn1.add(mi3);
		mn1.addSeparator();
		mn1.add(mi4);
		mn2.add(mi5);		
		mi1.addActionListener(this);	
		mi2.addActionListener(this);	
		mi3.addActionListener(this);	
		mi4.addActionListener(this);		
		mi5.addActionListener(this);
			
		
		
		ta=new TextArea();
		
		setMenuBar(bar);
		add(ta);
		setBounds(100, 100, 500, 300);
		setVisible(true);
	}

	public static void main(String[] args) {
		new Ex07_t();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Object obj=e.getSource();
		if(obj==mi5){
			Dialog dia=new Dialog(this,"정보",true);
			Panel p=new Panel();
			Panel p2=new Panel();
			p2.setLayout(new GridLayout(2,1));
			p2.add(new Label("내가 수업을 위해 만들었습니다"));
			Label la2=new Label("2021.12.31");
			la2.setAlignment(Label.CENTER);
			p2.add(la2);
			p.setLayout(new BorderLayout());
			p.add(p2,BorderLayout.CENTER);
			Button btn=new Button("확인");
			btn.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					dia.dispose();
				}			
			});
			p.add(btn,BorderLayout.SOUTH);
			dia.add(p);
			dia.setBounds(250, 200, 200, 100);
			dia.setVisible(true);
		}else if(obj==mi1){
			this.setTitle(title);
			ta.setText("초기화");
			ta.setText("");
		}else if(obj==mi2){
			FileDialog dia=new FileDialog(this, "열기",FileDialog.LOAD);
			dia.setVisible(true);
			File file=new File(dia.getDirectory()+dia.getFile());
			if(!file.exists()){return;}
			byte[] buf=new byte[(int)file.length()];
			try {
				FileInputStream fis=new FileInputStream(file);
				fis.read(buf);
				ta.setText("초기화");
				ta.setText(new String(buf));
				fis.close();
			} catch (FileNotFoundException e1) {
				e1.printStackTrace();
			} catch (IOException e1) {
				e1.printStackTrace();
			}
		}else if(obj==mi3){
			FileDialog dia=new FileDialog(this,"저장",FileDialog.SAVE);
			dia.setVisible(true);
			File file=new File(dia.getDirectory()+dia.getFile());
			try {
				if(!file.exists()){
					file.createNewFile();
				}
				FileOutputStream fos= new FileOutputStream(file);
				fos.write(ta.getText().getBytes());
				fos.close();
				title=(file.getName());
				setTitle(title);
			} catch (IOException e1) {
				e1.printStackTrace();
			}
		}else if(obj==mi4){
			dispose();
		}
	}

}
