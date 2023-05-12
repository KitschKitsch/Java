package j0512;

import java.util.Scanner;

public class Class0512_09 {

	public static void main(String[] args) {
		// 이름(1차원)을 넣고 국어,영어,수학,합계(2차원), 평균(1차원) 출력
		Scanner scan = new Scanner(System.in);
		
		String[] name = new String[5];
		int[][] score = new int[5][4];
		double[] avg = new double[5];
		String[] title = {"이름","국어","영어","수학","합계","평균"};
		
		//입력
		for (int i=0; i<score.length; i++) {
			System.out.println(i+1 +"번째 학생: ");
			System.out.println("이름 입력>> ");
			name[i] = scan.next();
			
			for (int j=0; j<score[i].length-1; j++) {
				System.out.println(title[j+1] +" 점수 입력>> ");
				score[i][j] = scan.nextInt();
			}
			//합계
			score[i][3] = score[i][0]+score[i][1]+score[i][2];
			//평균
			avg[i] = score[i][3]/3.0;
		}

		//출력(title)
		for (int i=0; i<title.length; i++) {
			System.out.printf("%s\t", title[i]);
		}
		System.out.println();
		System.out.println("-----------------------------------------");
		//출력(name+score)
		for (int i=0; i<score.length; i++) {
			System.out.print(name[i] +"\t");
			for (int j=0; j<score[i].length; j++) {
				System.out.print(score[i][j] +"\t");
			}
			System.out.printf("%.2f", avg[i]); //평균출력
			System.out.println();
		}
	}

}