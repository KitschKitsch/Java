package j0522;

import java.util.Scanner;

public class C0522_01 {

	public static void main(String[] args) {
		// 두 수를 입력받아 사칙연산 - 기본변수 활용
		Scanner scan = new Scanner(System.in);

		System.out.println("1번째 숫자를 입력하세요.>> ");
		int num1 = scan.nextInt();
		System.out.println("2번째 숫자를 입력하세요.>> ");
		int num2 = scan.nextInt();

		System.out.println();

		int data1 = num1 + num2;
		System.out.println(data1);
		int data2 = num1 - num2;
		System.out.println(data2);
		int data3 = num1 * num2;
		System.out.println(data3);
		int data4 = num1 / num2;
		System.out.println(data4);

		System.out.println("---------------------");

		System.out.println("3번째 숫자를 입력하세요.>> ");
		int num3 = scan.nextInt();
		System.out.println("4번째 숫자를 입력하세요.>> ");
		int num4 = scan.nextInt();

		System.out.println();

		int data5 = num3 + num4;
		System.out.println(data5);
		int data6 = num3 - num4;
		System.out.println(data6);
		int data7 = num3 * num4;
		System.out.println(data7);
		int data8 = num3 / num4;
		System.out.println(data8);

	}

}
