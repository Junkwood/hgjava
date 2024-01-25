package com.yedam.collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapExe2 {
	public static void main(String[] args) {
		Map<Member, Integer> map = new HashMap<>();//Member 타입이 키값임
		map.put((new Member(1,"홍길동")), 900);
		map.put((new Member(2,"박길동")), 1200);
		map.put((new Member(3,"최길동")), 500);
		map.put((new Member(1,"홍길동")), 800);
		map.put((new Member(4,"유길동")), 1700);
		
		System.out.println("크기: "+map.size());
		System.out.println("키: "+new Member(1,"홍길동"));
		System.out.println("값: "+map.get(new Member(1,"홍길동")));
		
		System.out.println("키 존재유무: " + map.containsKey(new Member(2,"박길동")));
		System.out.println("값 존재유무: " + map.containsValue(1200));
		
		// 포인트가 1000점이 이상인 사람의 이름 출력.
		Set<Member> keyset = map.keySet();
		Iterator<Member> iter = keyset.iterator();
		System.out.println("1000점넘는사람 리스트");
		while(iter.hasNext()) {
			Member key = iter.next();
			Integer val = map.get(key);
			if(val>1000) {
				System.out.println("이름: "+key.getName()+", 포인트: "+val);
			}
		}
		
		Set<Entry<Member,Integer>> eset= map.entrySet();
		Iterator<Entry<Member,Integer>> itera = eset.iterator();
		while(itera.hasNext()) {
			Entry<Member,Integer>ent = itera.next();
			if(ent.getValue()>1000) {
				System.out.println("이름: "+ent.getKey().getName()+", 포인트: "+ent.getValue());
			}
		}
	}
}
