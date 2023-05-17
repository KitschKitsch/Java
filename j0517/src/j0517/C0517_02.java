package j0517;

import java.util.Scanner;

public class C0517_02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		// 두 수를 입력받아 더하기 결과값을 출력하시오.
		// 객체선언: 클래스명 참조변수명 = new 클래스명();
		C0517_02 c = new C0517_02();

		int[] num = new int[2];
		for (int i = 0; i < 2; i++) {
			System.out.println(i + 1 + "번째 수를 입력하세요.>> ");
			num[i] = scan.nextInt();
		}

		// 인스턴스 메소드사용: 객체선언하고! 참조변수명.메소드명(매개변수)
		// 더하기 메소드 호출
		int result1 = c.add(num[0], num[1]);
		System.out.println("두 수의 더하기: " + result1);

		// 빼기 메소드 호출
		int result2 = c.sub(num[0], num[1]);
		System.out.println("두 수의 빼기:" + result2);

		// 곱하기 메소드 호출
		int result3 = c.multi(num[0], num[1]);
		System.out.println("두 수의 곱하기: " + result3);

		// 나누기 메소드 호출
		int result4 = c.div(num[0], num[1]);
		System.out.println("두 수의 나누기: " + result4);

	}

	// 더하기 메소드(인스턴스 메소드, static X)
	int add(int num1, int num2) {// 지역변수들끼리 이름 통일하는걸 추천!!(a->num1, b->num2)
		int result1 = num1 + num2;
		return result1;
	}

	// 빼기 메소드
	int sub(int num1, int num2) {
		int result2 = num1 - num2;
		return result2;
	}

	// 곱하기 메소드
	int multi(int num1, int num2) {
		int result3 = num1 * num2;
		return result3;
	}

	// 나누기 메소드
	int div(int num1, int num2) {
		int result4 = num1 / num2;
		return result4;
	}
}
