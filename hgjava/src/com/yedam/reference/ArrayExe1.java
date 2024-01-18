package com.yedam.reference;

public class ArrayExe1 {
	public static void main(String[] args) {
		// 선언.
		int[] intAry = {10,20,30}; // int[]는 int와 타입이 다르나 intAry[0]같이 배열 내 값은 타입이 int임.
		int[][] intArray= {{10,20},{30,40},{50}}; //배열 내 값이 배열임. intArray[0] 타입이 int[]임. intArray[0][0]이 i임.
		
		String[] strAry = new String[5];//크기선언
		strAry = new String[] {"Hello","world","nice"};
		
		for(String elem : strAry) {
			System.out.println(elem);
		}
	}
}
