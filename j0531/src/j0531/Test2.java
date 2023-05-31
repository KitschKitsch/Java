package j0531;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Test2 {

	Scanner scan = new Scanner(System.in);
	int stuNo;
	String name;
	int kor, eng, math;

	// 메소드: 리턴타입+메소드명+(매개변수)
	List<Student> stuInput(List<Student> list, int stuCount) {// 리턴타입이 List
		while (true) {
			System.out.println("[ 학생성적 입력 ]");

			System.out.print("이름(0:이전)>> ");
			name = scan.next();

			if (name.equals("0")) {
				System.out.println(">> 이전페이지로 이동");
				System.out.println();
				break;
			}

			System.out.print("국어점수>> ");
			kor = scan.nextInt();
			System.out.print("영어점수>> ");
			eng = scan.nextInt();
			System.out.print("수학점수>> ");
			math = scan.nextInt();

			list.add(new Student(stuCount, name, kor, eng, math));
			stuCount++;// 1증가
			System.out.println();

		} // while

		return list;

	}// stuInput
}
