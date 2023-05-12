package j0512;

import java.util.Scanner;

public class Class0512_08 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String[] title = {"국어","영어","수학","합계"};
		
		int[][] score = new int[5][4]; //5명의 국어,영어,수학,합계까지
		
		//점수입력
		for (int i=0; i<score.length; i++) { //0,1,2,3,4 : 5행
			System.out.println((i+1)+"번째 학생: ");
			for (int j=0; j<score[i].length-1; j++) { //0,1,2 : 3열
				System.out.println(title[j] +" 점수를 입력하세요.>> ");
				score[i][j] = scan.nextInt();
			}
			//합계
			score[i][3] = score[i][0]+score[i][1]+score[i][2];
		}
		
		//점수출력
		for (int i=0; i<title.length; i++) {
			System.out.printf("%s\t", title[i]);
		}
		System.out.println();
		System.out.println("-----------------");
		for (int i=0; i<score.length; i++) {
			for (int j=0; j<score[i].length; j++) {
				System.out.print(score[i][j] +"\t");
			}
			System.out.println();
		}

	}

}
