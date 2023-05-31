package j0531;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class C0531_02 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		StuProcess sp = new StuProcess();// 객체선언
		List<Student> list = new ArrayList<>();
		int choice = 0;// 입력변수
		int stuCount = list.size() + 1;// 학생수변수

		// List: 인터페이스(부모) - ArrayList: 객체(자식)
		// list.add(new Student(1, "홍길동", 100, 100, 99));
		// list.add(new Student(2, "유관순", 99, 99, 98));

		while (true) {
			System.out.println("[ 학생성처리 프로그램 ]");
			System.out.println("1:성적입력  2:성적출력");
			System.out.println("8.파일가져오기  9:파일저장하기");
			System.out.println("----------------------");
			System.out.println("원하는 번호를 입력하세요.>> ");

			choice = scan.nextInt();

			switch (choice) {
			case 1:// 성적입력

				stuCount = list.size() + 1;
				Map<String, Object> map = sp.stuInput(list, stuCount);// 메소드호출 후 저장
				list = (List<Student>) map.get("list");// Map의 Object는 강제변환 必!
				stuCount = (int) map.get("stuCount");// Map의 Object는 강제변환 必!
				break;

			case 2:// 성적출력

				list = sp.stuOutput(list);// 메소드호출(매개변수 list 전달) 후 저장
				break;

			case 8:// 파일에서 가져오기

				list = sp.stuRead();// 메소드호출 후 저장
				System.out.println("[ 파일을 읽어왔습니다. ]");
				System.out.println();
				break;

			case 9:// 파일에 저장하기

				sp.stuSave(list);
				System.out.println("[ 파일로 저장되었습니다. ]");
				System.out.println();
				break;
			}// switch

		} // while

	} // main

}