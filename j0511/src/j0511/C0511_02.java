package j0511;

import java.util.Scanner;

public class C0511_02 {

	public static void main(String[] args) {
		// 최소 한 번은 실행하는 do-while 반복문
		int i = 10;

		do {
			System.out.println("i의 값: " +i);
		} while(i<0);
		
		
		// for 무한반복문을 종료하는 조건
		Scanner scan = new Scanner(System.in);
		for (;;) { // 조건식이 없으면 무한반복
		System.out.println("숫자를 입력하세요.(종료: 0)");
		int num = scan.nextInt();
		if (num == 0) {
			break;
		}
	}
		
		// while 무한반복문을 종료하는 조건
		while(true) { // 조건식이 참이면 무한반복
		System.out.println("숫자를 입력하세요.(종료: 0)");
		int num = scan.nextInt();
		if (num == 0) { // 종료조건
			break;
		}
	}
		
		
		// while 무한반복문을 사용한 사칙연산 프로그램
		int input = 0, num1 = 0, num2 = 0;
		while(true) {
			System.out.println("[ 사칙연산 프로그램 ]");
			System.out.println("1:더하기\t 2:빼기");
			System.out.println("3:곱하기\t 4:나누기");
			System.out.println("0:종료");
			System.out.println("원하는 번호를 입력하세요.>> ");
			input = scan.nextInt();
			
			if (input == 0) break; // 한줄은 중괄호 생략, 1줄로 표현 가능
			
			// 숫자를 입력(반복되는 문구는 반복문에 넣자~)
			System.out.println("첫번째 숫자를 입력하세요.>> ");
			num1 = scan.nextInt();
			System.out.println("두번째 숫자를 입력하세요.>> ");
			num2 = scan.nextInt();
			
			// 조건문
			switch (input) {
			case 1:
				System.out.println(">> 더하기 결과값: " +(num1+num2) +"\n");
				break; // switch를 빠져나오는 break	
			case 2:
				System.out.println(">> 빼기 결과값: " +(num1-num2) +"\n");
				break;
			case 3:
				System.out.println(">> 곱하기 결과값: " +(num1*num2) +"\n");
				break;
			case 4:
				System.out.println(">> 나누기 결과값: " +(num1/num2) +"\n");
				break;
			} // switch문 종료
		} // while문 종료	
	}

}
