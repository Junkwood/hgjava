package com.yedam.phonebook;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashSet;
import java.util.Iterator;

public class UserManager {
	private static String id;
	private static String password;
	private static String name;

	private static File dataFile = new File("c://temp/uid.dat");

	static HashSet<UserManager> storage = new HashSet<>();

	private static UserManager instance;

	public static void readFromFile() {
		if (dataFile.exists() == false) {
			return;// 메소드 종료.
		}
		// 있으면...파일을 읽기.
		try {
			FileReader fr = new FileReader(dataFile);
			BufferedReader br = new BufferedReader(fr);
			String str = "";
			UserManager info = null;
			while ((str = br.readLine()) != null) {
				String[] record = str.split(",");
				// 컬렉션에 저장.
				info = new UserManager(record[0], record[1], record[2]);
				storage.add(info);
			} // end of while
		} catch (Exception e) {
			e.printStackTrace();
		}
	}// end of readFromFile().

	public static void storeToFile() {
		try {
			FileWriter fr = new FileWriter(dataFile);
			Iterator<UserManager> iter = storage.iterator();
			while (iter.hasNext()) {
				UserManager info = iter.next();
				// toString 활용.
				fr.write(info.toString() + "\n");
			}
			fr.flush();
			fr.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	public String toString() {
		return id + "," + password + "," + name;
	}

	public static void userCheck() {
		UserManager info = null;
		String name = MenuViewer.keyboard.nextLine();
		Iterator<UserManager> iter = storage.iterator();
			while(iter.hasNext()) {
				System.out.println("1.로그인 2.아이디생성");
				int menu = MenuViewer.keyboard.nextInt();
				MenuViewer.keyboard.nextLine();
				int c = 0;
				info = iter.next();
				switch (menu) {
				case 1:
					if (info == null) {
						System.out.println("계정이 없습니다. 생성이 필요합니다.");
						continue;
					} else {
						for (UserManager i : storage) {
							while (true) {
								System.out.println("아이디>>");
								String uid = MenuViewer.keyboard.nextLine();
								if (i.id.equals(uid)) {
									System.out.println("비밀번호>>");
									String pass = MenuViewer.keyboard.nextLine();
									while (c != 3) {
										if (i.password.equals(pass)) {
											System.out.println(i.name + "님 환영합니다.");
											break;
										} else {
											c++;
											System.out.println("비밀번호가 틀렸습니다.");
											if(c==3) {
												System.out.println("비밀번호를 3회 틀렸습니다.시스템을 종료합니다.");
											}
										}
									}
								} else {
									System.out.println("존재하지 않는 아이디입니다.");
								}
							}
						}
					}
				case 2:
					System.out.println("아이디를 생성합니다.");
					UserManager();
					readFromFile();
				}
			}
		}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public static void UserManager() {
		System.out.println("사용하실 아이디>>");
		id = MenuViewer.keyboard.nextLine();
		System.out.println("사용하실 비번>>");
		password = MenuViewer.keyboard.nextLine();
		System.out.println("사용자 명>>");
		name = MenuViewer.keyboard.nextLine();

		UserManager User = new UserManager(id, password, name);
		storage.add(User);
		storeToFile();
	}

	private UserManager(String id, String password, String name) {
		super();
		this.id = id;
		this.password = password;
		this.name = name;
	}

	public UserManager() {
		
	}

}
