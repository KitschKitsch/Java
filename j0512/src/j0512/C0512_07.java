package j0512;

import java.util.Scanner;

public class C0512_07 {

	public static void main(String[] args) {
		// 학생 5명의 국어,영어,수학 성적을 입력하고 출력하는 프로그램
		// 2차원배열사용
		
		Scanner scan = new Scanner(System.in);
		
		// 1)배열선언 - 2차원성적배열,표상단배열
		int[][] score = new int[5][3];//5행*3열
		String[] title = {"국어","영어","수학"};
		
		// 2)성적입력
		for (int i=0; i<score.length; i++) {
			System.out.println((i+1) +"번째 학생: ");
			for (int j=0; j<score[i].length; j++) {
				System.out.println(title[j] +" 성적을 입력하세요.>> ");
				score[i][j] = scan.nextInt();
			}
		}
		
		// 3)성적출력
		for (int i=0; i<score.length; i++) {
			for (int j=0; j<score[i].length; j++) {
				System.out.print(score[i][j] +"\t");
			}
			System.out.println();
		}
	}

}
