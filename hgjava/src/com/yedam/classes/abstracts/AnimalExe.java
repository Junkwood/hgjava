package com.yedam.classes.abstracts;

public class AnimalExe {
	public static void main(String[] args) {
		
		Animal animal = null;//인스턴스를 만들 수 없음. 추상클래스는 선언이 불필요함.
		animal = new Bird("제비");
		animal.eat();
		animal.sleep();
		
		Bird bird = new Bird("참새");
		bird.eat();
		bird.sleep();
		
		Dog dog = new Dog();
		
		Bird[] birds = new Bird[5];
//		birds[0] = dog;//타입이 달라 담을 수 없음.
		
		Animal[] animals = new Animal[10];
		animals[0] = bird;
		animals[1] = dog;//animal 추상클래스의 자식클래스들이라 다 담을 수 있음.
		
	}
}
