package j0516;

import java.util.Scanner;

public class C0516_01 {

	// 클래스변수: static, 클래스명.변수명(같은 클래스면 클래스 생략가능!)
	static String[] title = { "이름", "국어", "영어", "수학", "합계", "평균", "등수" };// 표상단배열
	// 인스터스 변수(main 메소드에 객체선언 선행되야함)
	// String[] title = { "이름", "국어", "영어", "수학", "합계", "평균", "등수" };

	public static void main(String[] args) {
		// Class0516_01 c = new Class0516_01();// 객체선언 -> 인스턴스변수 사용 可
		Scanner scan = new Scanner(System.in);

		// 학생 10명 성적입력 프로그램
		// 1:성적입력 2:성적출력 3:성적수정 4:등수처리 5:학생검색 0:프로그램종료

		// 1)변수&배열선언
		int choice = 0;// 번호입력변수
		int count = 0;// 개수변수
		String searchName = "";// 이름검색변수
		int chk = 0;// 유무변수
		String[] name = new String[10];// 이름배열
		int[][] score = new int[10][4];// 성적배열
		double[] avg = new double[10];// 평균배열
		int[] rank = new int[10];// 등수배열

		loop: while (true) {
			// 2)화면출력
			screen();// 클래스 메소드는 같은 클래스면 클래스명 생략 가능~
			choice = scan.nextInt();
			switch (choice) {
			case 0:// 0:프로그램종료
				System.out.println("[ 프로그램 종료 ]");
				System.out.println();
				break loop;

			case 1:// 1:성적입력
				for (int i = count; i < name.length; i++) {
					System.out.println((count + 1) + "번째 학생 이름을 입력하세요.(0:이전)>> ");
					name[i] = scan.next();
					if (name[i].equals("0")) {
						System.out.println(">> 이전 페이지로 이동합니다.");
						System.out.println();
						break;
					}
					for (int j = 0; j < 3; j++) {
						System.out.println(title[j + 1] + "성적을 입력하세요.>> ");
						score[i][j] = scan.nextInt();
					}
					score[i][3] = score[i][0] + score[i][1] + score[i][2];
					avg[i] = score[i][3] / 3.0;
					System.out.println(">> " + (count + 1) + "번째 학생의 성적이 입력되었습니다.");
					System.out.println();
					count++;
				}
				break;

			case 2:// 2:성적출력

				titleScreen();

				for (int i = 0; i < count; i++) {
					System.out.print(name[i] + "\t");
					for (int j = 0; j < score[i].length; j++) {
						System.out.print(score[i][j] + "\t");
					}
					System.out.printf("%.2f \t", avg[i]);
					System.out.printf("%d \n", rank[i]);
				}
				System.out.println();
				break;

			case 3:// 3:성적수정
				System.out.println("수정할 학생 이름을 입력하세요.>> ");
				searchName = scan.next();

				chk = 0;
				for (int i = 0; i < count; i++) {
					if (name[i].equals(searchName)) {
						System.out.println("[ 수정할 학생을 찾았습니다. ]");
						System.out.println("1:국어  2:영어  3:수학");
						System.out.println("수정할 과목을 선택하세요.>> ");
						choice = scan.nextInt();

						System.out.printf("현재 %s점수: %d \n", title[choice], score[i][choice - 1]);
						System.out.println("변경할 점수를 입력하세요.>> ");
						score[i][choice - 1] = scan.nextInt();
						score[i][3] = score[i][0] + score[i][1] + score[i][2];
						avg[i] = score[i][3] / 3.0;
						System.out.println("[ 수정 완료! ]");
						System.out.println();
						chk = 1;
					}
				}
				if (chk == 0) {
					System.out.println("[ 검색결과 없음. ]");
					System.out.println();
				}
				break;

			case 4:// 4:등수처리
				for (int i = 0; i < count; i++) {
					int rankCount = 1;// for문 안에서 정의해야 1부터 순차적으로 증가!
					for (int j = 0; j < count; j++) {// 자기점수보다 높으면
						if (avg[i] < avg[j]) {// 등수 1증가
							rankCount++;
						}
					}
					rank[i] = rankCount;
				}
				System.out.println("[ 등수처리 완료! ]");
				System.out.println();
				break;

			case 5:// 5:학생검색
				System.out.println("[ 학생검색 ]");
				System.out.println("검색할 학생의 이름을 입력하세요.>> ");
				searchName = scan.next();
				chk = 0;

				titleScreen();

				for (int i = 0; i < count; i++) {
					if (name[i].contains(searchName)) {// 한글자라도 포함 => true
						chk = 1;
						System.out.print(name[i] + "\t");
						for (int j = 0; j < score[i].length; j++) {
							System.out.print(score[i][j] + "\t");
						}
						System.out.printf("%.2f \t", avg[i]);
						System.out.printf("%d \n", rank[i]);
					}
				}
				System.out.println();

				if (chk == 0) {
					System.out.println("[ 검색결과 없음. ]");
					System.out.println();
				}
				break;

			}// switch
		} // while
	}// main
	
	// 클래스 메소드(static, 객체선언X)
	static void screen() {
		System.out.println("[ 학생성적처리 프로그램 ]");
		System.out.println("1:성적입력  2:성적출력  3:성적수정");
		System.out.println("4:등수처리  5:학생검색  0:프로그램종료");
		System.out.println("-----------------------------");
		System.out.println("원하는 번호를 입력하세요.>> ");
	}

	static void titleScreen() {
		for (int i = 0; i < title.length; i++) {
			System.out.print(title[i] + "\t");
		}
		System.out.println();
		System.out.println("----------------------------------------------------");
	}

}// class
