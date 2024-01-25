package com.yedam.collection;

import java.util.Stack;

public class StackExe {
	public static void main(String[] args) {
		Stack<String> stack = new Stack<>();
		stack.push("홍길동");
		stack.push("김민석");
		stack.push("최만석");

		
		while(!stack.isEmpty()) {
			String result = stack.pop();
			System.out.println(result); 
		}
		
		//home->product->sell
	}
}
