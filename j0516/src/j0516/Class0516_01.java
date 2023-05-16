package j0516;

import java.util.Scanner;

public class Class0516_01 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		// 학생 10명 성적입력 프로그램
		// 1:성적입력 2:성적출력 3:성적수정 4:등수처리 5:학생성적검색 0:프로그램종료

		// 1)변수&배열선언
		int choice = 0;// 선택번호
		int count = 0;//성적입력 학생수
		String[] name = new String[10];// 이름
		int[][] score = new int[10][4];// 국,영,수,합계
		double[] avg = new double[10];// 평균
		String[] title = { "이름", "국어", "영어", "수학", "합계", "평균" };

		loop: while (true) {
			// 화면출력
			System.out.println("[ 학생성적처리 프로그램 ]");
			System.out.println("1:성적입력  2:성적출력  3:성적수정");
			System.out.println("4:등수처리  5:학생성적검색  0:프로그램종료");
			System.out.println("--------------------------------");
			System.out.println("원하는 번호를 입력하세요.>> ");
			choice = scan.nextInt();

			switch (choice) {
			case 0:
				System.out.println("[ 프로그램 종료 ]");
				System.out.println();
				break loop;
			
			case 1:
				for (int i=count; i<name.length; i++) {
					//이름입력부분
					System.out.println(count+1 +"번째 학생의 이름을 입력하세요.>> ");
					name[i] = scan.next();
				}
				break;
			}// switch

		}// while
	}

}
