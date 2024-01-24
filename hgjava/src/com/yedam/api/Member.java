package com.yedam.api;

public class Member extends Object {
	String name;
	int age;
	
	Member(){}
	Member(String name, int age){
		this.name = name;
		this.age = age;
	}
	
	@Override
	public int hashCode() {
		return this.name.hashCode();
	}
	
	//name과 이름 같으면 논리적으로 동일한 객체.
	
	@Override//equals 재정의
	public boolean equals(Object obj) {
		if(obj instanceof Member) {
			Member target = (Member) obj;
			if(this.name.equals(target.name)&&this.age == target.age) {
				return true;
			}
		}
		return false;
	}
	@Override//toString 재정의
	public String toString() {
		return "이름은 " + name + ", 나이는 " + age;
		
	}
}
