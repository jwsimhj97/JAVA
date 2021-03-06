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
      System.out.println("창열림");
      
   }

   @Override
   public void windowClosing(WindowEvent e) {
	      System.out.println("창 닫기버튼 누름");
//	      System.exit(0);
	      dispose();	// 종료
      
   }

   @Override
   public void windowClosed(WindowEvent e) {
	      System.out.println("dispose가 호출될 때");
      
   }

   @Override
   public void windowIconified(WindowEvent e) {
	      System.out.println("창 최소화");
      
   }

   @Override
   public void windowDeiconified(WindowEvent e) {
	      System.out.println("창 최소화해제");
      
   }

   @Override
   public void windowActivated(WindowEvent e) {
	      System.out.println("창 활성화");
      
   }

   @Override
   public void windowDeactivated(WindowEvent e) {
	      System.out.println("창 비활성화");
      
   }

}