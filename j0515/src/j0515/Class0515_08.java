package j0515;

import java.util.Scanner;

public class Class0515_08 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		// 2차원배열(5*5)에 랜덤번호넣고(1~25) 번호 입력받아 'X'표시하기

		// 1)변수&배열선언
		int random = 0;
		int temp = 0;
		int input = 0;
		int[] num = new int[25];
		for (int i = 0; i < num.length; i++) {
			num[i] = i + 1;
		}
		String[][] box = new String[5][5];

		// 2)1차원배열섞기
		for (int i = 0; i < 100; i++) {
			random = (int) (Math.random() * 25);
			temp = num[0];
			num[0] = num[random];
			num[random] = temp;
		}

		// 3)1차원배열번호->2차원배열에넣기
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				box[i][j] = "" + num[i * 5 + j];
			}
		}

		while (true) {
			// 4)출력
			System.out.print("    |\t");
			for (int i = 0; i < 5; i++) {
				System.out.print(i + "\t");
			}
			System.out.println();
			System.out.println("------------------------------------------");
			for (int i = 0; i < 5; i++) {
				System.out.print(i + "   |\t");
				for (int j = 0; j < 5; j++) {
					System.out.print(box[i][j] + "\t");
				}
				System.out.println();
			}

			// 5)번호입력받고X로변환
			System.out.println("1~25 사이의 번호를 입력하세요.>> ");
			input = scan.nextInt();
			loop: for (int i = 0; i < 5; i++) {
				for (int j = 0; j < 5; j++) {
					if (box[i][j].equals("" + input)) {
						box[i][j] = "X";
//						break loop;
					} // if
				}
			} // loop:for
		} // while
	}

}
