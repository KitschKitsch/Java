package j0512;

import java.util.Scanner;

public class C0512_06 {

	public static void main(String[] args) {
		// 1차원배열 vs 2차원배열
		
		Scanner scan = new Scanner(System.in);
		
		// 1차원배열 - 배열선언,입력,출력
		int[] num = new int[3];
		
		for (int i=0; i<num.length; i++) {
			System.out.println("점수를 입력하세요.>> ");
			num[i] = scan.nextInt();
		}

		for (int i=0; i<num.length; i++) {
			System.out.print(num[i] +" ");
		}
		System.out.println();
		
		// 2차원배열 - 배열선언,입력,출력
		int[][] num2 = new int[3][4];//3행*4열
		
		for (int i=0; i<num2.length; i++) {//3행
			for (int j=0; j<num2[i].length; j++) {//4열
				System.out.println("2차원 점수를 입력하세요.>> ");
				num2[i][j] = scan.nextInt();
			}
		}//for문(입력)
		
		for (int i=0; i<num2.length; i++) {//3행
			for (int j=0; j<num2[i].length; j++) {//4열
				System.out.print(num2[i][j] +"\t");
			}
			System.out.println();
		}//for문(출력)
	}

}
