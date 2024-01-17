package com.yedam.operator;

import java.util.Scanner;

public class OperaExe1 {
	public static void main(String[] args) {
		int result = 0;
		Scanner scn = new Scanner(System.in);
		
		//사용자에게 값을 입력: 정수입력.
		while(true) {
			System.out.println("정수를 입력하세요");
			String input = scn.nextLine();
			if(input.equals("quit")) {
				break;
			}
			try {
				result += Integer.parseInt(input);				
			} catch (Exception e) {
				System.out.println("잘못된 값을 입력.");;
			}
		}
		//누적 값은 15 입니다.
		System.out.printf("누적 값은 %d 입니다.\n",result);
		System.out.println("end of prog.");
	}
	public static void mathod1() {
		int sum = 1 + 2 * 3;
		sum = sum + 5;
		sum += 5;
		
		
		String str = "";
		Scanner scn = new Scanner(System.in);
		while(true) {
			System.out.println("문자열을 입력하세요>>> ");
			String input = scn.nextLine();
			if (input.equals("quit")){
				break;
			}
			str += input + " ";
		}
		System.out.printf("누적내용 : %s\n",str);
	}
}
