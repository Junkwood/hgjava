package com.yedam.todo;

import java.util.Scanner;

public class Todo0117 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		//친구3명의 이름과 연락처를 입력하도록..메시지출력
		//입력완료
		
		System.out.println("사람수");
		int in = Integer.parseInt(scn.nextLine());
	
		String[] frdAry = new String[in*2];
		
//		String[] frdAry = new String[100];
		
		int cnt = 0;
		
		
		while(true) {
			System.out.println("이름은?");
			String name = scn.nextLine();
			if(name.equals("quit")) {
				for(int i=0; i<cnt; i+=2) {
					System.out.println();
					System.out.printf("이름 : %s\n연락처 : %s\n====================",frdAry[i],frdAry[i+1]);
				}
				break;
			}
			System.out.println("전화번호는?");
			String tel = scn.nextLine();
			if(tel.equals("quit")) {
				for(int i=0; i<cnt; i+=2) {
					System.out.println();
					System.out.printf("이름 : %s\n연락처 : %s\n====================",frdAry[i],frdAry[i+1]);
				}
				break;
			}
			if(cnt<in*2-2){
				frdAry[cnt]  = name;
				frdAry[cnt+1] = tel;
				cnt += 2;				
			}else {
				System.out.println("모두 입력하셨습니다.(총"+ in +"명)");
				break;
			}
			
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
