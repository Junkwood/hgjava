package com.yedam.classes;

public class HighStudentExe {
	public static void main(String[] args) {
		HighStudent hiStd = new HighStudent("T001","홍길동",90,"김쌤");
		
		System.out.println(hiStd.getSno());//HightStudent에는 getSno 메소드가 없으나 Student 클래스가 상속되어 사용가능 
		System.out.println(hiStd.getTeacher());
		hiStd.showInfo();//부모클래스의 멤버.
		
		System.out.println("====================");
		//부모클래스의 참조변수에 자식클래스의 인스턴스를 대임
		Student std = (Student) new HighStudent("T002","박길동",80,"김쌤");//(Student)는 없어도 자동형변환됨.
		if(std instanceof HighStudent) {
		HighStudent hstd = (HighStudent) std;//자식클래스 참조변수로 강제 형변환.(HighStudent)는 필수.
//		System.out.println(std.getTeacher());//자식클래스의 메소드 사용불가.부모클래스의 메소드만 사용가능.
		System.out.println(hstd.getTeacher());//형변환을 통해 HighStudet타입이 되어 자식클래스인 HighStudent 메소드 사용가능
		}
		
		Student std1 = new Student("S003", "박석민", 80);
		if(std1 instanceof HighStudent) {
		HighStudent hstd1 = (HighStudent) std1;
		System.out.println(hstd1.getTeacher());
		}
		System.out.println("====================");
		Student[] students = new Student[10];
		//HightStudent[] hiStudents = new HightStudent[10]
		students[0] = new Student("s001","김민석",90);
		students[1] = hiStd;//부모클래스라 자동형변환이 일어남.
		for(int i=0; i< students.length;i++) {
			if(students[i]!=null) {
				students[i].showInfo();
			}
		}//상속을 통해 같은 데이터 타입에 변수를 담을 수 있으며 같은 메소드에 다른 기능을 담을 수 있음.
		
		long ln1 = 10;// 자동형변환(promotion) : 큰 범위의 변수 = (큰 범위의 변수)작은 범위값 할당 가능
		int n1 = (int) ln1; // 강제형변환(casting) : 작은범위 변수 = (작은범위변수)큰 범위값
	}
}
