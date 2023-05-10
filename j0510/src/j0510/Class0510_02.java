package j0510;

import java.util.Scanner;

public class Class0510_02 {

	public static void main(String[] args) {
		/*
		// if문만 존재
		int num = 0;
		if (num == 0) {
			System.out.println("0입니다.");
		}
		
		// if, else문
		int num = 8;
		// 삼항식 - (num>1)? "":"";
		if (num==8) {
			System.out.println("8입니다.");
		} else {
			System.out.println("8이 아닙니다.");
		}
		
		// if, else if, else문		
		int num = 0;
		if (num > 0) {
			System.out.println("양수입니다.");
		} else if (num == 0) {
			System.out.println("0입니다.");
		} else {
			System.out.println("음수입니다.");
		}
		
				
		// 입력한 숫자가 2의 배수이면 "2의 배수입니다."/"2의 배수가 아닙니다." 출력
		// 1.변수선언
		int input = 0;
		// 2.입력
		Scanner scan = new Scanner(System.in);
		System.out.println("숫자를 입력하세요.");
		input = scan.nextInt();
		// 3.조건문-출력
		if (input%2==0) 
			System.out.println("2의 배수입니다.");
		else 
			System.out.println("2의 배수가 아닙니다.");
		*/
		
		
		// 점수를 입력받아 60점 이상이면 합격, 60점 미만이면 불합격을 출력하시오.
		double input = 0.0;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("점수를 입력하세요.");
		input = scan.nextDouble();
		
		if (input==100) 
			System.out.println("축하합니다! 100점입니다.");
		else if (input >= 60)
			System.out.println("합격입니다.");
		else
			System.out.println("불합격입니다.");		
	}

}
