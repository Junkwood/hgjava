package com.yedam.io;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class CharStreamExe {
	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		// 문자기반 버퍼스트림
		try {
			FileReader fr = new FileReader("c:/temp/text.dat");
			BufferedReader br = new BufferedReader(fr);

			while (true) {
				String read = br.readLine();// 한라인씩 읽음.
				if (read == null) {//읽을값이 없으면 null값을 반환하기 떄문에 null이면 종료)
					break;
				}
				System.out.println(read);
			}
			br.close();
			fr.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

		System.out.println("end of prog.");
	}

	static void write() {
		// 문자기반 입출력.
		try {
			FileWriter fw = new FileWriter("c:/temp/text.dat");
			while (true) {
				System.out.println("입력>>>");
				String str = scn.nextLine();
				if (str.equals("stop")) {
					break;
				}
				fw.write(str + "\n");
			}
			fw.flush();
			fw.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	static void read() {
		// 문자기반 입출력.
		Class cls = CharStreamExe.class;
		String path = cls.getResource("ByteStreamExe.class").getPath();
		System.out.println(path);
		path = "D:/git/hgjava/hgjava/src/com/yedam/io/ByteStreamExe.java";
		try {
			FileReader fr = new FileReader(path);
			while (true) {
				int read = fr.read();
				if (read == -1) {
					break;
				}
				System.out.print((char) read);
			}
			fr.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
