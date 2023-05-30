package C04_Collections;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;

public class TestFile {

	// 읽어오는 메소드
	ArrayList<Student> fileRead() throws Exception {
		ArrayList<Student> list = new ArrayList<>();

		BufferedReader br = null;// 한글자씩 읽던 FileReader를 한줄씩 읽기
		br = new BufferedReader(new FileReader("C:/data/student.txt"));

		while (true) {
			String data = br.readLine();// 한줄씩 읽기

			if (data == null)// 읽어올 데이터 없으면
				break;// 종료

			System.out.println(data);
			String[] dataArr = data.split(",");// 1,"홍길동",100,100,99
			System.out.println("길이:" + dataArr.length);

			int stuNo = Integer.parseInt(dataArr[0].trim());// String->Int로
			String name = dataArr[1].trim();
			int kor = Integer.parseInt(dataArr[2].trim());
			int eng = Integer.parseInt(dataArr[3].trim());
			int math = Integer.parseInt(dataArr[4].trim());

			list.add(new Student(stuNo, name, kor, eng, math));// 읽어온 데이터 리스트에 담기

		}
		br.close();

		return list;
	}// fileRead

	// 저장하는 메소드: 외부접속은 try-catch문
	void fileSave() throws Exception {
		FileWriter fw = null;
		fw = new FileWriter("C:/data/student.txt");

		String data = "1,홍길동,100,100,99\r\n";// 윈도우용 줄바꿈
		data += "2,유관순,99,99,98\r\n";// 공백넣으면 에러남;;; trim의 중요성***
		data += "3,이순신,98,98,91\r\n";
		fw.write(data);

		fw.flush();// 버퍼 한번에 읽기
		fw.close();// ***파일 닫기

		System.out.println(">> 파일이 저장되었습니다.");
	}// fileSave

}
