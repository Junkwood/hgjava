package com.yedam.api;

import java.io.File;
import java.io.FileNotFoundException;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Scanner;

public class ClassExe {
	public static void main(String[] args) throws FileNotFoundException {
		Class cls = String.class;
		String str = "";
		cls = str.getClass();
		try {
			cls = Class.forName("com.yedam.api.Member");// 확인할 클래스 이름지정.
		} catch (ClassNotFoundException e) {

		}
		Method[] methods = cls.getDeclaredMethods();// 존재하는 메소드이름 확인.
		for (Method method : methods) {
			System.out.println(method.getName());
		}

		Field[] fields = cls.getDeclaredFields();// 존재하는 필드이름 확인.
		for (Field field : fields) {
			System.out.println(field.getName());

		}
		// 경로정보
		String path = cls.getResource("sample.txt").getPath();
		System.out.println(path);

		Scanner scn = new Scanner(new File(path));
		System.out.println(scn.nextLine());
		System.out.println(scn.nextLine());
		System.out.println(scn.nextLine());
		System.out.println(scn.nextLine());
	}
}
