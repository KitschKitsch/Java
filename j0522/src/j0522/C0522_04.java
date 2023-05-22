package j0522;

import java.util.Scanner;

public class C0522_04 {

	public static void main(String[] args) {
		// 두 수를 입력받아 사칙연산 - 매개변수생성자 활용

		Scanner scan = new Scanner(System.in);

		// 배열선언
		Data[] d = new Data[2];
		int num1 = 0, num2 = 0;

		for (int i = 0; i < 2; i++) {

			System.out.println("1번째 숫자를 입력하세요.>> ");
			num1 = scan.nextInt();
			System.out.println("2번째 숫자를 입력하세요.>> ");
			num2 = scan.nextInt();

			// 객체선언
			d[i] = new Data(num1, num2);

			System.out.println(d[i].data1);
			System.out.println(d[i].data2);
			System.out.println(d[i].data3);
			System.out.println(d[i].data4);

		}
	}

}
