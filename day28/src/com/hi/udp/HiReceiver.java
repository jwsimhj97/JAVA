package com.hi.udp;
//UDP방식
import java.io.IOException;
import java.net.*;
import java.util.Arrays;

public class HiReceiver {

   public static void main(String[] args) {
      DatagramSocket sock=null;
      DatagramPacket pack=null;
      
      try {
    	  sock=new DatagramSocket(5000);  // 5000번 포트를 열어놓고 있어야 하니까
//        byte[] buf=new byte[8];
    	  byte[] buf=new byte[4];
         pack=new DatagramPacket(buf, buf.length); //받으려면 패킷 객체가 있어야겠지
         sock.receive(pack);
         System.out.println(Arrays.toString(buf));
         System.out.println(new String(buf));
         
         pack=new DatagramPacket(buf, buf.length);
         sock.receive(pack);
         System.out.println(Arrays.toString(buf));
         System.out.println(new String(buf));
      } catch (SocketException e) {
         e.printStackTrace();
      } catch (IOException e) {
         e.printStackTrace();
      } finally {
         sock.close();
      }

   }

}