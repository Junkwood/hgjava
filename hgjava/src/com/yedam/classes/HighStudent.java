package com.yedam.classes;

public class HighStudent extends Student {
	private String teacher;
	
//	public HighStudent() {
//		super();
//	}
	public HighStudent(String sno, String name) {
		super(sno,name);//super는 부모클래스의 생성자를 부르는것.)
	}
	public HighStudent(String sno, String name, int score, String teacher) {
		super(sno,name,score);
		this.teacher = teacher;
	}
	public String getTeacher() {
		return teacher;
	}
	public void setTeacher(String teacher) {
		this.teacher = teacher;
	}
	
	//부모메소드를 재정의(overriding)
	public void showInfo() {
		//자식클래스:teacher추가 출력
		System.out.printf("번호는 %s, 이름은 %s, 점수는 %d점, 선생님은 %s입니다.\n",this.getSno(),getSname(),getScore(),teacher);
		//부모클래스에서 선언된 변수가 public이었다면 super.sno로 사용가능. 
	}
}
