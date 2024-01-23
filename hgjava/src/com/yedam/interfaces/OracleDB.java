package com.yedam.interfaces;

public class OracleDB implements DAO {
	
	public void insert() {
		System.out.println("[Oracle] 입력.");
	}
	public void update() {
		System.out.println("[Oracle] 수정.");
	}
	public void delet() {
		System.out.println("[Oracle] 삭제.");
	}
	@Override
	public void delete() {
	}
	
}
