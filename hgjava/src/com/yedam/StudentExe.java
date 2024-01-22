package com.yedam;

import com.yedam.classes.Student;

public class StudentExe {
	public static void main(String[] args) {
		
		Student std = new Student("S001", "홍길동");
		std.setScore(80);
		std.showInfo(); // default 접근수준이라 다른패키지에서는 사용불가.
	}
}
