package j0511;

import java.util.Scanner;

public class Class0511_05 {

	public static void main(String[] args) {
		// 숫자맞추기 프로그램 // 다시해보기!!!
		Scanner scan = new Scanner(System.in);
		int random=0, input=0, num=0, count=0;
		
		while (true) {
		System.out.println("[🎰 숫자맞추기 프로그램 🎮]");
		System.out.println("1:랜덤숫자생성  2:숫자맞추기(3회)  0:종료");
		System.out.println("------------------------------");
		System.out.println("원하는 번호를 입력하세요.>> ");
		input = scan.nextInt();
		if (input==0) {
			System.out.println(">> 프로그램을 종료합니다.");
			break;
		}
		
		switch (input) {
		case 1:
			random= (int)(Math.random()*100)+1; // 1~100까지의 난수
			System.out.println("랜덤숫자: " +random);
			System.out.println(">> ❔❔랜덤숫자가 생성되었습니다.");
		
		case 2:
			while(true) {
			// count
			if (count>=3) {
				System.out.println("3번 도전했습니다.");
				System.out.println("정답: " +random);
				break;
			}
			
			System.out.println(">> 1~100까지의 숫자를 입력하세요.");
			num = scan.nextInt();
			if (random==num) {
				System.out.printf(">> (%d/3)번째 정답입니다🎉 \n", count+1);
			} else {
				System.out.printf(">> (%d/3)번째 오답입니다💣 \n", count+1);
			}
			count++;
			} // while문
		} // switch문
	} // while문
	}
}
