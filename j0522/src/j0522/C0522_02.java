package j0522;

import java.util.Scanner;

public class C0522_02 {

	public static void main(String[] args) {
		// 두 수를 입력받아 사칙연산 - 배열 활용

		int[] num = new int[4];
		int[] data = new int[8];

		Scanner scan = new Scanner(System.in);

		for (int i = 0; i < 2; i++) {// 0,1

			for (int j = (2 * i); j < (2 * i) + 2; j++) {// 0,1, 2,3
				System.out.println((j + 1) + "번째 숫자를 입력하세요.>> ");
				num[j] = scan.nextInt();
			}
			data[4 * i] = num[(2 * i)] + num[(2 * i) + 1];// 4*0, 4*1
			System.out.println(data[4 * i]);

			data[4 * i + 1] = num[(2 * i)] - num[(2 * i) + 1];
			System.out.println(data[4 * i + 1]);

			data[4 * i + 2] = num[(2 * i)] * num[(2 * i)];
			System.out.println(data[4 * i + 2]);

			data[4 * i + 3] = num[(2 * i)] / num[(2 * i)];
			System.out.println(data[4 * i + 3]);
		}

//			for (int i = 2; i < 4; i++) {
//				System.out.println((i - 1) + "번째 숫자를 입력하세요.>> ");
//				num[i] = scan.nextInt();
//			}
//
//			data[4] = num[2] + num[3];
//			System.out.println(data[4]);
//			data[5] = num[2] - num[3];
//			System.out.println(data[5]);
//			data[6] = num[2] * num[3];
//			System.out.println(data[6]);
//			data[7] = num[2] / num[3];
//			System.out.println(data[7]);
	}
}
