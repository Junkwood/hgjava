package com.yedam.collection.emp;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class EmpApp {
	public static void main(String[] args) {
		List<Employee> storage = new ArrayList<>();
		SimpleDateFormat sdf = new SimpleDateFormat("yy-MM-dd");
		Scanner scn = new Scanner(System.in);
		boolean run = true;

		while (run) {
			System.out.println("1.등록 2.조회(입사일자) 9.종료");
			// 23-03-01
			int menu = 0;
			try {
				menu = Integer.parseInt(scn.nextLine());
			} catch (NumberFormatException ne) {
				System.out.println("숫자를 입력하세요");
			}

			switch (menu) {
			case 1:
				System.out.println("사번, 이름, 입사일, 급여를 iii nnn yy-MM-dd sss 방식으로 입력하세요. ");
				while (true) {
					try {
						String[] valAry = scn.nextLine().split(" ");
						storage.add(new Employee(Integer.parseInt(valAry[0]), // 사번
								valAry[1], // 이름
								sdf.parse(valAry[2]), // 입사일
								Integer.parseInt(valAry[3])));// 급여
						break;
					} catch (Exception e) {
						System.out.println("포멧 부정확");
					}
				}
				System.out.println("입력완료");
				break;
			case 2:
				System.out.println("조회할 입사일자>>>");
				Date day = null;
				while (true) {
					try {
						day = sdf.parse(scn.nextLine());
						break;
					} catch (Exception e) {
						System.out.println("날짜포멧 부정확");
					}
				}
				for (int i = 0; i < storage.size(); i++) {
					Date dat = storage.get(i).getHireDate();
					if (!dat.before(day)) {
						System.out.println(storage.get(i).toString());
					}
				}
//				Date searchCondition = day;
//				for (int i = 0; i < storage.size();i++) {
//					if (storage.get(i).getHireDate().after(searchCondition)||storage.get(i).getHireDate().equals(searchCondition)) {
//						System.out.println(storage.get(i).toString());
//					}
//				}
				System.out.println("조회완료");
				break;
			case 9:
				System.out.println("종료");
				run = false;
			}
		}
		System.out.println("end of prog.");

	}

	void method() {
		// 사원번호,이름,입사일자,급여 "101 홍길동 23-05-08 100"
		String val = "101 홍길동 23-05-08 100";
		SimpleDateFormat sdf = new SimpleDateFormat("yy-MM-dd");
		String[] valAry = val.split(" ");
		for (String value : valAry) {
			System.out.println(value);
		}
		try {
			new Employee(Integer.parseInt(valAry[0]), // 사번
					valAry[1], // 이름
					sdf.parse(valAry[2]), // 입사일
					Integer.parseInt(valAry[3]));// 급여
		} catch (Exception e) {
		}

	}

}
