package com.yedam.classes.Inherit;

import lombok.Data;

// 이름. 연락처 관리(Friend)
// 이름, 연락처, 학교, 전공(UnivFriend)
// 이름, 연락처, 회사, 부서(CompFriend)
@Data
public class Friend /* extends Object */{
	private String name;
	private String phone;
	
	public void changeInfo(String info1, String info2) {
		return;
	}
	
	@Override
	public String toString() {
		return "이름은 " + name + ", 연락처는 " + phone ;
				
	}
	
}
