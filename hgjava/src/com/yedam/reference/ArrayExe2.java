package com.yedam.reference;

import java.util.Scanner;

public class ArrayExe2 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		System.out.println("친구입력>>>");
		String name = scn.nextLine();
		
		String[] friends = {"홍길동","김민수","박석민","최홍만","김길동"};
		double[] dblAry = {67.3, 72.5, 88.3, 79.3, 90.4};
		int[] scores = new int[5];
		scores[0] = 78;
		scores[1] = 92;
		scores[2] = 77;
		scores[3] = 90;
		scores[4] = 95;
		
//		int cnt = 0;
		boolean isExist = false;
		for(int i = 0; i<friends.length;i++) {
			if(friends[i].equals(name)) {
				System.out.printf("%s는 %.1fkg, %d점입니다.",name,dblAry[i],scores[i]);

				isExist = true;
			}
		}
//		if(cnt==0) {
//			System.out.println("찾는사람이 여기에 없습니다.");
//		}
		if(!isExist) {
			System.out.println(name + "님은 여기에 없습니다.");
		}
		
		int max=0;
//		for(int i = 0; i<scores.length;i++) {
//			if(i==0) {
//				continue;
//			}
//			if(scores[i]>scores[i-1]) {
//				max=i;
//			}
		String name1 = "";
		double weight = 0;
		for (int i=0; i< scores.length;i++) {
			if (max<scores[i]) {
				name1 = friends[i];
				weight= dblAry[i];
				max=scores[i];
			}
		}
//		System.out.printf("\n점수가 가장 높은 사람은 %s님, 몸무게는 %.1fkg,점수는 %d점입니다.",friends[max],dblAry[max],scores[max]);
		System.out.printf("\n점수가 가장 높은 사람은 %s님, 몸무게는 %.1fkg,점수는 %d점입니다.",name1, weight,max);
		
		
		System.out.println("\nend of prog.");
	}
	public static void mathod2() {
		
		double[] dblAry = {67.3, 72.5, 88.3, 79.3, 90.4};
		double avg = 0;
		double sum = 0;
		double max = 0;
		
		for(int i = 0; i<dblAry.length;i++) {
			sum += dblAry[i];
			if(dblAry[i]>max) {
				max = dblAry[i];
			}
		}
		avg = sum/dblAry.length;
		
		System.out.println("평균 : " +avg);
		System.out.printf("평균 : %.1f 최대값 : %.1f" ,avg,max);
		
		
		System.out.println("\nend of prog.");
	}
	public static void mathod1() {
		int[] scores = new int[10];
		
		scores[3] = 40;
		
		scores = new int[5];
		scores[0] = 78;
		scores[1] = 82;
		scores[2] = 77;
		scores[3] = 90;
		scores[4] = 85;
		
//		for(int i= 0; i<scores.length; i++) {
//			System.out.println("scores["+ i +"] => " + scores[i]);
//		}
		//80점 이상인 학생은 3명입니다.
		//90점 넘는사람이 있으면 ?명, 없으면 "90점 이상은 없습니다"
		int cnt = 0;
		for(int i= 0; i<scores.length; i++) {
			if(scores[i]>90) {
				System.out.println("인덱스:" + i + "\n값:" + scores[i]);
				cnt++;
			}
		}if(cnt>0) {
			System.out.println("90점 넘는 학생은" +cnt+"명입니다.");
		}else {		
			System.out.println("90점 넘는 학생은없습니다.");
		}
		
		System.out.println("end of prog.");

	}
}
