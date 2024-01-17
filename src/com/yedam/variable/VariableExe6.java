package com.yedam.variable;

public class VariableExe6 {
	public static void main(String[] args) {
		
		double d1 = 10; // 10으로 적었지만 실제로는 double타입이라 10.0임.
		double result = d1+ 20; // + 20또한 double로 자동변환되어 20.0임.
		
		int sum = 60;
		result = sum * 1.0 / 7; // sum/7하면 정수로 나오며 실수로 소수점까지 나오려면 *1.0으로 실수를 곱해줘야함.
		System.out.println(result); 
		
		String str = "1" + "3"; // 문자가 연결됨. Integer.parseInt("1")하면 정수로 변경되어 셈가능.
		
		sum = Integer.parseInt("1") +3+5;
		
		result = Double.parseDouble("1.234") +2.3;
		
		
		
		
		// char 65536개
		for(int i=0;i<10;i++) {
			int temp=(int)(Math.random()*25) +97;//97부터 영어 유니코드. 알파벳갯수가 총 25종류. 알파벳 랜덤생성기.
			System.out.println((char) temp);
		}
	}
}
