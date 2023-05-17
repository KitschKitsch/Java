package j0515;

import java.util.Scanner;

public class C0515_01 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		// 로또 맞추기 프로그램

		// 1)변수&배열선언
		int random = 0;
		int temp = 0;
		int count = 0;
		int[] myNum = new int[6];
		int[] lottoNum = new int[6];

		// 2)로또번호만들기
		int[] arr = new int[45];
		for (int i = 0; i < 45; i++) {
			arr[i] = i + 1;
		}

		// 3)로또번호섞기
		for (int i = 0; i < 1000; i++) {
			random = (int) (Math.random() * 45);
			temp = arr[0];
			arr[0] = arr[random];
			arr[random] = temp;
		}

		// 4)내번호입력
		for (int i = 0; i < myNum.length; i++) {
			System.out.println(i + 1 + "번째 번호를 입력하세요.>> ");
			myNum[i] = scan.nextInt();
		}

		// 5)맞춘개수비교
		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < 6; j++) {
				if (arr[i] == myNum[j]) {
					lottoNum[count] = arr[i];
					count++;
					continue;
				}
			}
		}

		// 6)로또번호출력
		System.out.print("로또번호: ");
		for (int i = 0; i < 6; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();

		// 7)입력번호출력
		System.out.print("입력번호: ");
		for (int i = 0; i < 6; i++) {
			System.out.print(myNum[i] + " ");
		}
		System.out.println();

		// 8)당첨번호출력
		System.out.print("당첨번호: ");
		for (int i = 0; i < count; i++) {
			System.out.print(lottoNum[i] + " ");
		}
		System.out.println();

		// 9)맞춘개수출력
		System.out.println("맞춘개수: " + count);
	}// main

}// class
