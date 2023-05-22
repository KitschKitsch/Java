package j0519;

import java.util.Scanner;

public class C0519_02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		// [ 학생성적처리 프로그램 ]
		// 1)변수&배열선언
		Student[] s = new Student[10];// 객체배열선언 (객체선언X!)
		int choice = 0;// 입력변수
		int count = 0;// 개수변수
		String searchName = "";// 이름검색변수

		// 2) 반복문
		loop: while (true) {
			System.out.println("[ 🏫학생성적처리 프로그램📊 ]");
			System.out.println("1:성적입력  2:성적출력  3:성적수정");
			System.out.println("4:등수처리  5:학생검색  0:프로그램종료");
			System.out.println("-----------------------------");
			System.out.println("원하는 번호를 입력하세요.>> ");
			choice = scan.nextInt();

			// 3) 조건문
			switch (choice) {
			case 1:// 성적입력
				for (int i = count; i < s.length; i++) {
					System.out.println((i + 1) + "번째 학생 이름을 입력해주세요.(0:이전)>> ");
					s[i] = new Student();// s[i] 객체선언!
					s[i].name = scan.next();

					// 이전페이지이동
					if (s[i].name.equals("0")) {
						System.out.println(">> 이전 페이지로 이동");
						System.out.println();
						break;
					}

					// 성적입력
					System.out.println("국어 점수>> ");
					s[i].kor = scan.nextInt();
					System.out.println("영어 점수>> ");
					s[i].eng = scan.nextInt();
					System.out.println("수학 점수>> ");
					s[i].math = scan.nextInt();

					// 인스턴스메소드 호출
					s[i].sum();// 합계
					s[i].average();// 평균

					count++;// 덮어쓰기 방지
				}
				break;

			case 2:// 성적출력
				System.out.println("[ 성적출력 ]");
				// 표상단출력
				for (int i = 0; i < Student.title.length; i++) {
					System.out.print(Student.title[i] + "\t");
				}
				System.out.println();
				System.out.println("----------------------------------------------------");

				// 성적출력
				for (int i = 0; i < count; i++) {
					System.out.print(s[i].name + "\t");
					System.out.print(s[i].kor + "\t");
					System.out.print(s[i].eng + "\t");
					System.out.print(s[i].math + "\t");
					System.out.print(s[i].total + "\t");
					System.out.printf("%.2f \t", s[i].avg);
					System.out.print(s[i].rank + "\n");
				}
				System.out.println();

				break;// switch 탈출

			case 3:// 성적수정
				System.out.println("[ 성적수정 ]");
				for (int i = 0; i < count; i++) {
					System.out.println("수정할 학생 이름을 입력하세요.>> ");
					searchName = scan.next();
					if (s[i].name.equals(searchName)) {
						System.out.printf(">> %s 학생을 찾았습니다.");
					}
				}
				break;// switch문 탈출

			case 4:

				break;

			case 5:

				break;

			case 0:
				System.out.println("[ 프로그램 종료 ]");
				break loop;

			}// switch문

		} // while문

	}// main

}
