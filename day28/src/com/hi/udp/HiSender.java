package com.hi.udp;
// UDP방식
import java.io.IOException;
import java.net.*;

public class HiSender {

   public static void main(String[] args) {
      byte[] ip={127,0,0,1};
      int port=5000;
      DatagramSocket sock=null;
      DatagramPacket pack=null;
      String msg="한글";	// udp로 발송하는 메시지
      
      try {
         //먼저 ip address 만들기
         InetAddress addr=InetAddress.getByAddress(ip);
         sock=new DatagramSocket();
         
//       pack=new DatagramPacket(보낼 데이터, 데이터의 길이, address, port (정보));
         pack=new DatagramPacket(msg.getBytes(), msg.getBytes().length, addr, port);
         sock.send(pack);

         msg="보냄";
         pack=new DatagramPacket(msg.getBytes(), msg.getBytes().length, addr, port);
         sock.send(pack);
         
      } catch (UnknownHostException e) {
         
         e.printStackTrace();
      } catch (SocketException e) {
         e.printStackTrace();
      } catch (IOException e) {
         e.printStackTrace();
      } finally{
         sock.close();
      }
      
   }

}