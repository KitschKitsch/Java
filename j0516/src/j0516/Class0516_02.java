package j0516;

import java.util.Scanner;

public class Class0516_02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		// 학생 10명 성적입력 프로그램
		// 1:성적입력 2:성적출력 3:성적수정 4:등수처리 5:학생검색 0:프로그램종료

		// 1)변수&배열선언
		int choice = 0;
		int count = 0;
		String searchName = "";
		String[] name = new String[10];
		int[][] score = new int[10][4];
		double[] avg = new double[10];
		int[] rank = new int[10];
		String[] title = { "이름", "국어", "영어", "수학", "합계", "평균", "등수" };

		loop: while (true) {
			// 2)화면출력
			System.out.println("[ 학생성적처리 프로그램 ]");
			System.out.println("1:성적입력  2:성적출력  3:성적수정");
			System.out.println("4:등수처리  5:학생검색  0:프로그램종료");
			System.out.println("--------------------------------");
			System.out.println("원하는 번호를 입력하세요.>> ");
			choice = scan.nextInt();

			switch (choice) {
			case 0:// 프로그램종료
				System.out.println("[ 프로그램 종료 ]");
				break loop;

			case 1:// 성적입력
				for (int i = count; i < name.length; i++) {
					System.out.println((count + 1) + "번째 학생의 이름을 입력하세요.(0:이전)>> ");
					name[i] = scan.next();
					if (name[i].equals("0")) {
						System.out.println(">> 이전 페이지로 이동합니다.");
						System.out.println();
						break;
					}

					for (int j = 0; j < 3; j++) {
						System.out.println(title[j + 1] + "성적을 입력하세요.>> ");
						score[i][j] = scan.nextInt();
						score[i][3] = score[i][0] + score[i][1] + score[i][2];
						avg[i] = score[i][3] / 3.0;
					}
					System.out.println((count + 1) + "번째 학생의 성적이 입력되었습니다.");
					System.out.println();
					count++;
				} // for-case1
				break;

			case 2:// 성적출력
				System.out.println("[ 학생성적 ]");
				for (int i = 0; i < title.length; i++) {
					System.out.print(title[i] + "\t");
				}
				System.out.println();
				System.out.println("--------------------------------------------");
				for (int i = 0; i < count; i++) {
					System.out.print(name[i] + "\t");
					for (int j = 0; j < score[i].length; j++) {
						System.out.print(score[i][j] + "\t");
					}
					System.out.printf("%.2f\t", avg[i]);
					System.out.printf("%d\n", rank[i]);
					System.out.println();
				} // for-case2
				break;

			case 3:// 성적수정
				System.out.println("수정할 학생 이름을 입력하세요.>> ");
				searchName = scan.next();

				int chk = 0;
				for (int i = 0; i < count; i++) {
					if (name[i].equals(searchName)) {
						System.out.println("[ 수정할 학생을 찾았습니다. ]");
						System.out.println("1:국어  2:영어  3:수학");
						System.out.println("수정할 과목을 선택하세요.>>");
						choice = scan.nextInt();
						System.out.printf("[ 현재 %s 점수 ]: %d \n", title[choice], score[i][choice - 1]);
						System.out.println("수정할 점수를 입력하세요.>> ");
						score[i][choice - 1] = scan.nextInt();
						score[i][3] = score[i][0] + score[i][1] + score[i][2];
						avg[i] = score[i][3] / 3.0;
						System.out.println("[ 점수가 수정되었습니다. ]");
						System.out.println();
						chk = 1;
					}
				} // for
				if (chk == 0) {
					System.out.println("찾는 학생이 없습니다.");
					System.out.println();
				}
				break;

			case 4:// 등수처리
				for (int i = 0; i < count; i++) {
					int rankCount = 1;
					for (int j = 0; j < count; j++) {
						if (avg[i] < avg[j]) {
							rankCount++;
						}
					}
					rank[i] = rankCount;
				}
				System.out.println("[ 등수처리가 완료되었습니다. ]");
				System.out.println();
				break;
			
			case 5://학생검색
				System.out.println("[ 학생검색 ]");
				System.out.println("검색할 학생의 이름을 입력하세요.>> ");
				
			
			
			}// switch
		} // while

	}

}
