package j0524;

public class Shopping {

	public static void main(String[] args) {

		System.out.println("[ 쇼핑몰 프로그램 ]");
		System.out.println("1:Stv  2:Computer  3:Audio");
		System.out.println("--------------------------");
		System.out.println("원하는 제품 번호 입력>> ");

		// 객체선언
		Buyer b = new Buyer();

		// Stv s = new Stv();
		b.buy(new Stv());// tv 1대
		b.buy(new Stv());// tv 2대

		// Computer c = new Computer();
		b.buy(new Computer());// 컴퓨터 1대

		// Audio a = new Audio();
		b.buy(new Audio());// 오디오 1대
		System.out.println("잔액: " + b.money);
		System.out.println("포인트: " + b.bonusPoint);

	}

}
