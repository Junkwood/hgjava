package com.yedam.io.emp;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class EmpExe {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		boolean run = true;
		EmpApp app = new EmpApp();
		SimpleDateFormat sdf = new SimpleDateFormat("yy-MM-dd");

		while (run) {
			System.out.println("1.등록 2.목록 9.종료");
			System.out.print("선택>>");

			int menu = Integer.parseInt(scn.nextLine());
			switch (menu) {
			case 1://사원번호 이름 입사일자 급여
				System.out.println("사원번호 이름 입사일자 급여 >>>");
				String[] emm = scn.nextLine().split(" ");
				Employee emp;
				try {
					emp = new Employee(Integer.parseInt(emm[0]), emm[1], sdf.parse(emm[2]),Integer.parseInt(emm[3]));
					if (app.add(emp)) {
						System.out.println("등록완료.");
					} else {
						System.out.println("등록에러");
					}
				} catch (Exception e) {
					e.printStackTrace();
				}
				break;
			case 2:// 목록
				List<Employee> list = app.list();
				for (Employee empl : list) {
					System.out.println(empl.toString());
				}
				break;
			case 9:
				System.out.println("프로그램 종료");
				app.save();
				run = false;
			}
		}
		System.out.println("end of prog.");
		scn.close();
	}
}
