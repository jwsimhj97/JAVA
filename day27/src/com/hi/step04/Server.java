package com.hi.step04;
// 다중에코서버
import java.net.*;
import java.util.ArrayList;
import java.io.*;

public class Server extends Thread {
	static ArrayList<Socket> list=new ArrayList<>();
   
   Socket sock=null;
   
   public void  sayAll(String msg) throws IOException{
      OutputStream os=null;
      OutputStreamWriter osw=null;
      BufferedWriter bw=null;
      for(int i=0; i<list.size(); i++){
    	  Socket sock=list.get(i);
    	  os=sock.getOutputStream();
    	  osw=new OutputStreamWriter(os);
    	  bw=new BufferedWriter(osw);
    	  bw.write(msg);
    	  bw.newLine();
    	  bw.flush();
      }
   }
   
   @Override
   public void run() {      
      InputStream is=null;
      OutputStream os=null;
      InputStreamReader isr=null;
      OutputStreamWriter osw=null;
      BufferedReader br=null;
      BufferedWriter bw=null;
      
      try {      
         is=sock.getInputStream();
         os=sock.getOutputStream();
         isr=new InputStreamReader(is);
         osw=new OutputStreamWriter(os);
         br=new BufferedReader(isr);
         bw=new BufferedWriter(osw);
         
         //클라이언트가 메시지를 보내니까 먼저 읽어야겠지?
         while(true){
            String msg=br.readLine(); //개행단위로 읽어오기
            if(msg.equals("exit")){break;}
            
            sayAll(msg);
            
//            msg="re: "+msg;
//            bw.write(msg); //읽어온것 쓰기... 개행은 빠지므로
//            bw.newLine(); //개행을 추가해줌
//            bw.flush(); //밀어내기
         }
      } catch (IOException e) {
         e.printStackTrace();
      }finally{
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


   
   public static void main(String[] args) {
      //메인스레드는 accept만 하는 중
      ServerSocket serve=null;
      
      try {
         serve=new ServerSocket(5000);
         while(true){
            Server thr=new Server(); //스레드를 만들어내고
            thr.sock=serve.accept(); //스레드 객체에 있는 sock에다가 받아줌
            thr.start();
            list.add(thr.sock);
         }
      } catch (IOException e) {
         e.printStackTrace();
      }finally{
         try {
            serve.close();
         } catch (IOException e) {
            e.printStackTrace();
         }
      }
   }

}