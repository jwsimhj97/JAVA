package com.hi;

import java.awt.Frame;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class Ex07 extends Frame implements WindowListener {

   public Ex07(){
      addWindowListener(this);

      
      setBounds(100,100,200,200);
      setVisible(true);
   }
   
   public static void main(String[] args) {
      new Ex07();

   }

   @Override
   public void windowOpened(WindowEvent e) {
      System.out.println("â����");
      
   }

   @Override
   public void windowClosing(WindowEvent e) {
	      System.out.println("â �ݱ��ư ����");
//	      System.exit(0);
	      dispose();	// ����
      
   }

   @Override
   public void windowClosed(WindowEvent e) {
	      System.out.println("dispose�� ȣ��� ��");
      
   }

   @Override
   public void windowIconified(WindowEvent e) {
	      System.out.println("â �ּ�ȭ");
      
   }

   @Override
   public void windowDeiconified(WindowEvent e) {
	      System.out.println("â �ּ�ȭ����");
      
   }

   @Override
   public void windowActivated(WindowEvent e) {
	      System.out.println("â Ȱ��ȭ");
      
   }

   @Override
   public void windowDeactivated(WindowEvent e) {
	      System.out.println("â ��Ȱ��ȭ");
      
   }

}