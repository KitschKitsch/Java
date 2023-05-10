package j0510;

import java.util.Scanner;

public class Class0510_08 {

	public static void main(String[] args) {
		/*
		// 반복문 - for, while
		int sum = 0;
		int i = 1;
		for (i=1; i<=100; i++) { // i가 101일때 for문 탈출
			sum = sum+i; //sum += i
		}
		System.out.println(i-1+":"+sum);
				
		// 숫자를 3번 반복해서 입력받아, 합을 출력하시오.
		// 1.변수선언(num,sum)  2.scan입력  3.반복문(i 초기값,조건식,증감식)  4.변수 넣고  5.sum에 더하고  6.출력
		int num = 0, sum = 0;
				
		Scanner scan = new Scanner(System.in);
		
		for (int i=0; i<3; i++) {
			System.out.println((i+1) +"번째 숫자를 입력하세요.");
			num = scan.nextInt();
			sum = sum + num;
		}
		System.out.println("합계: " +sum);
		
		// 구구단
		for (int i=1; i<=9; i++) {
			System.out.printf("[ %d 단 ]\n", i);
			for (int j=1; j<=9; j++) {
				System.out.printf("%d * %d = %d \n", i,j,(i*j));
			}
			System.out.println();
		}
		
		// 0~9까지 출력하시오.
		for (int i=0; i<10; i++) {
			System.out.println(i);
		}
				
		// 00 ~ 99까지 출력하시오.(중첩,이중 for문)
		for (int i=0; i<10; i++) {
			for (int j=0; j<10; j++) {
				System.out.printf("%d%d \n", i,j);
			}
			System.out.println();
		}
		
		for (int i=10; i>0; i-=2) {
			System.out.println(i);
		}
				
		for (int i=0;i<10;i++) {
			System.out.println(i);
		}
		
		// while문
		int i=0; // 초기화
		while(i<10) { //조건식
			System.out.println(i);
			i++; // 증감식
		}
		*/
		
		// 랜덤숫자 1~10까지의 랜덤숫자 1개를 출력하시오.
		int random = 0;
		random = (int)(Math.random()*100)+1;
		//System.out.println(random);
		
		// 숫자 맞추기 프로그램 10번
		Scanner scan = new Scanner(System.in);
		int i=1;
		while (i<=100) {
			System.out.println(i +"번째 숫자를 입력하세요.(1~100)");
			int input = scan.nextInt();
			if(input == random) {
				System.out.println("[당첨] 입니다.");
				break;
			} else if (input > random) {
				System.out.printf("[낙첨] %d보다 작습니다. \n" ,input);
			} else {
				System.out.printf("[낙첨] %d보다 큽니다. \n" ,input);
			}
			i++;
		}
		
	}

}


//	*  *  *  
//	 *   *  *
//   * (*)   *  *
//   <> | <>
//   <\>|</>   
