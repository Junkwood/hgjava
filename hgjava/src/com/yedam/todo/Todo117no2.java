package com.yedam.todo;

import java.util.Scanner;

public class Todo117no2 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		//친구3명의 이름과 연락처를 입력하도록..메시지출력
		//입력완료
		String[] strAry = new String[6];
		int idx=0;
		System.out.println("이름>>>");
		strAry[idx++] = scn.nextLine();
		System.out.println("연락처>>>");
		strAry[idx++] = scn.nextLine();
		
	
		
		
		for(int i =0; i< strAry.length; i++) {
			if( i%2 == 0) {
				
			}
		}
		
		
		String str= "";
		for(int i=1; i<=3;i++) {
			
		}
		//이름: 홍길동
		//연락처 : 010-1111-2222
		//====================
		//이름: 김길동
		//연락처 : 010-1111-2222
		//====================
		//이름: 박길동
		//연락처 : 010-1111-2222
		//====================
		//위 방식으로 출력되도록 하기.(배열활용)
	}
}
