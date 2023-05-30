package C01_Lang;

import java.util.Scanner;

public class C0530_03 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		// 소문자->대문자로 출력 A = 65, Z = 96, a = 97, z = 128, 0 = 48
//		System.out.println("영문소문자 입력>> ");
//		char input = scan.next().charAt(0);
//		System.out.println("입력한 문자: " + input);
//		System.out.println("대문자 변환: " + (char) (input - 32));

		// 소문자->대문자로, 대문자->소문자로 출력
//		System.out.print("영문자 입력>> ");
//		char input = scan.next().charAt(0);
//
//		if ('A' <= input && 'Z' >= input) {// A~Z까지
//			System.out.printf("입력한 문자 %s는(은) 대문자 입니다. \n", input);
//			System.out.println("소문자로 변환: " + (char) (input + 32));
//
//		} else if ('a' <= input && 'z' >= input) {// a~z까지
//			System.out.printf("입력한 문자 %s는(은) 소문자 입니다. \n", input);
//			System.out.println("대문자로 변환: " + (char) (input - 32));
//		}

		// 소문자->대문자로, 대문자->소문자로 출력 : toUpperCase(), toLowerCase()
		System.out.print("영문자열 입력>> ");
		String input = scan.next();// 입력받은 문자열
		String output = "";// 출력할 문자열
		char temp = ' ';// 한 문자씩 비교 위한 변수

		for (int i = 0; i < input.length(); i++) {
			temp = input.charAt(i);// 한 문자씩 비교
			if ('A' <= temp && 'Z' >= temp) {// A~Z까지
				output = output + (char) (temp + 32);

			} else if ('a' <= temp && 'z' >= temp) {// a~z까지
				output = output + (char) (temp - 32);
			}
		} // for
		System.out.println(output);

	}

}
