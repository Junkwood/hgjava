package com.yedam.condition;

import java.util.Scanner;

public class WhileLoopExe2 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		// 어떤 조건인 동안 반복.
		int random =  (int)(Math.random()*100) + 1;// 1~100 사이의 정수
		while(true) {
			System.out.println("값입력>> ");
			int input = scn.nextInt();
			if(random == input) {
				System.out.printf("임의값 %d\n", random);
				break;
			}
			if(random < input) {
				System.out.println("값이 큽니다.");
				continue;
			}
				System.out.println("값이 작습니다.");
			
		}
		System.out.println("end of prog.");
	}
}
