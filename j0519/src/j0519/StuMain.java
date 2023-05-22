package j0519;

import java.util.Scanner;

public class StuMain {

	// main 메소드
	public static void main(String[] args) {
		// [ 학생성적처리 프로그램 ]
		Scanner scan = new Scanner(System.in);// 대문자 => 클래스, new => 객체선언
		Student[] s = new Student[10];// 객체에 대한 배열선언. name~rank까지 배열이 모두 ≠ 객체선언
		int choice = 0;// 번호입력변수
		int count = 0; // 개수변수
		int chk = 0;// 유무변수
		String searchName = "";// 이름검색변수

		String name = "";
		int kor = 0, eng = 0, math = 0;

		// 반복문: for, while
		loop: while (true) {
			System.out.println("[ 학생성적처리 프로그램 ]");
			System.out.println("1:성적입력  2:성적출력  3:성적수정");
			System.out.println("4:등수처리  5:학생검색  0:프로그램종료");
			System.out.println("-----------------------------");
			System.out.println("원하는 번호를 입력하세요.>> ");
			choice = scan.nextInt();

			// 조건문: if, switch (switch가 더 빠름!)
			switch (choice) {
			case 1:
				// 학생 10명 성적을 입력하는 반복문
				// if(초기식; 조건식; 증감식) { }

				for (int i = count; i < s.length; i++) {
					System.out.println((i + 1) + "번째 학생 이름을 입력하세요.(0:이전)>>");
					// Student s[i] = new Student();
					name = scan.next();// 이름입력
					if (name.equals("0")) {// 0 포함?
						System.out.println(">> 이전 페이지로 이동");
						System.out.println();
						break;// for탈출 (while, switch)
					}
					System.out.println("국어 점수>> ");
					kor = scan.nextInt();
					System.out.println("영어 점수>> ");
					eng = scan.nextInt();
					System.out.println("수학 점수>> ");
					math = scan.nextInt();

					// 데이터 값 합계 평균까지 한번에 해결하는 생성자(메소드) 호출
					s[i] = new Student(name, kor, eng, math);// 객체선언 => 이제서야 공간할당!!
					// 인스턴스메소드 호출: 참조변수명.메소드명

					count++;// 학생수 1증가, 덮어쓰기 방지
				} // for문
				break; // switch빠져나옴

			case 2:// 성적출력
				System.out.println("[ 성적출력 ]");

				// 성적출력 메소드 호출
				recordTitle(count, s);

				break;// switch 탈출

			case 3:// 성적수정
				chk = 0;// ***초기화!!

				System.out.println("[ 성적수정 ]");
				System.out.println("수정할 학생 이름을 입력하세요.(0:이전)>> ");
				searchName = scan.next();

				if (searchName.equals("0")) {
					System.out.println(">> 이전 페이지로 이동");
					System.out.println();
					break;// switch문 탈출
				}

				// 수정할 학생의 이름을 비교하기 위한 반복문
				for (int i = 0; i < count; i++) {// 학생수만큼 돌리면서 검색할꺼임..! 없어-없어-있어
					// 조건문
					if (s[i].name.equals(searchName)) {
						System.out.printf("[ %s 학생이 검색되었습니다. ] \n", searchName);
						System.out.println("1:국어  2:영어  3:수학");
						System.out.println("----------------------");
						System.out.println("수정할 과목을 선택해주세요.>> ");
						choice = scan.nextInt();

						// 조건문
						switch (choice) {
						case 1:
							System.out.printf("[ 현재 국어점수: %d] \n", s[i].kor);
							System.out.println("변경할 국어 점수>> ");
							s[i].kor = scan.nextInt();
							s[i].sum();
							s[i].average();
							System.out.println("[ 국어점수 수정완료 ]");
							System.out.println();
							break;

						case 2:
							System.out.printf("[ 현재 영어점수: %d] \n", s[i].eng);
							System.out.println("변경할 영어 점수>> ");
							s[i].eng = scan.nextInt();
							s[i].sum();
							s[i].average();
							System.out.println("[ 영어점수 수정완료 ]");
							System.out.println();
							break;

						case 3:
							System.out.printf("[ 현재 수학점수: %d] \n", s[i].math);
							System.out.println("변경할 수학 점수>> ");
							s[i].math = scan.nextInt();
							s[i].sum();
							s[i].average();
							System.out.println("[ 수학점수 수정완료 ]");
							System.out.println();
							break;

						}// switch문
						chk = 1;// 학생 존재하면 1로 변경

					} // if문

				} // for문

				// 학생이 존재않을 때
				if (chk == 0) {
					System.out.printf("%s 학생은 존재하지 않습니다. \n", searchName);
					System.out.println();
				}
				break;// switch문 탈출

			case 4:// 등수처리
				System.out.println("[ 등수처리 ]");
				// 등수처리 for문
				for (int i = 0; i < count; i++) { // 등록된 학생수만큼 반복
					int rankCount = 1;// 1등부터 2,3,,,등으로 커짐!
					for (int j = 0; j < count; j++) {
						if (s[i].total < s[j].total) { // 학생성적끼리 비교
							rankCount++;
						}
					} // for
					s[i].rank = rankCount;
				}

				System.out.println("등수처리가 완료되었습니다.");
				System.out.println();
				;
				break;

			case 5:// 학생검색
				chk = 0;
				System.out.println("[ 학생검색 ]");
				System.out.println("조회할 학생 이름을 입력하세요.(0:이전)>> ");
				searchName = scan.next();

				if (searchName.equals("0")) {
					System.out.println(">> 이전 페이지로 이동");
					System.out.println();
				}

				for (int i = 0; i < count; i++) {
					if (s[i].name.contains(searchName)) {

						
					}
				}

				if (chk == 0) {
					System.out.printf("%s 학생은 존재하지 않습니다. \n", searchName);
					System.out.println();
				}

				break;

			case 0:
				System.out.println("[ 프로그램 종료 ]");
				System.out.println();
				break loop;
			default:// 조건없을때실행

				break;
			}// switch
		} // while

	}// main

	// 성적출력 클래스메소드
	static void recordTitle(int count, Student[] s) {// count 변경 없으니까 그냥 void(no return)!
		// 표상단출력
		// String[] title = Student.title;// 클래스 변수명 이름 길면 지역변수로 다시 받을 수도 있음!
		for (int i = 0; i < Student.title.length; i++) {
			System.out.print(Student.title[i] + "\t");
		}
		System.out.println();
		System.out.println("---------------------------------------------------");

		// 성적출력
		for (int i = 0; i < count; i++) {
			System.out.print(s[i].name + "\t");
			System.out.print(s[i].kor + "\t");
			System.out.print(s[i].eng + "\t");
			System.out.print(s[i].math + "\t");
			System.out.print(s[i].total + "\t");
			System.out.printf("%.2f\t", s[i].avg);
			System.out.print(s[i].rank + "\n");

		}
		System.out.println();

	}// recordTitle

}
