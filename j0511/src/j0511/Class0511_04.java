package j0511;

import java.util.Scanner;

public class Class0511_04 {

	public static void main(String[] args) {
		// continue문: 조건에 맞을 때 스킵하고 실행
		for (int i=0; i<=10; i++) {
			if (i%2!=0) {
				continue; // 홀수일때 스킵하고 실행
			}
			System.out.println(i);
		}
		
		
		// 구구단 짝수단의 홀수곱셈만 출력하시오.
		for (int i=1; i<10; i++) {
			if (i%2==1) continue; // 2로 나눈 나머지가 1이면(홀수) 스킵 
			System.out.printf("[ %d 단 ] \t", i);
		} System.out.println();
		
		for (int i=1; i<10; i++) {
			for (int j=1; j<10; j++) {
				if (j%2!=0) continue; // 2로 나눈 나머지가 0이 아니면(홀수) 스킵
				if (i%2==0) continue; // 2로 나눈 나머지가 0이면(짝수) 스킵
				System.out.printf("%d * %d = %d \t", j,i,(j*i));
			}
			System.out.println();
		}
		
		
		// 첫번째 구구단의 5이하 곱셈만 출력하시오.
	loop: for (int i=1; i<10; i++) {
			for (int j=1; j<10; j++) {
				if (j==6) break loop; // break에 이름 지정해서 한번에 빠져나가기!  
				System.out.printf("%d * %d = %d\n", i,j,(i*j));
			}
			System.out.println();
		}
		System.out.println();
	
	
		// 
		Scanner scan = new Scanner(System.in);
		int input = 0, num1=0, num2=0, sum=0;
		
		loop: while (true) { // 무한반복
			System.out.println("1:더하기\t2:곱하기\t0:종료");
			System.out.println("--------------------");
			System.out.println("원하는 번호를 입력하세요.>> ");
			input = scan.nextInt();
			if (input ==0) {
				System.out.println(">> 프로그램을 종료합니다.");
				break;
			}
			switch (input) {
			case 1:
				while (true) {
					System.out.println("첫번째 숫자(0: 이전, 1:종료)>> ");
					num1 = scan.nextInt();
					if (num1==0) break; // 이전페이지로
					if (num1==1) break loop; // while문(무한루프) 종료
					System.out.println("두번째 숫자>> ");
					num2 = scan.nextInt();
					System.out.printf(">> %d + %d = %d \n", num1,num2,num1+num2);
				}
			} // switch문
			System.out.println();
		}
	}

}
