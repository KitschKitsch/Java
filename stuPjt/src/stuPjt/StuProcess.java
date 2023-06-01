package stuPjt;

import java.util.ArrayList;
import java.util.Scanner;

public class StuProcess {

	Scanner scan = new Scanner(System.in);
	// 1)변수선언
	int stuNo;
	String name;
	int kor, eng, math;
	String createDate;

	// 1:성적입력 메소드
	ArrayList<Student> stuInput() {// 컬렉션 list를 전달하는 메소드
		ArrayList<Student> list = new ArrayList<>();// 컬렉션 선언! = 여러 객체를 담을 수 있음

		System.out.println("[ 학생성적 입력 ]");
		System.out.print("1 학   번>> ");
		stuNo = scan.nextInt();
		System.out.print("1 이   름>> ");
		name = scan.next();
		list.add(new Student(stuNo, name));

		System.out.print("2 학   번>> ");
		stuNo = scan.nextInt();
		System.out.print("2 이   름>> ");
		name = scan.next();
		list.add(new Student(stuNo, name));

		return list;

	}
}// class
