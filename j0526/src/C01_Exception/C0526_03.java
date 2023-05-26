package C01_Exception;

import java.io.FileWriter;

public class C0526_03 {

	public static void main(String[] args) throws Exception {

		FileWriter fw = null;// 문자를 저장할 수 있는 객체선언
		fw = new FileWriter("c:/data/stu.txt");

		String[] name = { "홍길동", "유관순", "이순신", "강감찬", "김구" };
		String str = "";
		for (int i = 0; i < 5; i++) {
			str = str + (1001 + i) + "," + name[i] + ", 100, 100, 99 \r\n";
		}
		fw.write(str);// 글자저장
		fw.flush();// 버퍼저장
		fw.close();// ***종료!!!

		System.out.println("파일이 저장되었습니다.");
	}

}
