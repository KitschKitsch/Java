package C04_Lang;

import java.util.Scanner;

public class C0526_13 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		String lotto1 = "1";
		// 0~9조 00000~99999 랜덤숫자 맞추기

		int random = (int) (Math.random() * 10);// 0~9까지
		int random2 = (int) (Math.random() * 100000);// 0~99999까지
		String strRandom = String.format("%05d", random2);// 00000~99999까지

		while (true) {
			System.out.println("당첨번호: " + random + "조" + strRandom);// 정답
			System.out.println("조와 5자리 숫자를 입력하세요.(예: 1조12587)>> ");
			String strNum = scan.next();

			int myNum = Integer.parseInt(strNum.substring(0, 0 + 1));// 0번자리만 문자열 추출 후 int로 형변환해서 저장
			String myNum2 = strNum.substring(2);// 2번자리부터 끝까지

			System.out.println(myNum + ", " + myNum2);// 비교할숫자

			if (myNum == random) {// 조 비교
				System.out.println("조: 🎊당첨!");
			} else {
				System.out.println("조: 💣꽝!");
			}

			if (myNum2.contains(strRandom)) {// 번호 비교
				System.out.println("번호: 🎊당첨!");
			} else {
				System.out.println("번호: 💣꽝!");
			}

		}

	}

}