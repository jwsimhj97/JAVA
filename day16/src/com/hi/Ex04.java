package com.hi;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

// (java text)Class DateFormat
public class Ex04 {

	public static void main(String[] args) {
		// 날짜 format변환
		Date cal=new Date();
//		java.text.DateFormat df=DateFormat.getDateInstance();
		java.text.DateFormat df=DateFormat.getDateInstance(DateFormat.FULL, Locale.KOREA); // SHORT, MEDIUM, LONG, FULL
		String msg=df.format(cal);
		System.out.println(msg);
		System.out.println("-------------------------------");
//		포멧 패턴은 문서의 표를 참조
//		https://docs.oracle.com/javase/8/docs/api/java/text/SimpleDateFormat.html
//		java.text.SimpleDateFormat sdf=new SimpleDateFormat();
		java.text.SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd hh:mm");
		msg=sdf.format(cal);
		System.out.print(msg);
	}

}
