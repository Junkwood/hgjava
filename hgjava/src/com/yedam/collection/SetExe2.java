package com.yedam.collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetExe2 {
	public static void main(String[] args) {
		Set<Member> members = new HashSet<>();//Member 클래스의 equals 여부와 hashCode메소드 결과에 따라 중복체크가 되기 떄문에 기본적으로는 주소값이 달라 객체에 담긴정보가 같더라도 들어감.
		//equals를 바꿔서 true가 나오게 만들고 hasCode메소드 또한 같도록 오버라이드 후 수정하면 객체에 담긴 정보가 같을때 중복으로 처리할 수 있음.
		
		members.add(new Member(1,"홍길동"));
		members.add(new Member(2,"김길동"));
		members.add(new Member(3,"박길동"));
		members.add(new Member(1,"홍길동"));
		
		members.remove(new Member(2,"김길동"));//제거
		
		System.out.println(members.size());
		
		//반복된 요소를 선택해서 가져오는 반복자.
		Iterator<Member> iter = members.iterator();
		//iter.hashNext()는 다음 불러올 값이 있으면 true, 없으면 false값을 반환함.
		while(iter.hasNext()) {
			Member member = iter.next();
			System.out.println(member);
		}

	}
}
