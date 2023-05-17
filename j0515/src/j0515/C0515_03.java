package j0515;

import java.util.Scanner;

public class C0515_03 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		// 10개 상자 중 2개의 보물상자 찾기

		// 1)변수&배열선언
		int random = 0;
		int temp = 0;
		int input = 0;
		int[] box = { 0, 0, 0, 0, 0, 0, 0, 0, 1, 2 };
		String[] arr = { "?", "?", "?", "?", "?", "?", "?", "?", "?", "?" };

		// 2)보물섞기
		for (int i = 0; i < 100; i++) {
			random = (int) (Math.random() * 10);
			temp = box[0];
			box[0] = box[random];
			box[random] = temp;
		}

		while (true) {
			// 3)화면출력
			System.out.println("[ 보물찾기 프로그램 ]");
			for (int i = 0; i < 10; i++) {
				System.out.print(i + " ");
			}
			System.out.println();
			System.out.println("-------------------");
			for (int i = 0; i < 10; i++) {
				System.out.print(arr[i] + " ");
			}
			System.out.println();

			// 4)번호입력
			System.out.println("번호를 입력하세요.>> ");
			input = scan.nextInt();
			if (box[input] == 1) {
				arr[input] = "1억";
			} else if (box[input] == 2) {
				arr[input] = "10억";
			} else {
				arr[input] = "꽝";
			}
		} // while
	}// main

}// class
