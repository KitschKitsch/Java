package j0522;

import java.util.Scanner;

public class C0522_03 {

	public static void main(String[] args) {
		// 두 수를 입력받아 사칙연산 - 기본생성자 활용

		Scanner scan = new Scanner(System.in);

		// 배열선언
		Data[] d = new Data[2];

		for (int i = 0; i < 2; i++) {
			// 객체선언
			d[i] = new Data();

			System.out.println("1번째 숫자를 입력하세요.>> ");
			d[i].num1 = scan.nextInt();
			System.out.println("2번째 숫자를 입력하세요.>> ");
			d[i].num2 = scan.nextInt();

			System.out.println();

			d[i].data1 = d[i].num1 + d[i].num2;
			System.out.println(d[i].data1);
			d[i].data2 = d[i].num1 - d[i].num2;
			System.out.println(d[i].data2);
			d[i].data3 = d[i].num1 * d[i].num2;
			System.out.println(d[i].data3);
			d[i].data4 = d[i].num1 / d[i].num2;
			System.out.println(d[i].data4);

		}

	}

}
