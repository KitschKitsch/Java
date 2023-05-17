package j0512;

import java.util.Scanner;

public class Class0512_08 {

	public static void main(String[] args) {
		// 학생 5명의 국어,영어,수학 성적을 입력하고 합계까지 출력하는 프로그램
		
		Scanner scan = new Scanner(System.in);
		
		// 1)배열선언
		int[][] score = new int[5][4];//5행*4열
		String[] title = {"국어","영어","수학","합계"};
		
		// 2)성적입력
		for (int i=0; i<score.length; i++) {
			System.out.println((i+1) +"번째 학생: ");
			for (int j=0; j<score[i].length-1; j++) {
				System.out.println(title[j] +" 성적을 입력하세요.>> ");
				score[i][j] = scan.nextInt();
			}
			score[i][3] = score[i][0]+score[i][1]+score[i][2];//4열에는 합계가 자동으로 입력됨
		}
		
		// 3)성적출력
		for (int i=0; i<title.length; i++) {//표상단출력
			System.out.print(title[i] +"\t");
//			System.out.printf("%s\t", title[i]);
		}
		System.out.println();
		System.out.println("----------------------------------------");
		
		for (int i=0; i<score.length; i++) {//성적출력
			for (int j=0; j<score[i].length; j++) {
				System.out.print(score[i][j] +"\t");
			}
			System.out.println();
		}
	}

}
