package com.yedam.interfaces.emp;

import java.util.ArrayList;

public class ArrayListExe {
	public static void main(String[] args) {
		//배열
		Employee[] employeeAry = new Employee[10];
		employeeAry[0]= new Employee(101,"홍길동");//배열은 인덱스에 대입.
		employeeAry[1]= new Employee(102,"김민석");//배열은 인덱스에 대입.
		Employee emp = new Employee(103,"황인만");
		employeeAry[2] = emp;//생성 후 담아야함
		employeeAry[2] = null;//삭제
		
		for (int i= 0; i<employeeAry.length; i++) {
			if(employeeAry[i]!=null) {
				System.out.println(employeeAry[i].getName());
			}
		}
		System.out.println("=======================");
		//컬랙션
		ArrayList<Employee> employeeAryList = new ArrayList<Employee>();//기본10개의 공간이지만 넘으면 자동으로늘어남
		employeeAryList.add(new Employee(104,"최홍길"));//컬렉션은 메소드를 통해서 대입.
		employeeAryList.add(new Employee(105,"이만기"));//두번째도 동일하게 메소드 대입.
		employeeAryList.add(emp);//메소드에 대입만 하면됨.
		employeeAryList.remove(2);//메소드에 대입만 하면됨.배열이라 2번방 위치값을 삭제한다는 뜻.
		for (int i =0;i<employeeAryList.size();i++) {//컬렉션은 길이를 length가 아닌 size()로 메소드실행.
			System.out.println(employeeAryList.get(i).getName());
		}
	}
	
}
