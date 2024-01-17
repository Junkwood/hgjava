package com.yedam.variable;

import java.util.Scanner;

public class VariableExe2 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in); // prompt를 자바에서 대체하는 클래스. 풀네임은 java.util.Scanner 임. ctrl+shift+O 단축키로 Scanner를 불러오는 명령어를 자동으로 입력. 
		/*System.out.println("나이를 입력>>> ");
		//String result = scn.nextLine(); // 입력값을 문자열로 반환.
		int result = scn.nextInt(); // 입력값을 정수로 반환.
		System.out.println("당신의 이름은 " + result + "입니다.");*/
		
		
		//이름입력(=name), 연락처(=phone) :scn.nextLine()
		System.out.println("이름을 입력하세요.");
		String name = scn.nextLine();
		System.out.println("전화번호를 입력하세요.");
		String phone = scn.nextLine();
		
		
		//영어(=eng), 수학(=mat) => 합계(=sum) : scn.nextInt()
		System.out.println("영어점수는?");
		int eng = scn.nextInt();
		System.out.println("수학점수는?");
		int mat = scn.nextInt();
		int sum = mat + eng;
		
		System.out.println("이름: " + name + ", 연락처: " + phone + "\n" + "영어: " + eng + ", 수학: " + mat + ". 합계는: " + sum + ".");
		
		
	}
}
