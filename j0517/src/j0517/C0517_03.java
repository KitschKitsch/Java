package j0517;

import java.util.Scanner;

public class C0517_03 {

	public static void main(String[] args) {
		// 3개의 숫자를 입력받아 합계를 구하시오.
		// 인스턴스 메소드 add 사용

		Scanner scan = new Scanner(System.in);

		int[] num = new int[3];

		// 먼저 객체선언하고 메소드 호출!
		C0517_03 c = new C0517_03();

		for (int i = 0; i < 3; i++) {
			System.out.println((i + 1) + "번째 숫자를 입력하세요.>> ");
			num[i] = scan.nextInt();
		}

		// 메소드호출방법: 참소변수명.메소드명(매개변수);
		int result = c.add(num[0], num[1], num[2]);
		System.out.println("합계: " + result);

	}

	// 인스턴스 메소드 add
	int add(int num1, int num2, int num3) {
		int result = num1 + num2 + num3;
		return result;
	}

}