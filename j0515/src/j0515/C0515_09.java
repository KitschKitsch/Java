package j0515;

import java.util.Scanner;

public class C0515_09 {

	public static void main(String[] args) {
		// 학생 10명 성적입력 프로그램
		// 1:성적입력 2:성적출력 0:종료
		// 1->0:이전 1->1:종료
		// 성적입력->이전을 누르면 이어서 성적입력 가능하게
		// 성적출력은 입력된 학생까지만 나오도록

		Scanner scan = new Scanner(System.in);

		// 1)변수&배열선언 - 메뉴입력변수, 개수변수, 이름배열, 성적배열(국,영,수,합계), 평균배열,
		int input = 0;
		int count = 0;
		String modifyName = "";
		String[] name = new String[10];
		int[][] score = new int[10][4];
		double[] avg = new double[10];
		String[] title = { "이름", "국어", "영어", "수학", "합계", "평균" };

		// 2)화면출력
		loop: while (true) {
			System.out.println("[ 📝 성적입력 프로그램 📊 ]");
			System.out.println("1:성적입력  2:성적출력  3:성적수정  0:종료");
			System.out.println("----------------------- ");
			input = scan.nextInt();

			// 3)조건문
			switch (input) {
			case 0:
				System.out.println(">> 프로그램을 종료합니다.");
				break loop;

			// 4)성적입력
			case 1:
				for (int i = count; i < 10; i++) { // 덮어쓰기 방지!
					System.out.println((count + 1) + "번째 학생(0:이전  1:종료)");
					System.out.println("이름을 입력하세요.>> ");
					name[i] = scan.next();
					if (name[i].equals("0"))
						break; // 이전
					if (name[i].equals("1")) {// 종료
						System.out.println(">> 프로그램을 종료합니다.");
						break loop;
					}

					for (int j = 0; j < 3; j++) {
						System.out.println(title[j + 1] + " 점수를 입력하세요.>> ");
						score[i][j] = scan.nextInt();
						score[i][3] = score[i][3] + score[i][j];
					}

					avg[i] = score[i][3] / 3.0;
					count++; // 덮어쓰기 방지!
				} // for
				break;

			// 5)성적출력
			case 2:
				for (int i = 0; i < title.length; i++) {
					System.out.print(title[i] + "\t");
				}
				System.out.println();
				System.out.println("---------------------------");
				for (int i = 0; i < count; i++) {
					System.out.printf("%s\t%d\t%d\t%d\t%d\t%.2f\n", name[i], score[i][0], score[i][1], score[i][2],
							score[i][3], avg[i]);
				} // for
				break;

			case 3:
				System.out.println("수정할 학생 이름을 입력하세요.>> ");
				modifyName = scan.next();

				int chk = 0;
				for (int i = 0; i < count; i++) {
					if (name[i].equals(modifyName)) {
						System.out.println("[ 수정과목 선택 ]");
						System.out.println("1:국어  2:영어  3:수학");
						System.out.println("수정할 과목을 선택해주세요.>> ");
						input = scan.nextInt();
						chk = 1;

						switch (input) {
						case 1:
							System.out.println("현재 국어점수: " + score[i][0]);
							System.out.println("수정할 국어점수를 입력하세요.>> ");
							score[i][0] = scan.nextInt();
							score[i][3] = score[i][0] + score[i][1] + score[i][2];
							avg[i] = score[i][3] / 3.0;
							System.out.println(">> 수정완료");
							break;
						}// switch
					} // if
				} // for
			}// switch
		} // while
	}

}