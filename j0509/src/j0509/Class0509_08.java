package j0509;

import java.util.Scanner;

public class Class0509_08 {

	public static void main(String[] args) {
		/*
		// 1.변수선언 2.입력 3.출력
		int input = 0;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("숫자를 입력하세요.");
		input = scan.nextInt();
		
		String result = (input%2==0)? "짝수입니다.":"홀수입니다.";
		System.out.println(result);
				
		// 이항연산자
		int num = 10;
		double num2 = 10;
		double num3 = num+num2;
		System.out.println(num3);
				
		char ch = 'A';
		int num = ch + 1;
		System.out.println((char)num); // 66 = B
		*/
		
		
		// 대문자 입력시 소문자로 출력하시오.
		// 1.변수선언
		char ch = ' ';
		// 2.입력
		Scanner scan = new Scanner(System.in);
		System.out.println("대문자를 입력하세요.");
		ch = scan.next().charAt(0); // 문자열의 첫번째 문자를 가져옴
		
		char ch2 = (char)(ch + 32); // int결과를 대문자로 치환
		// 3.출력
		System.out.println("입력한 대문자: " +ch);
		System.out.println("변환된 문자: " +ch2);
			
		
		// 소문자 입력시 대문자로 출력하시오.
		char ch3 = ' ';
		
		//Scanner scan = new Scanner(System.in);
		System.out.println("소문자를 입력하세요.");
		ch3 = scan.next().charAt(0); // 문자열의 첫번째 문자를 가져옴
		
		char ch4 = (char)(ch3 - 32); // int결과를 소문자로 치환
		
		System.out.println("입력한 소문자: " +ch3);
		System.out.println("변환된 문자: " +ch4);
		
		
		int a = 1000000;
		int b = 2000000;
		// int c = a*b; // 오버플로우..!
		long c = (long)a * b;
		System.out.println(c);
	}
}