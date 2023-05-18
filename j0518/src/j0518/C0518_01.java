package j0518;

import java.util.Iterator;
import java.util.Scanner;

public class C0518_01 {

	public static void main(String[] args) {
		// 1~10, 1~100, 1~1000까지 합
		// for문 사용
		// 1)변수선언
		int sum1 = 0, sum2 = 0, sum3 = 0;
		// 2-1)1~10
		for (int i = 1; i <= 10; i++) {
			sum1 = sum1 + i;
		}
		System.out.println("1~10 합: " + sum1);

		// 2-2)1~100
		for (int i = 1; i <= 100; i++) {
			sum2 = sum2 + i;
		}
		System.out.println("1~100 합: " + sum2);

		// 2-3)1~1000
		for (int i = 1; i <= 1000; i++) {
			sum3 = sum3 + i;
		}
		System.out.println("1~1000 합: " + sum3);

		// 5 팩토리얼 (5! = 5*4*3*2*1)
		int fac = 1;
		for (int i = 5; i > 0; i--) {
			fac = fac * i;
		}
		System.out.println("5 팩토리얼: " + fac);
		System.out.println();

		// 숫자를 입력받아 해당 숫자부터 시작하는 팩토리얼을 구현하시오.
		System.out.println("[ 입력받은 숫자의 팩토리얼(!) ]");

		// 1)입력
		Scanner scan = new Scanner(System.in);
		System.out.println("팩토리얼에 사용할 숫자를 입력하세요.>> ");
		int input = scan.nextInt();

		// 2)변수선언
		int fac2 = 1;

		// 3)반복문
		for (int i = input; i > 0; i--) {
			fac2 = fac2 * i;
		}

		// 4)출력
		System.out.printf(">> 결과값: %,d! = %,d \n", input, fac2);

	}

}
