import java.util.Scanner;

public class StuMain {

	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		// 1)변수&배열선언
		int choice = 0;// 번호입력변수
		int count = 0;// 개수변수

		String name = "";// 기본변수 다시 정의해서 사용
		int kor = 0;// "
		int eng = 0;// "
		int math = 0;// "

		Student[] s = new Student[10];// 객체배열선언(객체선언X): 공간만들기
		// s[0] = new Student(); 객체선언

		// 2)반복문
		while (true) {
			// 화면출력
			System.out.println("[ 학생성적처리 프로그램 ]");
			System.out.println("1:성적입력  2:성적출력  0:프로그램 종료");
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
				count = stuInput(count, s);
				break;

			case 2:
				break;

			case 3:
				break;

			case 4:
				break;

			case 5:
				break;
			}// switch

		} // while

	}// main

	// 다른메소드 선언
	static int stuInput(int count, Student[] s) {

		String name = "";
		int kor = 0, eng = 0, math = 0;

		for (int i = count; i < s.length; i++) {
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

			s[i] = new Student(name, kor, eng, math);// total~avg까지 입력되는 생성자

			count++;// 덮어쓰기 방지
		} // for
		return count;
	}// stuInput 메소드

}
