package com.yedam.variable;

//import java.util.Scanner;

public class VariableExe3 {
	public static void main(String[] args) {
		java.util.Scanner scn = new java.util.Scanner(System.in);
		// 키 입력(=height) 
		// 평균(합계=sum/3)
		double sum = 0;
		for (int i = 1; i<= 3; i++) {
			System.out.println("키를 입력>>> ");
			double height = scn.nextDouble();
			sum += height;
		}
		
		System.out.println("세사람의 평균키는 : " + sum/3 + "입니다.");
		// 세사람의 평균키는 : 175.2입니다.
	}
}
