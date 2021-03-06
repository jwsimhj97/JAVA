package com.hi.step04;
// 다중에코서버
import java.net.*;
import java.awt.BorderLayout;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.util.*;

public class Client extends Frame implements ActionListener{
	static TextArea ta;
	static TextField tf;
	static BufferedWriter bw;
	
	public Client(){
		Panel p=new Panel();
		p.setLayout(new BorderLayout());
		ta=new TextArea();
		tf=new TextField();
		tf.addActionListener(this);
		p.add(ta,BorderLayout.CENTER);
		p.add(tf,BorderLayout.SOUTH);
		add(p);
		
		setBounds(100,100,200,400);
		setVisible(true);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		String msg=tf.getText();        
        try {
			bw.write(msg);
	        bw.newLine();
	        bw.flush();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
	}

   public static void main(String[] args) {
	   Client me=new Client();
      Socket sock=null;
      InputStream is=null;
      OutputStream os=null;
      InputStreamReader isr=null; //문자열스트림 변환
      OutputStreamWriter osw=null;
      BufferedReader br=null;
      
      try {
         sock=new Socket("192.168.0.9", 5000);
         is=sock.getInputStream();
         os=sock.getOutputStream();
         isr=new InputStreamReader(is);
         osw=new OutputStreamWriter(os);
         br=new BufferedReader(isr);
         bw=new BufferedWriter(osw);
         
         while(true){
            String msg2=br.readLine();
            ta.append(msg2+"\n");
         }         
      } catch (UnknownHostException e) {
         e.printStackTrace();
      } catch (IOException e) {
         e.printStackTrace();
      } finally {
         
         try {
            bw.close();
            br.close();
            osw.close();
            isr.close();
            os.close();
            is.close();
            sock.close();
         } catch (IOException e) {
            e.printStackTrace();
         }
         
      }

   }

}