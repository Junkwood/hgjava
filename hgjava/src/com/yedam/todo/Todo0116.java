package com.yedam.todo;

import java.util.Scanner;

public class Todo0116 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		System.out.println("값을 입력>>> ");
		String input = scn.nextLine();
		
		// input.equals("quit")
		// "quit" 값이 들어오면 <<end of prog>> 표기
		// 다른값이 들어오면 "입력하신 값은 --- 입니다." 라고 표기.
		while(input.equals("quit") == false) {
			System.out.println("입력하신 값은" + input + "입니다.");
			System.out.println("값을 입력>>> ");
			input = scn.nextLine();
		}
		System.out.println("<<end of prog>>");
//		
//		while(true) {
//
//			System.out.println("값을 입력>>> ");
//			String input = scn.nextLine();
//			if(input.equals("quit")) {
//				break;
//			}else {
//			System.out.println("입력값은 %s입니다.", input);
//			}
//			
//		}
		
	}
}