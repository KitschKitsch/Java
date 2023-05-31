package j0531;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int choice = 0;// 입력변수
		int stuCount = 3;// 학생수변수

		// List: 인터페이스(부모) - ArrayList: 객체(자식)
		List<Student> list = new ArrayList<>();
		list.add(new Student(1, "홍길동", 100, 100, 99));
		list.add(new Student(2, "유관순", 99, 99, 98));

		while (true) {
			System.out.println("[ 학생성처리 프로그램 ]");
			System.out.println("1:성적입력  2:성적출력");
			System.out.println("8.파일가져오기  9:파일저장하기");
			System.out.println("----------------------");
			System.out.println("원하는 번호를 입력하세요.>> ");

			choice = scan.nextInt();

			switch (choice) {
			case 1:// 성적입력
				Test2 sp = new Test2();// 객체선언

				list = sp.stuInput(list, stuCount);// 메소드호출 후 저장

				break;

			case 2:// 성적출력
				String[] title = { "학번", "이름", "국어", "영어", "수학", "합계", "평균", "등수" };
				System.out.println("[ 학생성적 출력 ]");
				for (int i = 0; i < list.size(); i++) {
					Student s = list.get(i);
					System.out.printf("%d %s \n", s.getStuNo(), s.getName());
				}
				System.out.println();
				break;

			}// switch

		} // while

	} // main

}