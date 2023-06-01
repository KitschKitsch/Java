package stuPjt;

import java.io.BufferedReader;
import java.io.FileReader;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class StuProcess {

	// 1)객체&변수선언
	Scanner scan = new Scanner(System.in);
	ArrayList<Student> list = new ArrayList<>();// 컬렉션 선언! = 여러 객체를 담을 수 있음
	int stuNo;
	String name;
	int kor, eng, math;
	String createDate;

	// 1:성적입력 메소드
	ArrayList<Student> stuInput() {// 컬렉션 list를 전달하는 메소드

		while (true) {
			System.out.println("[ 학생성적 입력 ]");
			stuNo = list.size() + 1;
			System.out.println(stuNo + "번째 학생");
			System.out.print("이름(0:이전)>> ");
			name = scan.next();

			if (name.equals("0")) {
				System.out.println(">> 이전페이지로 이동");
				System.out.println();
				break;
			}

			System.out.print("국어성적>> ");
			kor = scan.nextInt();
			System.out.print("영어성적>> ");
			eng = scan.nextInt();
			System.out.print("수학성적>> ");
			math = scan.nextInt();

			// 입력시간
			Date today = new Date();// 날짜객체선언
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");// 날짜형식지정
			createDate = sdf.format(today);// 날짜형식에 넣기

			list.add(new Student(stuNo, name, kor, eng, math, createDate));
			System.out.println("[ 저장 완료 ]");
			System.out.println();
		} // while
		return list;
	}// stuInput메소드

	// 8:파일읽어오기 메소드
	ArrayList<Student> stuRead() throws Exception {

		BufferedReader br = null;
		// try-catch문 안쓰고 throws
		br = new BufferedReader(new FileReader("C:/savedata/student.txt"));
		while (true) {
			String data = br.readLine();// 한줄씩 읽어와서
			if (data == null)// 읽어올 데이터 없으면
				break;// 그만~
			String[] dataArr = data.split(",");// 쉼표단위로 쪼개서 배열에 넣고
			stuNo = Integer.parseInt(dataArr[0]);// String -> Int로 변환해서
			name = dataArr[1];
			kor = Integer.parseInt(dataArr[2]);
			eng = Integer.parseInt(dataArr[3]);
			math = Integer.parseInt(dataArr[4]);
			createDate = dataArr[5];
			list.add(new Student(stuNo, name, kor, eng, math, createDate));// 리스트에 저장
		}
		br.close();

		return list;
	}

}// class
