package com.yedam.reference;

import java.util.Scanner;

public class ArrayExe3 {
	public static void main(String[] args) {
		Friend f1 = new Friend(); // 초기화.
		f1.name = "홍길동";
		f1.weight = 67.8;
		f1.score = 80;
		
		Friend f2 = new Friend(); // 초기화.
		f2.name = "김길동";
		f2.weight = 77.8;
		f2.score = 86;
		
		Friend f3 = new Friend(); // 초기화.
		f3.name = "김민석";
		f3.weight = 79.8;
		f3.score = 88;
		
		//새로운 친구
		String name="김말숙";
		double weight= 55.5;
		int score = 88;
		
		Friend f4 = new Friend();
		f4.name = name;
		f4.weight = weight;
		f4.score = score;
		
		
		Friend[] friends = {f1,f2,f3};
		friends = new Friend[5]; // 배열은 수정이 불가하여 다시 선언해야함.객체로 선언했기때문에 null이 기본값임.
		friends[0] = f1;
		friends[1] = f2;
		friends[2] = f3;
		friends[3] = f4;
		
		// 김말숙 => 88 -> 90점 변경
		Scanner scn = new Scanner(System.in);
		System.out.println("찾을친구>>");
		String fname = scn.nextLine();
		System.out.println("변경점수입력>>");
		int fscore = Integer.parseInt(scn.nextLine());
		
		int fidx = -1 ;
		
		for(int i = 0; i < friends.length; i++) {
			if(friends[i] != null && friends[i].name.equals(fname)) {
				friends[i].score = fscore;
				fidx=i;
				System.out.printf("%s의 점수가 %d 점으로 변경되었습니다.",friends[fidx].name,friends[fidx].score);
			}
		}
		if(fidx == -1) {
			System.out.println(fname+"님은 목록에 없습니다.");
		}
//		else {
//			System.out.printf("\n%s님의 몸무게는 %.1f kg, 점수는 %d 점.",friends[fidx].name,friends[fidx].weight,friends[fidx].score);
//		}
		
		for(int i=0; i<friends.length;i++) {
			if(friends[i] !=null) {
				System.out.printf("\n%s님의 몸무게는 %.1f kg, 점수는 %d 점.",friends[i].name,friends[i].weight,friends[i].score);
			}
		}
		
//		for(int i = 0; i < friends.length; i++) {
//			if(friends[i] != null && friends[i].name.equals("김민석")) {
//				System.out.printf("몸무게는 %.1f, 점수는 %d", friends[i].weight, friends[i].score );
//			}
//		}
	}
}
