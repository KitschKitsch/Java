package j0517;

import java.util.Scanner;

public class C0517_04 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		// 3개의 숫자를 입력받아 가장 큰수를 출력하시오.
		// 객체선언 - 참조변수명.변수명, 참조변수명.메소드명()
		C0517_04 c = new C0517_04();

		// 10,5,25
		int max = 0;
		int num1 = 0, num2 = 0, num3 = 0;
		while (true) {
			System.out.println("1번째 수를 입력하세요.");
			num1 = scan.nextInt();
			System.out.println("2번째 수를 입력하세요.");
			num2 = scan.nextInt();
			System.out.println("3번째 수를 입력하세요.");
			num3 = scan.nextInt();
			// 다른메소드 호출방법
			// 참조변수명.메소드명 - 매개변수는 같아야 함.
			int result = c.max(1, num1, num2, num3);// 최대값
			int result2 = c.max(2, num1, num2, num3);// 최소값

			System.out.println("3개의 수의 최대값 : " + result);
			System.out.println("3개의 수의 최소값 : " + result2);
		}
	}

	// 메소드 리턴타입과 return 변수는 타입이 같아야 함.
	int max(int check, int a, int b, int c) {
		int result = 0;
		if (check == 1) {// check가 1이면 최대값 구하기
			result = Math.max(Math.max(a, b), c);
		} else {// check가 1이 아니면 최소값 구하기
			result = Math.min(Math.min(a, b), c);
		}
		return result;
	}

}