package com.yedam.collection;

import java.util.ArrayList;
import java.util.List;

public class ListExe {
	public static void main(String[] args) {
		List<String> names = new ArrayList<>();
		names.add("홍길동");
		names.add("김민석");
		names.add("김민석");//중복내용 입력가능.
		names.add(1, "이만수");// 김민석이 2번방으로 밀림.
		names.add(1, "이만우");// 이만수가 2번방, 김민석이 3번방으로 밀림/
		names.set(1, "김만우");// 방이 커지지 않고 1번방의 값만 변경
		names.remove(1);// 1번방의 김만우를 삭제해서 뒷열이 하나씩 당겨짐.
//		names.clear();// List의 내용을 모두 삭제.

		System.out.println(names.size()); // 크기확인
		
		//반복문
		for(String name : names) {
			System.out.println(name);
		}
//		if (names.size() > 2) {
//			System.out.println(names.get(1));// 배열이었다면 names[1] list는 get(i);메소드로 가져옴
//
//			for (int i = 0; i < names.size(); i++) {
//				System.out.println(i + "번방 " + names.get(i));
//			}
//		}
		
		List<Member> members = new ArrayList<>();
		members.add(new Member(1,"홍길동"));
		members.add(new Member(2,"김민석"));//4:김길동.
		members.add(new Member(3,"이충희"));
		for(int i=0; i<members.size();i++) {
			String name = members.get(i).getName();
			int id = members.get(i).getMid();
			if(name.equals("김민석")) {
				members.set(i,new Member(4,"김길동") );
			}
			System.out.println("아이디: "+id+", 이름: "+ name);
			System.out.println(members.get(i).toString());
		}
		
	}
}
