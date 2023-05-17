package j0511;

import java.util.Scanner;

public class C0511_09_practice {

	public static void main(String[] args) {
		// 성적 처리 프로그램
		// 1.이름 2.국어점수 3.영어점수 4.수학점수  합계, 평균 자동으로 들어갈 수 있도록
		Scanner scan = new Scanner(System.in);
		String[] name = new String[3];
		int[] kor = new int[3];
		int[] eng = new int[3];
		int[] math = new int[3];
		int[] total = new int[3];
		double[] avg = new double[3];
		
		int i = 0;
		while (i<3) {
			System.out.println("이름을 입력하세요.");
			name[i] = scan.next();
			System.out.println("국어점수");
			kor[i] = scan.nextInt();
			System.out.println("영어점수");
			eng[i] = scan.nextInt();
			System.out.println("수학점수");
			math[i] = scan.nextInt();
			// 자동계산
			total[i] = kor[i]+eng[i]+math[i];
			avg[i] = total[i]/3.0;
			i++;
		} 
		// 출력
		System.out.println("이름\t국어\t영어\t수학\t합계\t평균");
		System.out.println("---------------------------------------------");
		for (i=0; i<name.length; i++) {
			System.out.printf("%s\t%d\t%d\t%d\t%d\t%.2f\n", name[i],kor[i],eng[i],math[i],total[i],avg[i]);
		}		
	}

}
