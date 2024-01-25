package com.yedam.thread;

import java.awt.Toolkit;

// 삐 소리를 출력하는 기능과 실제 콘솔에다 문자를 출력하는 기능.동시에 처리되도록.
public class BeepPrintExe {
	public static void main(String[] args) {
		
//		Thread thread = new Thread(new BeepTask());
		Thread thread = new BeepThread();
		thread.start();//start 호출하면 run() 메소드 실행
		
		//메인스레드
		for (int i = 0; i < 5; i++) {
			System.out.println("print");
			try {
				Thread.sleep(500);// 0.5초마다 출력
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
