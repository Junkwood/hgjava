package com.yedam.variable;

public class VariableExe4 {
	public static void main(String[] args) {
		// true/false.
		boolean isTrue = 10 > 20;
		
		isTrue = update(10);
		
		if(isTrue) {
			System.out.println("참");
		} else {
			System.out.println("거짓");
		}
		
		Member m1 = new Member();
		m1.name = "홍길동";
		m1.age = 20;
		m1.height = 167.8;
		
		Member m2 = new Member();
		m2.name = "김민수";
		m2.age = 23;
		m2.height = 172.5;
		
		System.out.println(m1);
		System.out.println(m2);
		
		isTrue = m1.height > m2.height;
		System.out.println(isTrue);
		isTrue = m1.age == m2.age;
		System.out.println(isTrue);
		isTrue = m1 == m2;
		System.out.println(isTrue);
	} // end of main
	
	public static boolean update(int arg) {
		return arg % 2 == 0; // f/t
	} // end of update
}// end of class
