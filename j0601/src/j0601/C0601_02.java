package j0601;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class C0601_02 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("학번>> ");
		int stuNo = scan.nextInt();
		System.out.println("이름>> ");
		String name = scan.next();
		System.out.println("국어점수>> ");
		int kor = scan.nextInt();
		System.out.println("영어점수>> ");
		int eng = scan.nextInt();
		System.out.println("수학점수>> ");
		int math = scan.nextInt();

		// 1.Date객체선언 2.SimpleDateFormat객체선언 3.format에 date넣기
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		String createDate = sdf.format(date);
		String updateDate = sdf.format(date);

		Student s = new Student(stuNo, name, kor, eng, math, createDate);

		System.out.println("[ 저장완료 ]");
		System.out.println("입력시간: " + s.getCreateDate());
		System.out.println("수정시간: " + s.getUpdateDate());
	}

}
