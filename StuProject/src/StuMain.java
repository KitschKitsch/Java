import java.util.Scanner;

public class StuMain {
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {

		// 학생 10명 성적입력 프로그램
		// 1:성적입력 2:성적출력 3:성적수정 4:등수처리 5:학생검색 0:프로그램종료

		// 1)변수&배열선언
		Student[] s = new Student[10];// 객체 10개 배열선언(!=객체선언)
		int choice = 0;// 번호입력변수
		int count = 0;// 개수변수
		String searchName = "";// 이름검색변수
		int chk = 0;// 유무변수

//		Student.title//표상단배열

		while (true) {
			// 화면출력 메소드 호출
			choice = stuScreen();// 매개변수 없어도 돌아가는 메소드임!

			switch (choice) {

			case 1:// 성적입력
					// 성적입력 메소드 호출: (클래스명.)메소드명
				count = stuInput(count, s); // 입력된 학생수
				break;

			case 2:// 성적출력

				break;

			case 3:// 성적수정

				break;

			case 4:// 등수처리

				break;

			case 5:// 학생검색

				break;

			case 0:// 프로그램종료

				break;

			}// switch

		} // while

	}// main

	// 화면출력 메소드
	static int stuScreen() {
		System.out.println("[ 학생성적처리 프로그램 ]");
		System.out.println("1:성적입력  2:성적출력  3:성적수정");
		System.out.println("4:등수처리  5:학생검색  0:프로그램종료");
		System.out.println("-----------------------------");
		System.out.println("원하는 번호를 입력하세요.>> ");
		int choice = scan.nextInt();
		return choice;
	}// 화면출력 메소드

	// 1. 학생성적입력 메소드
	static int stuInput(int count, Student[] s) {
		for (int i = count; i < s.length; i++) {
			s[i] = new Student();// 객체선언
			System.out.println((i + 1) + "번째 학생 이름을 입력하세요.(0:이전)>> ");
			s[i].name = scan.next();
			if (s[i].name.equals("0")) {
				System.out.println("이전 페이지로 이동");
				System.out.println();
				break;
			}
			System.out.println("국어점수>> ");
			s[i].kor = scan.nextInt();
			System.out.println("영어점수>> ");
			s[i].eng = scan.nextInt();
			System.out.println("수학점수>>");
			s[i].math = scan.nextInt();
			s[i].sum();// 합계
			s[i].average();// 평균
			System.out.println((count + 1) + "번째 등록 완료");
			System.out.println();
			count++;
		} // for
		return count;
	}// 1.학생성적입력 메소드

}
