package com.yedam.variable;

import java.util.Scanner;

public class VariableExe2 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in); // prompt를 자바에서 대체하는 클래스. 풀네임은 java.util.Scanner 임. ctrl+shift+O 단축키. 
		System.out.println("나이를 입력>>> ");
		//String result = scn.nextLine(); // 입력값을 문자열로 반환.
		int result = scn.nextInt(); // 입력값을 정수로 반환.
		System.out.println("당신의 이름은 " + result + "입니다.");
	}
}
