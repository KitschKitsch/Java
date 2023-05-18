package j0518;

import java.util.Scanner;

public class C0518_09 {

	public static void main(String[] args) {
		// 자판기 프로그램
		// 1:밀크커피 300 2:헤이즐넛커피 500 3:블랙커피 350 4:코코아 300 5:밀크 400

		Scanner scan = new Scanner(System.in);
		// 1)변수선언
		int myMoney = 1000;// 내가가진돈
		int choice = 0;// 번호입력변수
		int[] price = { 300, 500, 350, 300, 400 };
		String[] title = { "밀크커피", "헤이즐넛커피", "블랙커피", "코코아", "밀크" };

		loop: while (true) {
			System.out.println("[ 우리동네 자판기☕ ] ");
			System.out.println("1:밀크커피 300  2:헤이즐넛커피 500  3:블랙커피 350");
			System.out.println("4:코코아 300  5:밀크 400  6:잔액충전  0:프로그램종료");
			System.out.println("---------------------------------------------");
			System.out.printf("현재잔액: %,d \n", myMoney);// *** %,d는 천단위로 쉼표표시!!!
			System.out.println("원하는 번호를 입력하세요.>> ");
			choice = scan.nextInt();

			switch (choice) {
			case 1:
				myMoney = order(myMoney, price[choice - 1], title[choice - 1]);
				break;
			case 2:
				myMoney = order(myMoney, price[choice - 1], title[choice - 1]);
				break;
			case 3:
				myMoney = order(myMoney, price[choice - 1], title[choice - 1]);
				break;
			case 4:
				myMoney = order(myMoney, 300, "코코아");
				break;
			case 5:
				myMoney = order(myMoney, 400, "밀크");
				break;
			case 6:
				System.out.println("잔액을 충전합니다. 충전할 금액을 입력해주세요.>> ");
				int temp = scan.nextInt();
				if (temp > 0) {
					System.out.println("결제수단 1: 카드결제 (Y/N)");
					choice = scan.nextInt();
					if (choice == 1) {
						myMoney = myMoney + temp;
						System.out.println("[ 카드 결제가 완료되었습니다. ]");
						System.out.printf("충전금액: %,d \t", temp);
						System.out.printf("현재잔액: %,d \n", myMoney);
					} else {
						System.out.println("[ 시스템 오류. 다시 실행해주세요. ]");
					}
				}
				break;
			case 0:
				System.out.println("[ 프로그램 종료 ]");
				break loop;
			}// switch

		} // while

	}// main

	static int order(int myMoney, int price, String title) {
		if (myMoney >= price) {
			System.out.println(title + "가 주문되었습니다.");
			myMoney = myMoney - price;
		} else {
			System.out.println("잔액이 부족합니다. 잔액을 충전해주세요!");
		}
		return myMoney;
	}

}
