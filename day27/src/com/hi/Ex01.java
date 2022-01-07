package com.hi;

import java.net.*;

public class Ex01 {

	public static void main(String[] args) {
		// 프로토콜://도메인:포트/패~~스?쿼리&스트링#플래그
		URL url=null;
		try {
			url=new URL("https://naver.com");
//			url=new URI("https://getbootstrap.com/docs/3.4/components/#list-gruop");
			System.out.println(url.getProtocol());		// 
//			System.out.println(url.getScheme());	// 프로토콜
			System.out.println(url.getHost());		// 도메인 or IP
			System.out.println(url.getPort());		// 포트 http(80), https(443)
			System.out.println(url.getDefaultPort()); //  
			System.out.println(url.getPath());		// 패스
			System.out.println(url.getQuery());		// 쿼리스트링
			System.out.println(url.getRef());		// 플래스먼트
			
//			System.out.println(url.getFragment());	
//		} catch (URISyntaxException e) {
//			e.printStackTrace();
		}catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
