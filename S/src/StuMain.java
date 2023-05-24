import java.util.ArrayList;
import java.util.Scanner;

public class StuMain {

	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		// 1)변수&배열선언
		int choice = 0;// 번호입력변수
		int count = 0;// 개수변수
		String searchName = "";// 이름검색변수
		int chk = 0; // 유무변수

		String name = "";// 기본변수 다시 정의해서 사용!(간편해짐)
		int kor = 0;// "
		int eng = 0;// "
		int math = 0;// "

		ArrayList<Student> list = new ArrayList<>();
		// <Student> 객체인것만 들어갈 수 있음!!
		// Student[] s = new Student[10];// 객체배열선언(객체선언X): 공간만들기
		// s[0] = new Student(); 객체선언

		// 2)반복문
		while (true) {
			// 화면출력
			System.out.println("[ 학생성적처리 프로그램 ]");
			System.out.println("1:성적입력  2:성적출력  3:성적수정  4:성적삭제  5:학생검색");
			System.out.println("6:등수처리  7:오름차순 정렬  8:내림차순 정렬  0:프로그램 삭제");
			System.out.println("------------------------");
			System.out.println("원하는 번호를 입력하세요.>> ");
			choice = scan.nextInt();

			if (choice == 0) {// 프로그램 종료
				System.out.println("[ 0.프로그램 종료 ]");
				System.out.println();
				break;
			}

			switch (choice) {
			case 1:// 성적입력
				System.out.println("[ 1.성적입력 ]");
				stuInput(list);
				break;

			case 2:// 성적출력
				System.out.println("[ 2.성적출력 ]");
				stuOutput(list);
				break;

			case 3:// 성적수정
				System.out.println("[ 3.성적수정 ]");

				System.out.println("수정할 학생 이름을 입력하세요.>> ");
				searchName = scan.next();
				chk = 0;// 검색초기화

				for (int i = 0; i < list.size(); i++) {
					Student s = list.get(i);// 새롭게 선언!
					if (s.getName().equals(searchName)) {
						System.out.println("[ 검색완료 ]");
						System.out.println("수정할 과목 선택>> ");
						System.out.println("1:국어  2:영어  3:수학");
						System.out.println("------------------");
						choice = scan.nextInt();

						switch (choice) {
						case 1:
							System.out.printf(">> 현재 %s점수: %d \n", Student.title[choice + 1], s.getKor());
							System.out.printf("변경할 %s점수>> ", Student.title[choice + 1]);
							s.setKor(scan.nextInt());
							break;
						case 2:
							System.out.printf(">> 현재 %s점수: %d \n", Student.title[choice + 1], s.getEng());
							System.out.printf("변경할 %s점수>> ", Student.title[choice + 1]);
							s.setEng(scan.nextInt());
							break;
						case 3:
							System.out.printf(">> 현재 %s점수: %d \n", Student.title[choice + 1], s.getMath());
							System.out.printf("변경할 %s점수>> ", Student.title[choice + 1]);
							s.setMath(scan.nextInt());
							break;
						}// switch

						System.out.printf("[ %s점수 수정완료 ]\n", Student.title[choice + 1]);
						// 합계&평균 재호출
						s.setTotal(s.getKor() + s.getEng() + s.getMath());
						s.setAvg(s.getTotal() / 3.0);
						chk = 1;

					} // if
				} // for

				if (chk == 0) {
					System.out.println("[ 검색결과 없음 ]");
					System.out.println();
				}

				break;

			case 4:
				break;

			case 5:
				break;
			}// switch

		} // while

	}// main

	// 다른메소드 선언
	// 1:학생입력
	static void stuInput(ArrayList<Student> list) {

		String name = "";
		int kor = 0, eng = 0, math = 0;

		for (int i = list.size();; i++) {// count 무쓸모...
			System.out.println((i + 1) + "번째 학생 이름을 입력하세요.(0:이전)>> ");
			name = scan.next();

			if (name.equals("0")) {// 이전페이지
				System.out.println(">> 이전 페이지로 이동");
				break;
			}

			System.out.println("국어 점수>> ");
			kor = scan.nextInt();
			System.out.println("영어 점수>> ");
			eng = scan.nextInt();
			System.out.println("수학 점수>> ");
			math = scan.nextInt();

			list.add(new Student(name, kor, eng, math));// total~avg까지 입력되는 생성자

		} // for
	}// stuInput 메소드

	// 2:학생성적출력
	static void stuOutput(ArrayList<Student> list) {
		// 표상단출력
		System.out.printf("%s\t %s\t %s\t %s\t %s\t %s\t %s\t %s\t \n", Student.title[0], Student.title[1],
				Student.title[2], Student.title[3], Student.title[4], Student.title[5], Student.title[6],
				Student.title[7]);
		System.out.println("------------------------------------------------------------");

		// 성적출력
		for (int i = 0; i < list.size(); i++) {// count 무쓸모
			// 학번,이름,국,영,수,합계,평균,등수
			Student s = list.get(i);// 새롭게 선언!
			System.out.printf("%s\t %s\t %d\t %d\t %d\t %d\t %.2f\t %d\t \n", s.getStuNo(), s.getName(), s.getKor(),
					s.getEng(), s.getMath(), s.getTotal(), s.getAvg(), s.getRank());
		}
		System.out.println();

	}// stuOutput 메소드

}
