package com.hi;

import java.util.Arrays;
import java.util.StringTokenizer;

public class Ex01 {

	public static void main(String[] args) {
		String msg="a,b,c,d,e";
		char num1=msg.charAt(2);
		System.out.println(num1);
		System.out.println(msg.concat(",A,B,C"));
		System.out.println(msg+",A,B,C");
		
		System.out.println(msg.concat(",A,B,C")=="a,b,c,d,e".concat(",A,B,C,"));
		System.out.println("a,b,c,d,e,A,B,C"=="a,b,c,d,e"+",A,B,C,");
		System.out.println(msg);
		String result1=msg.substring(2);
		System.out.println(result1);
		String result2=msg.substring(2, msg.length());
		System.out.println(result2);
		System.out.println(msg.subSequence(2,5));	// String sequence를 상속받는다
		System.out.println(msg.replace("b,c", "B,C"));
		System.out.println(msg);
		System.out.println(msg.replace("b,c", "b,c,B,C"));
		System.out.println(msg.replace("b,c", ""));
		System.out.println(msg.replace(",", "@"));
		System.out.println(msg.contains("b,"));
		System.out.println(msg.indexOf("b,"));	// ★ 없으면 -1
		System.out.println(msg.startsWith("a,"));
		System.out.println(msg.startsWith("A,"));
		String[] arr=msg.split(",");
		System.out.println(Arrays.toString(arr));
		StringTokenizer token=new StringTokenizer(msg,",");
		int cnt=token.countTokens();
//		while(token.hasMoreElements()){
//			System.out.println(token.nextToken());
//		}
//		token=new StringTokenizer(msg,",");
		String[] arr2=new String[cnt];
		for(int i=0; i<cnt; i++){
			arr2[i]=token.nextToken();
		}
		System.out.println(Arrays.toString(arr2));
	}

}
