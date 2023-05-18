package j0518;

import java.util.Scanner;

public class C0518_07 {

	public static void main(String[] args) {
		// 1~100까지의 랜덤숫자를 생성하여 숫자 맞추기 프로그램(기회 10번) + 입력한 숫자 출력까지!
		// 1)랜덤숫자생성
		int random = (int) (Math.random() * 100) + 1;
		System.out.println(random);

		Scanner scan = new Scanner(System.in);

		// 2)변수&배열선언
		int[] input = new int[10];// 입력값배열
		int count = 1;// 도전횟수변수 (1번부터 최대 10번까지)

		// 3)반복문
		for (int i = 0; i < 10; i++) {
			System.out.println("--------------------");
			System.out.println(count + "번째 도전>> ");
			input[i] = scan.nextInt();

			// 4)조건문
			if (input[i] == random) {
				System.out.println(">> 정답입니다~");
				break;
			} else if (input[i] > random) {
				System.out.printf(">> Down👎 %d보다 작아요! \n", input[i]);
			} else {
				System.out.printf(">> Up👍 %d보다 커요! \n", input[i]);
			}
			count++;// 횟수 1회 추가
		} // for

		// 5)입력값출력
		System.out.print(">> 입력한 숫자: ");
		for (int i = 0; i < count; i++) {// 도전횟수까지
			System.out.print(input[i] + " ");

		}
	}// main

}
