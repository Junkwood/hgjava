package com.yedam.classes;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class CalendarExe {
	public static void main(String[] args) {
		final int num=10;
//		num = 20;
		
		Calendar cal = Calendar.getInstance();
		cal.set(2024, 0, 1);
		System.out.println("year:" + cal.get(Calendar.DAY_OF_WEEK));//해당일의 요일을 출력.1이 일요일,7은토요일
		System.out.println("last Date:" + cal.getActualMaximum(Calendar.DATE));
		
		//drawCalendar(2024, 12);
		
		Date date = new Date();
		//2024-10-5
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyy-MM-dd");
		try {
		date = sdf.parse("2024-02-01");//String->date
		}catch(Exception e) {
			e.printStackTrace();
		}
		drawCalendar(date);
	}
	
	//date = sdf.parse("2024-01-01");에서 연,월 바꾸면 해당 월 달력이 출력되도록 해보기. 숙제!
	static void drawCalendar(Date date) {

		Calendar cal = Calendar.getInstance();
		int year = date.getYear()+1900;
		int month = date.getMonth();
		cal.set(year, month, 1); // 연,월,일 설정이나 날짜는1의 위치를 알기위해 1로 고정.
		int pos=cal.get(Calendar.DAY_OF_WEEK)-1;
		int lastDate=cal.getActualMaximum(Calendar.DATE);
		System.out.printf("======== %d년 %d월 =========\n",year,month+1);
		//요일출력
		String[] days = {"Sun", "Mon", "Tue", "Wed", "Thr", "Fri", "Sat"};
		for(int i=0; i<days.length; i++) {
			System.out.printf("%4s",days[i]);
		}
		System.out.println();
		// 공란출력
		for(int i = 0; i< pos; i++) {
			if(pos == 7) {
				continue;
				}
		System.out.printf("%4s","");
		}
		//날짜 출력
		for(int d=1; d<=lastDate; d++) {
			System.out.printf("%4d",d);
			if((pos+d)%7==0) {
				System.out.println();
			}
		}
	}
	
	static void drawCalendar(int year, int month) {
		// (2024, 1)
		// 수정... 월이 변경될 떄 마다 마지막날 계산.
		Calendar cal = Calendar.getInstance();
		cal.set(year, month-1, 1); // 연,월,일 설정이나 날짜는1의 위치를 알기위해 1로 고정.
		int pos=cal.get(Calendar.DAY_OF_WEEK)-1;
		int lastDate=cal.getActualMaximum(Calendar.DATE);
		System.out.printf("======== %d년 %d월 =========\n",year,month);
		//요일출력
		String[] days = {"Sun", "Mon", "Tue", "Wed", "Thr", "Fri", "Sat"};
		for(int i=0; i<days.length; i++) {
			System.out.printf("%4s",days[i]);
		}
		System.out.println();
		// 공란출력
		for(int i = 0; i< pos; i++) {
			if(pos == 7) {
				continue;
				}
		System.out.printf("%4s","");
		}
		//날짜 출력
		for(int d=1; d<=lastDate; d++) {
			System.out.printf("%4d",d);
			if((pos+d)%7==0) {
				System.out.println();
			}
		}
		System.out.println("\n======= end of prog. ========");
		}
	
}
