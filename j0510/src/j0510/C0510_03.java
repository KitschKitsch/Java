package j0510;

import java.util.Scanner;

public class C0510_03 {

	public static void main(String[] args) {
		// 점수를 입력받아 60점 이상이면 합격, 60점 미만이면 불합격을 출력하시오.
		// 1.변수선언
		double input = 0.0;
		
		// 2.scan 입력
		Scanner scan = new Scanner(System.in);
		System.out.println("점수를 입력하세요.");
		input = scan.nextDouble();
		
		// 3.조건문 비교-출력
		if (input>=60) {
			System.out.printf("축하합니다! %.1f점 합격입니다.\n", input);
		} else {
			System.out.printf("%.1f점 불합격입니다.\n", input);
		}
		
		
		// 입력한 숫자 중 1, 6, 9만 입력받아 출력하시오.
		int input2 = 0;
		
		System.out.println("숫자를 입력하세요.(1,6,9 중 하나만 입력)");
		input2 = scan.nextInt();
		
		if (input2 == 1) {
			System.out.println("1입니다.");
		} else if (input2 == 6) {
			System.out.println("6입니다.");
		} else if (input2 == 9) {
			System.out.println("9입니다.");	
		} else {
			System.out.println("조건에 맞지 않는 숫자입니다.");
		}
		// OR조건과 printf 사용
		if (input2 == 1||input2 == 6||input2 == 9) {
			System.out.printf("%d입니다.\n", input2);
		} else {
			System.out.println("조건에 맞지 않는 숫자입니다.");
		}
		
		
		// m,f문자를 입력받아 "남자/여자입니다"를 출력하시오.
		String input3 = ""; // String은 객체! 기본형타입만 '==' 비교 가능 
		
		System.out.println("문자를 입력하세요.(m/f)");
		input3 = scan.next();
		
		if (input3.equals("m") || input3.equals("M")) { // String 객체라서 .equals() 사용!!!
			System.out.println("남자입니다.");
		} else if (input3.equals("f") || input3.equals("F")) {
			System.out.println("여자입니다.");
		} else {
			System.out.println("입력 조건에 맞지 않습니다.");
		}
	}

}