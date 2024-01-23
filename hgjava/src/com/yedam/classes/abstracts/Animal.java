package com.yedam.classes.abstracts;

public abstract class Animal {
	private String name;
	
	public Animal() {
		
	}
	public Animal(String name) {
		this.name = name;
	}
	public void eat() {
		System.out.println("[Animal]음식을 먹습니다");
	}
	//추상메소드 : 구현부분X, 자식클랙스에서 반드시 ovverriding(재정의)해야함.
	public abstract void sleep();
	
}
