package com.yedam.condition;

public class LoopExe4 {
	public static void main(String[] args) {
		for(int j=4; j>0; j--) {
		for(int i=1; i<=j; i++) {
			System.out.printf("*");
			}
		System.out.println();
		}
	}
	public static void method1(){
		// 구구단
		for(int j = 1; j<=9; j++) {
			// 시작.
			if(j!=1) {
			System.out.println();
			}
			for(int i=2; i<=9; i++)	{		
				int num = j; 
			System.out.printf("%d * %d = %d\t", i, num, (num*i));
			}
		}
		// 끝.
	}
	public static void method2(){
		for(int j = 1; j<=9; j++) {
			// 시작.
			for(int i=2; i<=9; i++) {
				System.out.printf("%4d * %d = %2d", i, j, (j*i));
				
			}
			System.out.println();
			// 끝.
		}
	
	}
}
