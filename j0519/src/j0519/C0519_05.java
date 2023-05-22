package j0519;

import java.util.Scanner;

public class C0519_05 {

	public static void main(String[] args) {

		int[] arr = new int[6];
		String[] title = { "번호", "국어", "영어", "수학", "합계", "평균" };

		// 합계, 평균을 계산해서 출력하시오.
		input(arr, title);// 메소드호출
		System.out.printf("합계: %d \n", arr[4]);
		System.out.printf("평균: %d \n", arr[5]);

	}// main

	// 입력을 받는 input 클래스메소드
	static void input(int[] arr, String[] title) {
		Scanner scan = new Scanner(System.in);
		for (int i = 0; i < 4; i++) {
			System.out.println(title[i] + "를(을) 입력하세요.>> ");
			arr[i] = scan.nextInt();
		}
		arr[4] = arr[1] + arr[2] + arr[3];// 합계
		arr[5] = arr[4] / 3;// 평균
	}

}
