package com.yedam.condition;

public class ForLoopExe1 {
	public static void main(String[] args) {
		
		for(int i=1; i<=10; i+=2) {
			System.out.println(i);
			if(i>5) {
				break;
			}
		}
		
		// 1~10까지 합을 계산
		int sum = 0;
		for(int i=1; i<=10; i++) {
			 if(i%3 == 0)
				 sum += i;
			    
		}
		System.out.printf("누적값은 %d\n", sum);
		System.out.println("SunMonTueWedThrFriSat");
		System.out.printf("%3s","");
		//1~31까지 반복
		for(int d=1; d<=31; d++) {
			System.out.printf("%3d",d);
			if(d%7==6) {
				System.out.println();
			}
		}
	}
}