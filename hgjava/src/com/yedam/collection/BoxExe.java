package com.yedam.collection;

import java.util.ArrayList;
import java.util.List;

public class BoxExe {
	public static void main(String[] args) {
		Box<String> box = new Box<String>();
		box.setObj("hong");
		String result = box.getObj();
		
		Box<Integer> boxi=new Box<>();
		boxi.setObj(100);
		Integer resulti = boxi.getObj();
//		box.setObj(100);
//		box.setObj("Hong");
//		Integer result = (Integer) box.getObj();
		System.out.println(result);
		System.out.println(resulti);
		
		List<Integer> list = new ArrayList<>();
		list.add(1579);
		list.add(1142);
		List lis = new ArrayList();
		lis.add("o");
		lis.add(100);
		
		for(int i =0;i<lis.size(); i++) {
			String res = (String)lis.get(i); // int타입도 담겨있어 클래스오류남.
		}
		
	}
}
