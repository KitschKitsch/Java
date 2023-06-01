package stuPjt;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StuMain {

	public static void main(String[] args) throws Exception {

		// 1)객체&변수선언
		Scanner scan = new Scanner(System.in);
		StuProcess sp = new StuProcess();// StuProcess 객체선언
		ArrayList<Student> list = new ArrayList<>();// 데이터 저장하는 컬렉션
		list = sp.stuRead();// 8:파일읽어오기 메소드 호출 ~ 동기화됨!
		int choice = 0;// 입력변수

		while (true) {
			System.out.println("[ 📝학생성적 프로그램📊 ]");
			System.out.println("1:성적입력 \t2:성적출력 \t3:성적수정");
			System.out.println("4:성적삭제 \t5:학생검색 \t6:등수처리");
			System.out.println("7:오름차순정렬\t8:파일읽어오기\t9:파일저장하기");
			System.out.println("0:프로그램 종료");
			System.out.println("-------------------------------------");
			System.out.println("원하는 번호를 입력하세요.>> ");
			choice = scan.nextInt();

			switch (choice) {
			case 1:
				// 1:성적입력 메소드 호출
				sp.stuInput();

				break;
			case 2:
				break;
			case 3:
				break;
			case 4:
				break;
			case 5:
				break;
			case 6:
				break;
			case 7:
				break;

			case 8:
				// 8:파일읽어오기 메소드 호출
				list = sp.stuRead();

				break;
			case 9:
				break;

			}// switch

		} // while

	}// main

}// class
