package j0518;

import java.util.Iterator;

public class C0518_01 {

	public static void main(String[] args) {
		// 1~10, 1~100, 1~1000까지 합
		// for문 사용
		int sum1 = 0, sum2 = 0, sum3 = 0;
		for (int i = 1; i <= 10; i++) {
			sum1 = sum1 + i;
		}
		System.out.println("1~10 합: " + sum1);

		for (int i = 1; i <= 100; i++) {
			sum2 = sum2 + i;
		}
		System.out.println("1~100 합: " + sum2);

		for (int i = 1; i <= 1000; i++) {
			sum3 = sum3 + i;
		}
		System.out.println("1~1000 합: " + sum3);

		// 5! = 5*4*3*2*1
		int fac = 1;
		for (int i = 5; i > 0; i--) {
			fac = fac * i;
		}
		System.out.println("5 팩토리얼: " + fac);
	}

}
