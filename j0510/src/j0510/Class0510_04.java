package j0510;

import java.util.Scanner;

public class Class0510_04 {

	public static void main(String[] args) {
		/*
		int input = 0;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("숫자를 입력하세요.");
		input = scan.nextInt();
		
		// switch()문
		if (input == 1) {
			System.out.println("1입니다.");
		} else if (input == 6) {
			System.out.println("6입니다.");
		} else {
			System.out.println("9입니다.");
		}

		switch(input) {
		case 1:
			System.out.println("1입니다.");
			break; // break 없으면 중괄호 끝까지..!
		case 6: 
			System.out.println("6입니다.");
			break;
		case 9:
			System.out.println("9입니다.");
			break;
		default:
			System.out.println("입력 조건에 맞지 않습니다.");
			break;
		}
		*/
		
		//m,f를 입력받아 남자/여자라고 출력하시오.
		char input = ' ';
		
		Scanner scan = new Scanner(System.in);
		System.out.println("문자를 입력하세요.(m/f)");
		input = scan.next().charAt(0);
		
		switch (input) {
		case 'm':
		case 'M':
			System.out.println("남자입니다.");
			break;
		case 'f','F':
			System.out.println("여자입니다.");
			break;
		default:
			System.out.println("입력 조건에 맞지 않습니다.");
			break;
		}		
	}

}
