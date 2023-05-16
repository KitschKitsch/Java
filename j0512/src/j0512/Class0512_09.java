package j0512;

import java.util.Scanner;

public class Class0512_09 {

	public static void main(String[] args) {
		// 학생 5명의 이름과 국어,영어,수학 성적을 입력하고 합계와 평균까지 출력하는 프로그램
		
		Scanner scan = new Scanner(System.in);
		
		// 1)배열선언
		String[] name = new String[5];//이름배열
		int[][] score = new int[5][4];//국영수합계 배열
		double[] avg = new double[5];//평균배열
		String[] title = {"이름","국어","영어","수학","합계","평균"};//표상단배열
		
		// 2)성적입력
		for (int i=0; i<score.length; i++) {
			System.out.println((i+1) +"번째 학생: ");
			System.out.println("이름을 입력하세요.>> ");
			name[i] = scan.next();
			
			for (int j=0; j<score[i].length-1; j++) {
				System.out.println(title[j+1] +"성적을 입력하세요.>> ");
				score[i][j] = scan.nextInt();
			}
			score[i][3] = score[i][0]+score[i][1]+score[i][2];//4열에 합계
			avg[i] = score[i][3]/3.0;//평균배열에 따로 저장
		}
		
		// 3)성적출력
		for (int i=0; i<title.length; i++) {
			System.out.printf("%s\t", title[i]);
		}
		System.out.println();
		System.out.println("--------------------------------------------------");
		for (int i=0; i<score.length; i++) {
			System.out.print(name[i] +"\t");
			for (int j=0; j<score[i].length; j++) {
				System.out.print(score[i][j] +"\t");
			}
			System.out.printf("%.2f", avg[i]);
			System.out.println();
		}
	}

}
