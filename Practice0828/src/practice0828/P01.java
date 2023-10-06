package practice0828;

import java.util.Scanner;

public class P01 {

	public static void main(String[] args) {

		while (true) {
			System.out.println("| 1: 1~100 정수 합 | 2: 입력받은 숫자 합 | 3: 구구단 |");
			System.out.println("| 4: 랜덤숫자 맞추기 | 5: 합이 100보다 커지는 수 | 6: 학점계산(switch문) |");
			Scanner scan = new Scanner(System.in);
			int qNum = scan.nextInt();
			switch (qNum) {
			case 1:
				// Q1. 1부터 100까지의 정수 합
				System.out.println("Q1. 1부터 100까지의 정수 합 ");
				int sum1 = 0;
				int h = 1;
				for (h = 1; h <= 100; h++) {
					sum1 = sum1 + h;
				}
				System.out.println(h - 1 + ":" + sum1);
				System.out.println("------------------------------");
				break;

			case 2:
				// Q2. 입력받은 숫자의 합
				System.out.println("Q2. 입력받은 숫자의 합 ");
				int num = 0, sum2 = 0;

				for (int j = 0; j < 3; j++) {
					System.out.print(j + 1 + "번째 숫자를 입력하세요 -> ");
					sum2 = sum2 + scan.nextInt();
				}
				System.out.println("합계: " + sum2);
				System.out.println("------------------------------");
				break;

			case 3:
				// Q3. 구구단
				System.out.println("Q3. 구구단");
				for (int i = 1; i < 10; i++) {
					System.out.printf("[ %d단 ]\n", i);
					for (int j = 1; j < 10; j++) {
						System.out.printf("%d * %d = %d \n", i, j, i * j);
					}
				}
				System.out.println("------------------------------");
				break;

			case 4:
				// Q4. 랜덤숫자 맞추기
				System.out.println("Q4. 랜덤숫자 맞추기");
				int random = 0;
				random = (int) (Math.random() * 10) + 1; // random은 랜덤실수(0~1) 생성함!
				System.out.println(random);

				int chance = 0;
				while (chance < 10) { // while문 : 10번이하까지 반복함!
					System.out.print(chance + 1 + "번째 기회 ->");
					int input = scan.nextInt();

					if (input == random) {
						System.out.println("[ 당첨 ]");
						break; // switch문, while문은 break문 있어야 제어문 종료~
					} else if (input > random) {
						System.out.println("입력한 수보다 작습니다.");
					} else {
						System.out.println("입력한 수보다 큽니다.");
					}
					chance++;
				} // while
				System.out.println("------------------------------");
				break;

			case 5:
				// Q5. 합이 100보다 커지는 수
				System.out.println("Q5. 합이 100보다 커지는 수");
				int sum = 0, num2 = 0;
				while (sum < 100) { // 100보다 작을 때(=100보다 커지는 순간!) 모두 구하기
					sum = sum + num2;
					System.out.println(num2 + "번째 수까지의 합: " + sum);
					num2++;
				}
				System.out.println(num2 - 1 + "번째 수까지의 합: " + sum); // 마지막 증감식 제외하기 위해 -1로 계산
				System.out.println("------------------------------");
				break;

			case 6:
				// Q6. switch문으로 학점부여(A: 90이상, B: 80이상, C: 70이상, F: 70 이하)
				System.out.println("Q6. switch문으로 학점부여");
				System.out.println("점수를 입력하세요 ->");
				int score = scan.nextInt();
				switch (score / 10) {
				case 9:
					System.out.println("A학점");
					break;
				case 8:
					System.out.println("B학점");
					break;
				case 7:
					System.out.println("C학점");
					break;
				default:
					System.out.println("F학점");
				}
				; // switch
				break;

			}// switch(qNum)
		} // while(true)

	}// main

}
