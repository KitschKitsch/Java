package j0510;

import java.util.Scanner;

public class Class0510_09 {

	public static void main(String[] args) {
		// 10개의 숫자를 입력받아 합계를 출력하시오.
		Scanner scan = new Scanner(System.in);

		int input = 0, sum = 0;
				
		// while문
		int i = 0; // 초기화
		while (i<10) { // 조건식 0~9까지 10번 반복
			System.out.println(i+1 +"번째 숫자를 입력하세요.");
			input = scan.nextInt();
			sum = sum + input;
			i++; // 증감식 1씩 증가
		}
		System.out.println("결과값: " +sum);
		
		// for문
		int input2 = 0, sum2 = 0;
		for(i=0; i<10; i++) {
			System.out.println(i+1 +"번째 숫자를 입력하세요.");
			input2 = scan.nextInt();
			sum2 = sum2 + input2;
		}
		System.out.println("결과값: " +sum2);
	}

}