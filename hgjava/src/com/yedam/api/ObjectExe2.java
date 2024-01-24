package com.yedam.api;

import java.util.HashSet;
import java.util.Set;

//hashCode, equals.
public class ObjectExe2 {
	public static void main(String[] args) {
		Set<String>	set = new HashSet<String>();
		set.add("김길동");
		set.add("박길동");
		set.add("홍길동");
		set.add("박길동");//동일값은 추가가 안됨.
		for(String name : set) { // for .. of => for( ... : ...)
			System.out.println(name);
		}
		
		Set<Member> members = new HashSet<Member>();
		members.add(new Member("김길동", 20));
		members.add(new Member("김길동", 20));
		members.add(new Member("홍길동", 22));
		members.add(new Member("박길동", 24));
		for(Member mem : members) {
			System.out.println(mem.toString());
		}
		
		long time1= System.nanoTime();
		long time2= System.nanoTime();
		System.out.println(time2-time1);
	}
}
