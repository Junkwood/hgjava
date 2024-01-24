package com.yedam.api;

public class StringTest {
	public static void main(String[] args) {
		//1번문제의 데이터
		String[] jumins = {"970101-1234567","970101-2234567","9701011234567", "970101 1234567", "030301 4234567", "030301 1234567" };
		for(String ssn : jumins) {
			checkGender(ssn);
		}
		//2번문제 길동이라는 이름이 몇번나오는지 확인
		
		String [] names= {"김길동", "홍길동", "이상민", "김민수", "길동이"};
		int dup = 0;
		for(String name : names) {
			if(name.indexOf("길동") !=-1) {
				dup++;
			}
		}
		dup=0;
		for(int i=0;i<names.length;i++) {
			String name=names[i];
			if(name.indexOf("길동") !=-1) {
				dup++;
			}
		}
		System.out.println("이름에 길동이 포함된 인원은 총 " + dup + "명입니다.");
		
	}
	
	static void checkGender(String ssn) {
		char genderno=0;
		int lo = ssn.length(); 
//		System.out.println(lo);
		if(lo == 14) {
			genderno=ssn.charAt(7);
			System.out.println(genderno);
			
		}else if(lo == 13) {
			genderno=ssn.charAt(6);
			System.out.println(genderno);
		}
		switch(genderno-48) {
		case 1:
		case 3:System.out.println("주민번호: "+ ssn + "성별 : 남성");
		break;
		case 2:
		case 4:System.out.println("주민번호: "+ ssn + "성별 : 여성");		
		}}
	static void checkGender2(String ssn) {
		int yy = Integer.parseInt(ssn.substring(0, 2));
		boolean before2000 = yy>23;
		char pos = ssn.charAt(ssn.length() -7);
		String gender="여자";
		if(before2000) {
			if(pos=='1') {
				gender="남자";
			}else if(pos=='2') {
				gender="여자";
			}else {
			 gender="오류";
			}
		}
		if(!before2000) {
			if(pos=='3') {
				gender="남자";
			}else if(pos=='4') {
				gender="여자";
			}else {
				gender="오류";
			}
		}
		System.out.println(gender);
	}
}
