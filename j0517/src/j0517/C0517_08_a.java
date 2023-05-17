package j0517;

import java.util.Arrays;
import java.util.Scanner;

public class C0517_08_a {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		// 3개의 숫자를 입력받아 작은수부터 순차적으로 출력하시오.
		// calculate() 메소드 활용

		int[] arr = new int[3];

		for (int i = 0; i < 3; i++) {
			System.out.println("숫자를 입력하세요.");
			arr[i] = scan.nextInt();
		}

//		// 배열정렬
//		Arrays.sort(arr);
		calculate(arr);

		for (int i = 0; i < 3; i++) {
			System.out.print(arr[i] + " ");
		}
	}// main

	static void calculate(int[] arr) {
		int max = Math.max(Math.max(arr[0], arr[1]), arr[2]);
		int min = Math.min(Math.min(arr[0], arr[1]), arr[2]);
		int middle = (arr[0] + arr[1] + arr[2]) - max - min;

		arr[0] = min;
		arr[1] = middle;
		arr[2] = max;
	}

}
