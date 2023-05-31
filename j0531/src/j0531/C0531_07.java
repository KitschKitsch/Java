package j0531;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;

public class C0531_07 {

	public static void main(String[] args) {

		// 파일 저장하기
		// String data = "1,홍길동,100,100,99\r\n2,유관순,99,99,98\r\n3,이순신,88,8,87\r\n";
		String data = "";

		List<Student> list = new ArrayList<>();
		list.add(new Student(1, "홍길동", 100, 100, 99));
		list.add(new Student(2, "유관순", 99, 99, 98));
		list.add(new Student(3, "이순신", 88, 88, 87));

		for (int i = 0; i < list.size(); i++) {
			data += String.format("%d,%s,%d,%d,%d\r\n", list.get(i).getStuNo(), list.get(i).getName().trim(),
					list.get(i).getKor(), list.get(i).getEng(), list.get(i).getMath());
		} // for문

		FileWriter fw = null;
		try {
			fw = new FileWriter("C:/savedata/student.txt");
			fw.write(data);

		} catch (Exception e) {
			e.printStackTrace();

		} finally {
			try {
				fw.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}

		System.out.println(">> 파일이 저장되었습니다.");

	}// main

}// class

//		// 파일 읽어오기
//		BufferedReader br = null;
//		try {
//			br = new BufferedReader(new FileReader("C:/savedata/student.txt"));
//			while (true) {
//				String data = br.readLine();
//				if (data == null)
//					break;
//				System.out.println(data);
//			}
//		} catch (Exception e) {
//			e.printStackTrace();
//		} finally {
//			try {
//				br.close();
//			} catch (Exception e2) {
//				e2.printStackTrace();
//			}
//		}
//		System.out.println("파일을 읽어왔습니다.");