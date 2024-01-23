package com.yedam.classes;

public class SingletonExe {
	public static void main(String[] args) {
		Singleton s1 = Singleton.getInstance();//Singleton이 private클래스라 new Singletons()으로는 할당 불가
		Singleton s2 = Singleton.getInstance();
		
		System.out.println(s1 == s2);
	}
}
