package com.hi;

import java.net.InetAddress;


public class Ex2_01 {

	public static void main(String[] args) {
		 try{
	            // 자신의 IP 출력
	            InetAddress local = InetAddress.getLocalHost();
	            System.out.println("내 IP 정보 :" + local.getHostAddress());
	             
	        }catch(Exception e){
	            // 예외가 발생했을 때 예외의 내용을 출력
	            System.out.println(e.getMessage());
	        }
	}

}
