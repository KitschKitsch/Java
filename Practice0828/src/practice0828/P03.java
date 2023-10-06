package practice0828;

import java.util.Scanner;

public class P03 {

	// 클래스 변수(static, 객체선언X, 클래스명.변수명(같은클래스면 생략가능))
	static int count = 0; // 개수변수
	static String[] name = new String[10]; // 이름배열
	static int[][] score = new int[10][4]; // 성적배열(국, 영, 수, 합)
	static double[] avg = new double[10]; // 평균배열
	static int[] rank = new int[10]; // 등수배열

	static String[] title = { "이름", "국어", "영어", "수학", "합계", "평균", "등수" }; // 표상단배열

	public static void main(String[] args) {

		int random = 0;
		for (int i = 0; i < 100; i++) {
			random = (int) (Math.random() * 45);
		}
		System.out.println(random);

		// 학생성적입력 프로그램
		// 1:성적입력 2:성적출력 3:성적수정 4:등수처리 5:학생검색 0:종료

		// 1) 변수&배열선언
		int input = 0; // 메뉴입력변수
		// int count = 0; // 개수변수
		String searchNm = ""; // 이름검색변수
		int chk = 0; // 검색유무변수
		// String[] name = new String[10]; // 이름배열
		// int[][] score = new int[10][4];// 성적배열
		// double[] avg = new double[10];// 평균배열
		// int[] rank = new int[10]; // 등수배열

		// String[] title = { "이름", "국어", "영어", "수학", "합계", "평균", "등수" }; // 표상단배열

		Scanner scan = new Scanner(System.in);

		// 2) 화면출력
		loop: while (true) {
			System.out.println("[ 학생성적입력 프로그램 ]");
			System.out.println("1:성적입력 2:성적출력 3:성적수정 4:등수처리 5:학생검색 0:종료");
			System.out.println("원하시는 번호를 선택하세요 >> ");

			input = scan.nextInt();

			// 3) 조건문
			switch (input) {
			case 0:
				System.out.println(">> 프로그램 종료");
				break loop;

			// 4) 성적입력
			case 1:
				for (int i = count; i < name.length; i++) { // i=0이 아닌 i=count
					System.out.println(count + 1 + "번째 학생의 이름을 입력하세요 (0:이전)");
					name[i] = scan.next();
					// 프로글램 종료
					if (name[i].equals("0")) {
						System.out.println(">> 이전으로");
						break;
					}

					for (int j = 0; j < 3; j++) {
						System.out.println(title[j + 1] + "성적을 입력하세요 >>");
						score[i][j] = scan.nextInt();
						// 합계 & 평균 계산해주는 메소드
						calcul(i);
					}

					count++;

				} // for
				break;

			// 5) 성적출력
			case 2:
				// 성적 출력해주는 메소드
				score();
				break;

			// 6) 성적수정
			case 3:
				System.out.println("수정할 학생의 이름을 입력해주세요 >>");
				searchNm = scan.next();
				chk = 0;// 검색 전 0으로 초기화
				for (int i = 0; i < count; i++) {
					if (name[i].equals(searchNm)) {
						chk = 1; // 유무변수 1로 초기화
						System.out.println("수정할 점수 번호를 입력하세요(1:국어 2:영어 3:수학 0:이전) >>");
						input = scan.nextInt();
						switch (input) {
						case 0:
							System.out.println(">> 이전으로");
							break;
						case 1:
							System.out.println("현재 국어점수: " + score[i][0]);
							System.out.println("수정할 국어점수 >>");
							score[i][0] = scan.nextInt();
							break;
						case 2:
							System.out.println("현재 영어점수: " + score[i][1]);
							System.out.println("수정할 영어점수 >>");
							score[i][1] = scan.nextInt();
							break;
						case 3:
							System.out.println("현재 수학점수: " + score[i][2]);
							System.out.println("수정할 수학점수 >>");
							score[i][2] = scan.nextInt();
							break;
						}
						// 합계 & 평균 계산해주는 메소드
						calcul(i);
					}
				} // for
					// 검색결과 존재하지 않을 때 (chk = 0)
				if (chk == 0) {
					System.out.println(">> 검색 결과가 존재하지 않습니다");
				}
				break;

			// 7) 등수처리
			case 4:
				for (int i = 0; i < count; i++) { // 내 점수와
					int rankCount = 1; // (등수는 1부터 시작하니꽈)
					for (int j = 0; j < count; j++) { // 다른 점수들을
						if (avg[i] < avg[j]) { // 1:1로 비교해봐서 상대 점수 높으면
							rankCount++; // 내 등수 1 하락(증가)
						}
					}
					rank[i] = rankCount;
				}
				// 성적 출력해주는 메소드
				score();
				break;

			// 8) 학생검색
			case 5:
				System.out.println("검색할 학생의 이름을 입력하세요>> ");
				searchNm = scan.next();
				chk = 0;
				
				// 표상단출력
				for (int i = 0; i < title.length; i++) {
					System.out.print(title[i] + "\t");
				}
				System.out.println();
				System.out.println("--------------------------------------------------");
				
				for (int i = 0; i < count; i++) {
					if (name[i].contains(searchNm)) { // contains: 한 글자라도 포함이면 true!
						chk = 1;
						System.out.print(name[i] + "\t");
						for (int j = 0; j < score[i].length; j++) {
							System.out.print(score[i][j] + "\t");
						}
						System.out.printf("%.2f \t", avg[i]);
						System.out.println(rank[i]);
					}
				}
				if (chk == 0) {
					System.out.println(">> 검색 결과가 존재하지 않습니다");
				}
				break;

			}// switch(input)
		} // while(true)
	}// main

	// *** 클래스 메소드(static, 객체선언X, 변수는 클래스 변수로 사용)
	// 1. 합계 & 평균 계산해주는 메소드
	static void calcul(int i) {
		score[i][3] = score[i][0] + score[i][1] + score[i][2];
		avg[i] = score[i][3] / 3.0;
	}

	// 2. 성적 출력해주는 메소드
	static void score() {
		// 표상단출력
		for (int i = 0; i < title.length; i++) {
			System.out.print(title[i] + "\t");
		}
		System.out.println();
		System.out.println("--------------------------------------------------");

		// 성적출력(이름, 성적(국영수합), 평균)
		for (int i = 0; i < count; i++) {
			System.out.print(name[i] + "\t");
			for (int j = 0; j < score[i].length; j++) {
				System.out.print(score[i][j] + "\t");
			}
			System.out.printf("%.2f \t", avg[i]);
			System.out.println(rank[i]);
		} // for
	}

}// class
