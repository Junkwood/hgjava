package com.yedam.variable;

public class VariableExe1 {
	public void sum() {
		int n2;
	}
	public static void main(String[] args) {
		// let n = '10';
		// const obj = {name:"홍길동". age:20, showInfo(){ } };
		int n1 = 2147483647; // int(기본데이터타입) wrapper클래스 : Integer.
		n1 = 2147483647;
		System.out.println(Integer.MAX_VALUE); // integer=int 의 최대값 출력
		
		long n2= 2147483648L; // long은 int의 최대값을 초과하는 값을 표기기시에 사용함. 해당 값의 타입이 long이라는 것을 표기하기 위해 숫자 뒤에 L을 붙임. 
		n2 = -2147483648L;
		
		double n3 = Math.random(); // 0 ~ 1사이의 임의의 실수. double이 실수타입.
		
		int n4 = (int) (Math.random()*10); // 0 ~ 10사이의 임의의 실수를 정수타입으로.
		
		String str = "홍길동"; // 문자열 형식, 대문자로 시작하는 것은 클래스임.
		
//		int n2; 중복선언 불가(다만 메소드가 다르면 상관없음. 선언된 블럭 밖에서는 상관없음)
		byte b1 = 127; // byte의 범위는 -128~127
		System.out.println(Short.MAX_VALUE); // short는 2byte 범위임.(32767)
		short s1 = 32767;
		
		short s3 =(short)(s1 - 30); // 사칙연산은 기본적으로 int 타입기준임. 그래서 short타입을 계산시에는 short로 타입을 바꾸며 처리필요함
		// 왼쪽항 = 오른쪽항 : 항상 타입이 동일.
		double d1 = 40; // 실제로는 오른쪽 항에 (double)이 생략된것임.
		
		
		
	}
}
