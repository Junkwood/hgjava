package com.yedam.operator;

import java.util.Scanner;

// 은행 계좌. 10만원 초과하면 받지 못하도록, 마이너스 계좌 불가.
public class BankExe {
	public static void main(String[] args) {
		// 입금, 출금, 잔고확인, 종료
		Scanner scn = new Scanner(System.in);
		int balance = 0;
		boolean run = true;
		
		while(run) {
			System.out.println("1.입금 2.출금 3.잔고 4.종료");
			int menu = Integer.parseInt(scn.nextLine());
			switch(menu) {
			case 1: System.out.println("입급금액을 입력하세요");
					int in = Integer.parseInt(scn.nextLine());
					if( balance + in<=100000) {
					balance += in;
					System.out.printf("%d원 입금이 완료되었습니다.\n",in);
					}else {
						System.out.println("해당 계좌의 잔고는 10만원을 초과할 수 없습니다.");
					}
					break;
			case 2: System.out.println("출금금액을 입력하세요");
					int out = Integer.parseInt(scn.nextLine());
					if(balance - out>=0) {
					balance -= out;
					System.out.printf("%d원 출금이 완료되었습니다.\n",out);
					}else {
						System.out.println("해당 계좌의 잔고보다 큰 금액은 출금이 불가합니다.");
					}
					break;
			case 3: System.out.printf("현재 잔고는 %d원 입니다.\n",balance);
					break;
			case 4: System.out.println("이용해주셔서 감사합니다.");
					run = false;
			}
		}
		System.out.println("end fo prog.");
	}
}
