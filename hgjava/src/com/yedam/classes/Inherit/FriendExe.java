package com.yedam.classes.Inherit;

import java.util.Scanner;

public class FriendExe {
	// 사용자 입력/처리결과 출력 => 컨트롤.
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		boolean run = true;
		FriendApp app= new FriendApp();
		String fno = "";
		
		while(run) {
			System.out.println("1.등록 2.조회 3.수정 4.삭제 9.종료");
			int menu = Integer.parseInt(scn.nextLine());
			
			switch(menu) {
			case 1 ://등록 1)이름연락처 2)학교친구 3)회사친구
				System.out.println("1.친구 2.회사. 3.학교 ");
				int subMenu = Integer.parseInt(scn.nextLine());
				
				System.out.print("이름>>>");
				String name = scn.nextLine();
				System.out.print("연락처>>>");
				String phone = scn.nextLine();
				Friend friend = null;
				if(subMenu==1) {
					friend = new Friend();
					friend.setName(name);
					friend.setPhone(phone);
					
				}else if(subMenu == 2) {
					CompFriend cfriend = new CompFriend();
					cfriend.setName(name);
					cfriend.setPhone(phone);
					System.out.print("회사>>>");
					String company = scn.nextLine();
					System.out.print("부서>>>");
					String dept = scn.nextLine();
					cfriend.setCompany(company);
					cfriend.setDept(dept);
					
					friend = cfriend;
					
				}else if (subMenu == 3){
					UnivFriend ufriend = new UnivFriend();
					ufriend.setName(name);
					ufriend.setPhone(phone);
					System.out.print("학교>>>");
					String univ = scn.nextLine();
					System.out.print("전공>>>");
					String major = scn.nextLine();
					ufriend.setUniv(univ);
					ufriend.setMajor(major);
					
					friend = ufriend;
				}
				if(app.add(friend)) {
					System.out.println("정상등록");
				}else {
					System.out.println("등록안됨");
				}
				break;
			case 2 : // 목록(이름)
				System.out.print("조회할 이름>>>");
				String fname = scn.nextLine();
				Friend[] list = app.list(fname);
				for(int i=0; i<list.length;i++) {
					if(list[i]!=null) {
						System.out.println(list[i].toString());
					}
				}
				break;
				
			case 3 : // 수정
				System.out.print("수정할번호");
				fno = scn.nextLine();
				Friend frn=app.getFriend(fno);
				String infom1="",infom2="";
				if(app.getFriend(fno) == null) {
					System.out.println("없는번호입니다.");
					continue;
				}
				
				if(frn instanceof UnivFriend) {
					System.out.println("수정할 학교>>>");
					infom1 = scn.nextLine();
					System.out.print("수정할 전공>>>");
					infom2 = scn.nextLine();
				}else if(frn instanceof CompFriend) {
					System.out.println("수정할 회사>>>");
					infom1 = scn.nextLine();
					System.out.print("수정할 부서>>>");
					infom2 = scn.nextLine();
				}
				
				if(app.modify(fno,infom1,infom2)){
					System.out.print("수정완료");
				}else {
					System.out.print("수정실패");
				}
				break;
			case 4 : // 삭제
				System.out.print("삭제할 번호");
				fno = scn.nextLine();
				if(app.remove(fno)) {
					System.out.print("삭제완료");
				}
				else {
					System.out.print("삭제실패");
					
				}
				break;
			case 9 :
				System.out.println("종료합니다");
				run = false;
			}//end of switch
			
		}//end of while.
		System.out.println("end of prog.");
	}

	private static Object getFriend(String fno) {
		// TODO Auto-generated method stub
		return null;
	}
}
