package com.yedam.api;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class DateExe {
	public static void main(String[] args) {
		Date today = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		System.out.println(sdf.format(today));//Date->String
		try {
			today = sdf.parse("2020/01/05 12:12:12");//String->Date
		} catch (ParseException e) {
			e.printStackTrace();
		}
		System.out.println(today);
		
		Date now = new Date();
		System.out.println(today.before(now));
		System.out.println(today.after(now));
		System.out.println(now);
		
		//최신버전에서는 Date가 사라지고 LocalDate, LocalTime, LocalDateTime가 새로 생김.
		LocalDate ld = LocalDate.now();
		LocalTime lt = LocalTime.now();
		LocalDateTime ldt = LocalDateTime.now();
		System.out.println(ld);
		System.out.println(lt);
		System.out.println(ldt);
		
		String result = ldt.format(DateTimeFormatter.ofPattern("yyy-MM-dd HH:mm:ss"));
		System.out.println(result);
	}
}
