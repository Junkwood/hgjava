package com.yedam.condition;

import java.util.Scanner;

public class CalendarExe {
	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		
		System.out.println("보시려는 달력이 몇월인가요?");
		int month = scn.nextInt();
		System.out.printf("===========  %d월  ============\n",month);
		
		// 변수: 월이 1이 오는 위치
		int pos = 1;
		// 변수 : 월의 마지막 날짜
		int lastDate = 31;
		
		switch(month) {
			case 1: pos = 1; lastDate = 31; break;
			case 2: pos = 4; lastDate = 29; break;
			case 3: pos = 5; lastDate = 31; break;
			case 4: pos = 1; lastDate = 30; break;
			case 5: pos = 3; lastDate = 31; break;
			case 6: pos = 6; lastDate = 30; break;
			case 7: pos = 1; lastDate = 31; break;
			case 8: pos = 4; lastDate = 31; break;
			case 9: pos = 7; lastDate = 30; break;
			case 10: pos = 2; lastDate = 31; break;
			case 11: pos = 5; lastDate = 30; break;
			case 12: pos = 7; lastDate = 31; break;
		}
		
		// 수정... 월이 변경될 떄 마다 마지막날 계산.
		String[] days = {"Sun", "Mon", "Tue", "Wed", "Thr", "Fri", "Sat"};
		for(int i=0; i<days.length; i++) {
			System.out.printf("%4s",days[i]);
		}
		System.out.println();
		for(int i = 0; i< pos; i++) {
			if(pos == 7) {
				continue;
				}
		System.out.printf("%4s","");
		}
		//1~31까지 반복
		for(int d=1; d<=lastDate; d++) {
			System.out.printf("%4d",d);
			if((pos+d)%7==0) {
				System.out.println();
			}
		}
		System.out.println("\n======= end of prog. ========");
	}
}
