package com.yedam.condition;

public class ArrayExe {
	public static void main(String[] args) {
		int[] intAry = {10, 20, 30}; // 자바에서는 배열은 중괄호{}
		intAry[2] = 40;
		
		intAry = new int[]{10,20,30,40,50}; // 새로 담을경우 새로 선언해야함.
		intAry = new int[10]; // 10개의 공간을 가진 배열 생성
		System.out.println(intAry[0]+", 크기:" + intAry.length);
		intAry[0] = 100;
		
		for(int i=0; i<10; i++) {
			intAry[i] = (int) (Math.random() * 10);
		}
		
		// 2, 3의 배수의 값을 각각 int sum2, sum3에 저장.
		int sum2, sum3;
		sum2 = sum3 = 0;
		
		
		for(int i=0; i<10; i++) {
			System.out.printf("%d ",intAry[i]);
			//코드작성
			if(intAry[i]%2 == 0 && intAry[i]%3 == 0) {
				sum2 += intAry[i];
				sum3 += intAry[i];				
			}else if(intAry[i]%2 == 0) {
				sum2 += intAry[i];
			}else if(intAry[i]%3 == 0) {
				sum3 += intAry[i];
			}
		}System.out.println();
		// 각각 출력
		System.out.printf("2배수 합은 %d, 3배수 합은 %d입니다.\n",sum2,sum3);
		
		String[] strAry = {"hong","park","kim", "20"}; //타입이 다르면 배열에 안들어감.
		for(int i=0; i<strAry.length; i++) {
			System.out.println(strAry[i]);
		}
	}
}
