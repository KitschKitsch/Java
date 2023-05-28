package C04_Lang;

import java.util.Scanner;

public class C0526_12 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		String lotto1 = "1";
		// 0~9조 00000~99999 랜덤숫자 맞추기

		int random = (int) (Math.random() * 10);// 0~9까지 난수발생

		while (true) {
			System.out.println("조를 입력하세요.(예: 1조)>> ");
			String strNum = scan.next();
			int myNum = Integer.parseInt(strNum.substring(0, 0 + 1));// 0번자리만 문자열 추출 후 int로 형변환해서 저장

			if (random == myNum) {
				System.out.println("🎊당첨!");
				break;
			} else {
				System.out.println("💣꽝!");
			}
		}

	}

}
