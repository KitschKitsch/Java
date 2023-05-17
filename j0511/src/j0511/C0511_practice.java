package j0511;

import java.util.Scanner;

public class C0511_practice {

	public static void main(String[] args) {
		// 성적처리 프로그램
		// 이름,국어,영어,수학,합계,평균
		Scanner scan = new Scanner(System.in);
		String[] name = new String[5];
		int[] kor = new int[5];
		int[] eng = new int[5];
		int[] math = new int[5];
		int[] total = new int[5];
		double[] avg = new double[5];
		
		for (int i=0; i<name.length; i++) {
			System.out.println("이름");
			name[i] = scan.next();
			System.out.println("국어점수");
			kor[i] = scan.nextInt();
			System.out.println("영어점수");
			eng[i] = scan.nextInt();
			System.out.println("수학점수");
			math[i] = scan.nextInt();
			total[i] = kor[i]+eng[i]+math[i];
			avg[i] = total[i]/3.0;
		}//for
		
		System.out.println("이름\t국어\t영어\t수학\t합계\t평균\n");
		for (int i=0; i<name.length; i++) {
			System.out.printf("%s\t%d\t%d\t%d\t%d\t%f\n", name[i],kor[i],eng[i],math[i],total[i],avg[i]);
		}
	}
}