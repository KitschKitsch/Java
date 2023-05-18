package j0518;

import java.util.Arrays;
import java.util.Scanner;

public class C0518_08 {

	public static void main(String[] args) {
		// 로또 맞추기
		// 1~45까지 숫자입력
		// 1)변수&배열선언
		int[] lotto = new int[45];// 로또번호배열
		int[] myNum = new int[6];// 내번호배열
		int[] myLotto = new int[6];// 당첨번호배열
		int random = 0;// 랜덤번호변수
		int temp = 0;// 임시저장변수
		int count = 0;// 맞춘개수변수

		// 2)로또번호넣기
		for (int i = 0; i < 45; i++) {
			lotto[i] = i + 1;
		}

		// 3)로또번호섞기
		for (int i = 0; i < 1000; i++) {
			random = (int) (Math.random() * 45);
			temp = lotto[0];
			lotto[0] = lotto[random];
			lotto[random] = temp;
		}

		// 6)로또번호출력
		System.out.println();
		System.out.println("----------");
		System.out.print("로또번호: ");
		for (int i = 0; i < 6; i++) {
			System.out.print(lotto[i] + "\t");
		}
		System.out.println();

		// 4)내번호입력
		Scanner scan = new Scanner(System.in);
		for (int i = 0; i < myNum.length; i++) {
			System.out.println((i + 1) + "번째 로또번호를 입력하세요.>> ");
			myNum[i] = scan.nextInt();
		}

		// 5)번호비교***
		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < myNum.length; j++) {
				if (lotto[i] == myNum[j]) {
					myLotto[count] = lotto[i];
					count++;
					continue;
				}
			}
		}

		// 6)로또번호출력
		System.out.println();
		System.out.println("-----------------------------------------------------");
		System.out.print("로또번호: ");
		for (int i = 0; i < 6; i++) {
			System.out.print(lotto[i] + "\t");
		}

		// 7)내번호출력
		System.out.println();
		System.out.println("-----------------------------------------------------");
		System.out.print("나의번호: ");
		for (int i = 0; i < myNum.length; i++) {
			System.out.print(myNum[i] + "\t");
		}

		// 8)당첨번호출력
		System.out.println();
		System.out.println("-----------------------------------------------------");
		System.out.print("당첨번호: ");
		for (int i = 0; i < count; i++) {
			System.out.print(myLotto[i] + "\t");
		}

		// 9)맞춘개수출력
		System.out.println();
		System.out.println("-----------------------------------------------------");
		System.out.println("맞춘개수: " + count);

	}

}
