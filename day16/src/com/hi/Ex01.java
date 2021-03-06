package com.hi;

import java.util.Calendar;

// 날짜 Class Calendar
public class Ex01 {

	public static void main(String[] args) {
		java.util.Calendar cal=Calendar.getInstance();	// getInstance - 메소드를 통해 한번만 생성된 객체를 가져온다.
//		cal.set(2002,5-1,1,12,0);
		cal.setTimeInMillis(System.currentTimeMillis());	// 1970년을 기준
		
		System.out.println(cal.get(0));
		System.out.println(cal.get(1));	// cal.get(1) = year = cal.get(Calendar.YEAR)
		System.out.println(cal.get(2));	// cal.get(2) = month = cal.get(Calendar.MONTH)+1 --> 0부터 1월~
		System.out.println(cal.get(3));	// cal.get(3) = week of year = cal.get(Calendar.WEEK_OF_YEAR)
		System.out.println(cal.get(4));	// cal.get(4) = week of month = cal.get(Calendar.WEEK_OF_MONTH)
		System.out.println(cal.get(5)); // cal.get(5) = date of month = cal.get(Calendar.DATE)
		System.out.println(cal.get(6));	// cal.get(6) = date of year 
		System.out.println(cal.get(7));	// cal.get(7) = day of week -> 0부터 monday~
		System.out.println(cal.get(Calendar.DAY_OF_WEEK)==Calendar.THURSDAY);
		System.out.println(cal.get(Calendar.AM_PM));	// AM = 0 /PM = 1
		System.out.println(cal.get(Calendar.HOUR));	// time hour
		System.out.println(cal.get(Calendar.HOUR_OF_DAY));
		System.out.println(cal.get(Calendar.MINUTE));
		System.out.println(cal.get(Calendar.SECOND));	
		
	}

}
