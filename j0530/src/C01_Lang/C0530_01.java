package C01_Lang;

import java.util.Scanner;

public class C0530_01 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("복권을 입력하세요.(예:1조1234567)>> ");
		// 1조 & 1234567
		String input = scan.next();

		String output1 = input.substring(0, 1 + 1);// 0부터 1까지
		String output2 = input.substring(2);// 2부터 끝까지
		int output3 = Integer.parseInt(output2);

		int random = (int) (Math.random() * 10000000) + 1000000; // 0 ~ 9,999,999
		System.out.println(random);

		System.out.println("조: " + output1);
		System.out.print("문자타입: " + output2 + "\t");
		System.out.println("정수타입: " + output3);

		for (int i = 1000000; i < 9999999; i++) {
			if (output3 == i) {
				System.out.println("입력숫자: " + i);
			}
		}

		for (int i = 1000000; i < 9999999; i++) {
			if (random == i) {
				System.out.println("랜덤숫자: " + i);
			}
		}

		/*
		 * // String 클래스 = 문자+메소드의 집합 String str = new String("abc"); char ch = 'a';
		 * char ch2 = 'b'; char ch3 = 'c';
		 * 
		 * String str2 = "abc";
		 * 
		 * // charAt() System.out.println(str2.charAt(0));
		 * 
		 * // contains(), equals(), indexOf(), length(), replace(), split() 등
		 * 
		 * // substring() String str3 = "abcdefg"; System.out.println(str3.substring(3,
		 * 5));// 3부터 (4+1)까지
		 * 
		 * String str5 = "안녕하세요.반갑습니다."; System.out.println(str5.subSequence(2, 5));//
		 * 2부터 (4+1)까지
		 */

	}

}
