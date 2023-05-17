package j0517;

import java.util.Scanner;

public class C0517_05 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		// 3개의 수를 입력받아, 평균에 따른 합격/불합격을 출력하시오.
		// average() 메소드

		// 객체&변수선언
		C0517_05 c = new C0517_05();
		int[] num = new int[3];

		for (int i = 0; i < 3; i++) {
			System.out.println((i + 1) + "번째 수 >>");
			num[i] = scan.nextInt();
		}
		String result = c.average(num[0], num[1], num[2]);
		System.out.println("합격여부: " + result);

	}

	String average(int a, int b, int c) {
		String result = "";
		if ((a + b + c) / 3.0 >= 60) {
			result = "합격";
		} else {
			result = "불합격";
		}
		return result;

	}

}
