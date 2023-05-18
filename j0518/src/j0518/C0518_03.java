package j0518;

import java.util.Scanner;

public class C0518_03 {

	public static void main(String[] args) {
		// Scanner - 입력
		Scanner scan = new Scanner(System.in);

//		// 정수
//		int num = scan.nextInt();

//		// 문자
//		String str = scan.next();
		// nextLine(); // enter키까지 받음
//		// 실수
//		double d = scan.nextDouble();

		// 숫자 2개를 입력받아 ex) 1,10 -> 1~10의 합을 구하시오.
		System.out.println("첫번째 숫자>> ");
		int a = scan.nextInt();
		System.out.println("두번째 숫자>> ");
		int b = scan.nextInt();
		
		// 먼저 입력한 숫자가 더 클 경우
		int temp = 0;
		if (a > b) {
			temp = a;
			a = b;
			b = temp;
		}
		
		int sum = 0;
		for (int i = a; i <= b; i++) {
			sum = sum + i;
		}
		System.out.println("합 : " + sum);

	}

}
