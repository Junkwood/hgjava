package com.yedam.reference;

public class RefExe {
	public static void main(String[] args) {
		int n1 = 100;
		int n2 = 100;
		System.out.println(n1 == n2);
		
		String str1 = new String("홍길동");// String은 참조형 변수라 메소드에는 만들어진 객체의 주소만 저장됨.
		String str2 = new String("홍길동");
		System.out.println(str1 == str2); // 주소값 비교
		System.out.println(str1.equals(str2)); // 값을 비교하려면 equals 사용.
		
		int[] intAry = new int[10]; // 배열또한 참조형 변수
		intAry = null;
		System.out.println(intAry);
		
	}
}
