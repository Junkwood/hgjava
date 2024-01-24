package com.yedam.exceptions;

public class RuntimeExe2 {
	public static void main(String[] args) {
		
		
		//실행예외
		String str = "10";
		
		str = null;
		
		try {
		System.out.println(str.toString());//NullPointer
		int num = Integer.parseInt(str);//NumberFormat
		} catch(NullPointerException ne) {
			ne.printStackTrace();
		} catch(NumberFormatException ne2) {
			ne2.printStackTrace();
		}
	}
}
