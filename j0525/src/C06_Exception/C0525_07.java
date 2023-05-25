package C06_Exception;

import java.util.Scanner;

public class C0525_07 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		while (true) {
			System.out.println("숫자 입력>> ");
			int num1 = scan.nextInt();
			System.out.println("숫자 입력>> ");
			int num2 = scan.nextInt();

			try {
				System.out.println("나누기: " + (num1 / num2));

			} catch (Exception e) {
				System.out.println(">> 프로그램 오류 발생!");
				e.printStackTrace();// 예외 프린트
			}
		} // while

	}

}
