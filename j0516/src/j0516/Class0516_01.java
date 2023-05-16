package j0516;

import java.util.Scanner;

public class Class0516_01 {

	// 클래스 변수(static, 사용방법: 클래스명.변수명, ***같은 클래스면 클래스명 생략가능)
	static String[] title = { "이름", "국어", "영어", "수학", "합계", "평균", "등수" };
//	인스턴스 변수(main에 객체선언 必)
//	String[] title = { "이름", "국어", "영어", "수학", "합계", "평균", "등수" };

	public static void main(String[] args) {
//		Class0516_01 c = new Class0516_01();

		Scanner scan = new Scanner(System.in);

		// 학생 10명 성적입력 프로그램
		// 1:성적입력 2:성적출력 3:성적수정 4:등수처리 5:학생검색 0:프로그램종료

		// 1)변수&배열선언
		int choice = 0;// 선택번호
		int count = 0;// 성적입력 학생수
		String searchName = "";// 검색이름
		int chk = 0;// 존재유무
		String[] name = new String[10];// 이름
		int[][] score = new int[10][4];// 국,영,수,합계
		double[] avg = new double[10];// 평균
		int[] rank = new int[10];// 등수

		loop: while (true) {
			// 화면출력
			// 클래스 메소드 사용하는 방법: 클래스명.메소드명
			screen();
			// Class0516_01.screen(); //같은 클래스에 있는 클래스 메소드는 클래스명 생략 가능~

			choice = scan.nextInt();

			switch (choice) {
			case 0:// 프로그램종료
				System.out.println("[ 프로그램 종료 ]");
				break loop;

			case 1:// 성적입력
				for (int i = count; i < name.length; i++) {
					// 이름입력부분
					System.out.println(count + 1 + "번째 학생의 이름을 입력하세요.(0:이전)>> ");
					name[i] = scan.next();
					// 이전페이지이동
					if (name[i].equals("0")) {
						System.out.println(">> 이전페이지로 이동합니다.");
						System.out.println();
						break;
					}
					// score[i][0]=국, score[i][1]=영, score[i][2]=수
					for (int j = 0; j < 3; j++) {
						System.out.println(title[j + 1] + "점수를 입력하세요.>> ");
						score[i][j] = scan.nextInt();
					}
					// 합계와 평균
					score[i][3] = score[i][0] + score[i][1] + score[i][2];
					avg[i] = score[i][3] / 3.0;
					System.out.println((count + 1) + "번째 학생성적이 등록되었습니다.");
					System.out.println();

					count++;// 학생수 1증가
				} // for-case1
				break;

			case 2:// 성적출력
				System.out.println("[ 학생성적 ]");

				titleScreen();

				for (int i = 0; i < count; i++) {
					System.out.print(name[i] + "\t");
					for (int j = 0; j < score[i].length; j++) {
						System.out.print(score[i][j] + "\t");
					}
					System.out.printf("%.2f\t", avg[i]);// 평균
					System.out.printf("%d\n", rank[i]);// 등수
					System.out.println();
				}
				break;

			case 3:// 성적수정
					// 수정할 학생이름 입력
				System.out.println("수정할 학생의 이름을 입력하세요.>> ");
				searchName = scan.next();
				// 수정할 학생 검색
				chk = 0;
				for (int i = 0; i < count; i++) {
					if (name[i].equals(searchName)) {
						// 수정할 과목 선택
						System.out.println("[ 수정할 학생을 찾았습니다. ]");
						System.out.println("1:국어  2:영어  3:수학");
						System.out.println("------------------");
						System.out.println("수정할 과목을 선택하세요.>> ");
						choice = scan.nextInt();
						// 수정할 과목 현재 점수 표시
						System.out.printf("[ 현재 %s 점수 ] : %d\n", title[choice], score[i][choice - 1]);
						System.out.println("------------------");
						System.out.println("수정할 점수를 입력하세요.>> ");
						score[i][choice - 1] = scan.nextInt();
						// 합계,평균 수정
						score[i][3] = score[i][0] + score[i][1] + score[i][2];
						avg[i] = score[i][3] / 3.0;
						System.out.println("[ 점수가 수정되었습니다. ]");
						System.out.println();
						chk = 1;
					}
				} // for-case3

				// 찾는 학생 없을시
				if (chk == 0) {
					System.out.println("[ 찾는 학생이 없습니다. ]");
					System.out.println();
				}
				break;

			case 4:// 등수처리
				for (int i = 0; i < count; i++) {
					int rankCount = 1;
					for (int j = 0; j < count; j++) {
						if (score[i][3] < score[j][3]) {// 자기점수보다 높으면
							rankCount++;// 등수 1 증가
						}
					}
					rank[i] = rankCount;
				} // for-case4
				System.out.println("[ 등수처리가 완료되었습니다. ]");
				System.out.println();
				break;

			case 5:// 학생검색
				System.out.println("[ 학생검색 ]");
				System.out.println("검색할 학생의 이름을 입력하세요.>> ");
				searchName = scan.next();
				chk = 0;

				titleScreen();

				for (int i = 0; i < count; i++) {
					if (name[i].contains(searchName)) {// 한글자라도 포함되어 있다면 true
						// 이름 출력되도록
						System.out.print(name[i] + "\t");
						for (int j = 0; j < score[i].length; j++) {
							System.out.print(score[i][j] + "\t");
						}
						System.out.printf("%.2f\t", avg[i]);// 평균
						System.out.printf("%d\n", rank[i]);// 등수
						chk = 1;
					} // if
				} // for-case5
				System.out.println();

				if (chk == 0) {
					System.out.println("[ 찾는 학생이 없습니다. ]");
				}
				System.out.println();
				break;

			}// switch

		} // while
	}// main

	// 클래스 메소드(객체선언X)
	static void screen() {
		System.out.println("[ 학생성적처리 프로그램 ]");
		System.out.println("1:성적입력  2:성적출력  3:성적수정");
		System.out.println("4:등수처리  5:학생검색  0:프로그램종료");
		System.out.println("--------------------------------");
		System.out.println("원하는 번호를 입력하세요.>> ");
	}

	static void titleScreen() {
		for (int i = 0; i < title.length; i++) {
			System.out.print(title[i] + "\t");
		}
		System.out.println();
		System.out.println("--------------------------------------------");
	}

}// class
