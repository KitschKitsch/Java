package j0510;

import java.util.Scanner;

public class Class0510_06 {

	public static void main(String[] args) {
		// 1.변수선언 num1, num2, op  2.scan입력  3.switch비교  4.출력
		int num1 = 0;
		int num2 = 0;
		int result = 0;
		char op = ' ';
		
		Scanner scan = new Scanner(System.in);
		System.out.println("첫번째 숫자(정수)를 입력해주세요.");
		num1 = scan.nextInt();
		System.out.println("연산자를 입력해주세요.(+,-,*,/)");
		op = scan.next().charAt(0);
		System.out.println("두번째 숫자(정수)를 입력해주세요.");
		num2 = scan.nextInt();
		
		// 결과값 바로 출력
		switch (op) {
			case '+':
				System.out.printf("%d+%d= %d\n", num1,num2,num1+num2);
				break;
			case '-':
				System.out.printf("%d-%d= %d\n", num1,num2,num1-num2);
				break;
			case '*':
				System.out.printf("%d*%d= %d\n", num1,num2,num1*num2);
				break;
			case '/':
				System.out.printf("%d/%d= %d\n", num1,num2,num1/num2);
				break;
			default:
				System.out.println("입력 조건에 맞지 않습니다.");
		}
		
		// result 변수에 값을 담아서 출력
		switch (op) {
			case '+':
				System.out.println(result = num1 + num2);
				break;
			case '-':
				System.out.println(result = num1 - num2);
				break;
			case '*':
				System.out.println(result = num1 * num2);
				break;
			case '/':
				System.out.println(result = num1 / num2);
				break;
		}
	}
	
}