package j0510;

import java.util.Scanner;

public class Class0510_09 {

	public static void main(String[] args) {
		// 10개의 숫자를 입력받아 합계를 출력하시오.
		int input = 0, sum = 0;
		
		Scanner scan = new Scanner(System.in);
		int i = 0;
		while (i<10) {
			System.out.println(i+1 +"번째 숫자를 입력하세요.");
			input = scan.nextInt();
			sum = sum + input;
			i++;
		}
		System.out.println("결과값: " +sum);
		
//		for(i=0; i<10; i++) {
//			System.out.println(i+1 +"번째 숫자를 입력하세요.");
//			input = scan.nextInt();
//			sum = sum + input;
//		}
//		System.out.println("결과값: " +sum);
	}

}
