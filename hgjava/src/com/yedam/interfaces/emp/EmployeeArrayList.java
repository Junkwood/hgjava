package com.yedam.interfaces.emp;

import java.util.ArrayList;
import java.util.Scanner;

import com.yedam.classes.singleton.Employee;

// ArrayList<Employee> : 컬렉션으로 진행.
public class EmployeeArrayList implements EmployeeList{
	
	private static EmployeeArrayList instance = new EmployeeArrayList();//필드선언
	private EmployeeArrayList() {}
	ArrayList<Employee> list;
	Scanner scn = new Scanner(System.in);
	
	public static EmployeeArrayList getInstance() {
		return instance;
	}

	@Override
	public void init() {
		list=new ArrayList<Employee>();
		System.out.println("초기화 완료.");
	}

	@Override
	public void input() {
		
		System.out.printf("%d 사번",list.size());//list.size()가 현재까지 추가된 숫자임.
		int no = scn.nextInt();
		
		System.out.print("이름>");
		String name = scn.next();
		
		System.out.print("급여>");
		int sal = scn.nextInt();
		
		list.add(new Employee(no,name,sal));
	}

	@Override
	public String search(int empId) {
		for(int i=0; i<list.size(); i++) {
			if(list.get(i).getEmployeeId() == empId) {
				return list.get(i).getName();
			}
		}
		return "";
	}

	@Override
	public void print() {
		System.out.println("  사번       이름     급여");
		for(int i=0; i<list.size();i++) {
			System.out.printf("%4d %10s %7d\n",list.get(i).getEmployeeId(),list.get(i).getName(),list.get(i).getSalary());
		}
	}

	@Override
	public int sum() {
		int sum=0;
		for(int i = 0; i<list.size();i++) {
				sum +=list.get(i).getSalary();
		}return sum;
	}

}
