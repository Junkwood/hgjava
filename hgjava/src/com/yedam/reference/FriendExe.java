package com.yedam.reference;

import java.util.Scanner;

// 친구의 정보를 저장하고 변경하고 관리.
// Create, Read, Update, Delete.
// 등록시 이름을 안넣으면 넣으라고 하는 것을 해보도록. 나머진 안넣어도 상관없음. - 숙제
public class FriendExe {
	
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		boolean run = true;
		Friend[] friends = new Friend[5];
		int fnum=-1;
		int cntm=0;
		int cntf=0;
		while(run) {
			System.out.println("1.등록 2.조회 3.수정 4.삭제 5.점수조회 6.분석 9.종료");
			//점수조회는 입력점수 이상인 친구만 출력, 분석은 평균점수: ??? 최고점수는 ???점  
			int menu = Integer.parseInt(scn.nextLine());
			switch(menu) {
				case 1 : 
					System.out.println("이름을 입력하세요");
					String name = scn.nextLine();
					System.out.println("몸무게를 입력하세요");
					double weight = Double.parseDouble(scn.nextLine());
					System.out.println("점수를 입력하세요");
					int score = Integer.parseInt(scn.nextLine());
					cntf++;
					Friend friend = new Friend();
					friend.name = name;
					friend.weight = weight;
					friend.score = score;
					for(int i=0;i<friends.length;i++) {
						if(friends[i] == null) {
							friends[i] = friend;
							break;
						}
					}
					System.out.println("등록이 완료되었습니다.");
					break;
				case 2 : //전체목록 확인
					System.out.println("========== 전체 목록 ==========");
					for(int i=0;i<friends.length; i++) {
						if(friends[i] != null) {
							System.out.printf("\n이름: %s, 몸무게:%.1f, 점수: %d", friends[i].name,friends[i].weight,friends[i].score);
						}
					}
					System.out.println("\n===========================");
					break;
				case 3 : //수정
					System.out.println("수정할 친구 번호를 입력하세요");
					for(int i=0;i<friends.length; i++) {
						if(friends[i] != null) {
							System.out.printf("\n%d . 이름: %s", i , friends[i].name);
							cntm++;
						}
					}
					fnum=Integer.parseInt(scn.nextLine());
					if(cntm-1<fnum) {
						System.out.println("없는 친구 번호입니다.");
						cntm=0;
						break;
					}
					System.out.println("몸무게>>>");
					String sweight = scn.nextLine();
					if(sweight!="") {
					friends[fnum].weight = Double.parseDouble(sweight);
					}
					System.out.println("점수>>>");
					String sscore = scn.nextLine();
					if(sscore!="") {
						friends[fnum].score = Integer.parseInt(sscore);						
					}
					System.out.println("수정이 완료되었습니다.");
					fnum=-1;
					break;
				case 4 : //삭제
					System.out.println("삭제할 친구 번호를 입력하세요");
					for(int i=0;i<friends.length; i++) {
						if(friends[i] != null) {
							System.out.printf("\n%d . 이름: %s", i , friends[i].name);
							cntm++;
						}
					}
					fnum=Integer.parseInt(scn.nextLine());
					if(cntm-1<fnum) {
						System.out.println("없는 친구 번호입니다.");
						cntm=0;
						break;
					}
					
					friends[fnum] = null;
					fnum=-1;
					cntf--;
					System.out.println("삭제가 완료되었습니다.");
					break;
					
				case 5 ://점수조회
					System.out.println("몇 점 이상을 조회할까요?");
					fnum=Integer.parseInt(scn.nextLine());
					System.out.println("점수가 "+fnum+"점 이상인 친구목록");
					for(int i=0;i<friends.length;i++) {
						if(friends[i] != null && friends[i].score>=fnum) {
							System.out.println(friends[i].name);
						}
					}
					fnum=-1;
					System.out.println("====================");
					System.out.println("조회가 완료되었습니다.");
					break;
				case 6 ://분석
					double sum = 0;
					int max = 0;
					double avg = 0;
					for(int i = 0; i<friends.length;i++) {
						if(friends[i] != null) {
							sum += friends[i].score;
							if(friends[i].score > max) {
								max = friends[i].score;
							}
						}
					}
					avg = sum/cntf;
					System.out.printf("\n평균점수는 %.1f점, 최고점수는 %d점 입니다.\n",avg,max);
					break;
				case 9 : 
					run = false;
					System.out.println("종료합니다.");
			}
		}
		System.out.println("end of prog.");
	}
}
