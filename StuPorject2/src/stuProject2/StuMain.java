package stuProject2;

import java.util.ArrayList;
import java.util.Scanner;

public class StuMain {

	public static void main(String[] args) {

		// 1)어레이리스트선언
		ArrayList<Student> list = new ArrayList<>();

		// 2)변수선언
		int choice = 0;
		Scanner scan = new Scanner(System.in);
		String name = "";// 변수재정의해줌
		int kor = 0, eng = 0, math = 0;

		StuProcess StuProcess = new StuProcess();// 객체선언(메소드있는 클래스)

		// 3)반복문
		while (true) {
			// 화면출력
			System.out.println("[ 학생성적처리 프로그램 ]");
			System.out.println("1:성적입력  2:성적출력  0:프로그램 종료");
			System.out.println("------------------------------");
			System.out.println("원하는 번호를 입력하세요.>> ");
			choice = scan.nextInt();

			// 프로그램종료
			if (choice == 0) {
				System.out.println("[ 0:프로그램 종료 ]");
				System.out.println();
				break;
			}

			// 4)조건문
			switch (choice) {
			case 1:// 성적입력
					// StuProcess의 stuInput() 메소드 호출
				StuProcess.stuInput(list);

				break;
			} // switch

		} // while

	}// main

	// 메소드정리

}
