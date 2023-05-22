package j0519;

import java.util.Scanner;

public class C0519_01 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		// 학생성적처리 프로그램

		// 1)변수&배열선언
		Student[] s = new Student[10];// 객체배열선언(객체선언X)
		int choice = 0; // 번호입력변수
		int count = 0;// 개수변수
		int chk = 0;// 유무변수
		String searchName = "";// 이름검색변수

		// 반복문
		loop: while (true) {
			// 2)화면출력
			System.out.println("[ 🏫학생성적처리 프로그램📊 ]");
			System.out.println("1:성적입력  2:성적출력  3:성적수정");
			System.out.println("4:등수처리  5:학생검색  0:프로그램종료");
			System.out.println("-----------------------------");
			System.out.println("원하는 번호를 입력하세요.>> ");
			choice = scan.nextInt();

			// 조건문
			switch (choice) {
			case 1:
				System.out.println("[ 1.성적입력 ]");

				for (int i = count; i < s.length; i++) {
					System.out.println((i + 1) + "번째 학생 이름을 입력하세요.(0:이전)>> ");

					s[i] = new Student();// ***객체선언***
					s[i].name = scan.next();

					// 이전페이지
					if (s[i].name.equals("0")) {
						System.out.println(">> 이전페이지로 이동합니다.");
						System.out.println();
						break;
					}
					// 점수입력
					System.out.println("국어 점수>> ");
					s[i].kor = scan.nextInt();
					System.out.println("영어 점수>> ");
					s[i].eng = scan.nextInt();
					System.out.println("수학 점수>> ");
					s[i].math = scan.nextInt();

					s[i].sum();// 합계 메소드 호출
					s[i].average();// 평균 메소드 호출

					System.out.printf("[ '%d'번 학생 성적입력 완료 ]\n", (i + 1));
					System.out.println();
					count++;// 덮어쓰기 방지
				} // for
				break;

			case 2:
				System.out.println("[ 2.성적출력 ]");

				// 표상단출력 메소드
				titlePrint();

				// 성적출력 메소드
				for (int i = 0; i < count; i++) {
					scorePrint(s, i);
				}
				System.out.println();
				break;

			case 3:
				chk = 0;// ***초기화!!!
				System.out.println("[ 3.성적수정 ]");

				// 이름검색
				System.out.println("수정할 학생의 이름 입력 (0:이전)>> ");
				searchName = scan.next();

				// 이전페이지
				if (searchName.equals("0")) {
					System.out.println(">> 이전페이지로 이동합니다.");
					System.out.println();
					break;
				}

				// 점수수정
				for (int i = 0; i < count; i++) {
					if (s[i].name.equals(searchName)) {
						System.out.println("수정할 학생을 찾았습니다.");
						chk = 1;// ***"있음" 표시!!!
						System.out.println("수정할 과목(1:국어, 2:영어, 3:수학)>> ");
						choice = scan.nextInt();

						switch (choice) {
						case 1:
							System.out.println("현재 국어 점수: " + s[i].kor);
							System.out.println("변경할 점수를 입력하세요.>> ");
							s[i].kor = scan.nextInt();
							System.out.println("[ 수정 완료 ]");
							System.out.println();
							break;
						case 2:
							System.out.println("현재 영어 점수:" + s[i].eng);
							System.out.println("변경할 점수를 입력하세요.>> ");
							s[i].eng = scan.nextInt();
							System.out.println("[ 수정 완료 ]");
							System.out.println();
							break;
						case 3:
							System.out.println("현재 수학 점수: " + s[i].math);
							System.out.println("변경할 점수를 입력하세요.>> ");
							s[i].math = scan.nextInt();
							System.out.println("[ 수정 완료 ]");
							System.out.println();
							break;
						}// switch
						s[i].sum();// **합계 메소드 재호출!
						s[i].average();// **평균 메소드 재호출!
					} // if

					// 찾는학생없을때 메소드
					noResult(chk, searchName);

				} // for
				break;

			case 4:
				System.out.println("[ 4.등수처리 ]");

				// 점수비교
				for (int i = 0; i < count; i++) {
					int rankCount = 1;// ***초기화 필요한 등수변수!!!
					for (int j = 0; j < count; j++) {
						if (s[i].avg < s[j].avg) {
							rankCount++;
						}
					}
					s[i].rank = rankCount;
				}

				System.out.println("[ 등수처리 완료 ]");
				System.out.println();
				break;

			case 5:
				chk = 0;
				System.out.println("[ 5.학생검색 ]");
				System.out.println("조회할 학생의 이름 입력 (0:이전)>>");
				searchName = scan.next();

				// 이전페이지
				if (searchName.equals("0")) {
					System.out.println(">> 이전페이지로 이동합니다.");
					System.out.println();
					break;
				}

				// 학생검색
				for (int i = 0; i < count; i++) {
					if (s[i].name.contains(searchName)) {
						chk = 1;
						// 표상단출력 메소드
						titlePrint();
						// 성적출력 메소드
						scorePrint(s, i);
					} // if
				} // for

				// 찾는학생없을때 메소드
				noResult(chk, searchName);
				break;

			case 0:
				System.out.println("[ 0.프로그램 종료 ]");
				break loop;

			}// switch
		} // while
	}// main

	// 표상단출력 메소드
	static void titlePrint() {
		for (int i = 0; i < Student.title.length; i++) {
			System.out.print(Student.title[i] + "\t");
		}
		System.out.println();
		System.out.println("----------------------------------------------------------------------");
	}

	// 성적출력 메소드
	static void scorePrint(Student[] s, int i) {
		System.out.print(s[i].name + "\t");
		System.out.print(s[i].kor + "\t");
		System.out.print(s[i].eng + "\t");
		System.out.print(s[i].math + "\t");
		System.out.print(s[i].total + "\t");
		System.out.printf("%.2f \t", s[i].avg);
		System.out.print(s[i].rank + "\n");
	}

	// 찾는학생없을때 메소드
	static void noResult(int chk, String searchName) {
		if (chk == 0) {
			System.out.printf(">> %s 학생의 데이터가 존재하지 않습니다. \n", searchName);
			System.out.println();
		}
	}

}