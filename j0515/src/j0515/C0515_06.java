package j0515;

import java.util.Scanner;

public class C0515_06 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		// 2차원배열(5*5)에 랜덤번호넣고(1~25) 좌표값 입력받아 'X'표시하기

		// 1)변수&배열선언
		int random = 0;
		int temp = 0;
		String input = "";// ***좌표값 한글자씩 떼어내야해서 String타입!!!
		int[] num = new int[25];
		for (int i = 0; i < num.length; i++) {
			num[i] = i + 1;
		}
		String[][] box = new String[5][5];

		// 2)1차원배열섞기
		for (int i = 0; i < 100; i++) {
			random = (int) (Math.random() * num.length);
			temp = num[0];
			num[0] = num[random];
			num[random] = temp;
		}

		// 3)1차원배열번호->2차원배열에넣기
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				box[i][j] = "" + num[i * 5 + j];// ***box는 String이니까! ""을 더해서 String타입으로 변환~
			}
		}

		while (true) {
			// 4)출력
			System.out.print("   |\t");
			for (int i = 0; i < 5; i++) {
				System.out.print(i + "\t");
			}
			System.out.println();
			System.out.println("------------------------------------------");
			for (int i = 0; i < 5; i++) {
				System.out.print(i + "  |\t");
				for (int j = 0; j < 5; j++) {
					System.out.print(box[i][j] + "\t");
				}
				System.out.println();
			}
			// 5)좌표입력
			System.out.println("좌표를 입력하세요.>> ");
			input = scan.next();

			// 6)X로변환
			int no1 = input.charAt(0) - '0';// ***char타입을 int로 바꾸려면 '0'(문자0) 빼기~
			int no2 = input.charAt(1) - '0';
			box[no1][no2] = "X";
		} // while
	}

}
