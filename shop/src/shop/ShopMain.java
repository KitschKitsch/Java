package shop;

public class ShopMain {

	public static void main(String[] args) {

		System.out.println("[ 삼성쇼핑몰 ]");
		System.out.println("1:QLED-TV  2:갤럭시북  3:홈미니  4:그랑데 세탁기");
		System.out.println("--------------------------------------- ");
		System.out.println("구매 품목 입력>> ");
		
		Buyer b = new Buyer("hong", "홍길동", "길동스");
		System.out.printf("id:%s  name:%s  nick:%s", b.id, b.name, b.nickName);
		System.out.println();
		
		b.buy(new Tv());
		b.buy(new Tv());
		b.buy(new Tv());
		b.buy(new Tv());
		b.buy(new Tv());
		b.buy(new Computer());
		b.buy(new Speaker());
		b.buy(new Washer());
		
		System.out.println();
		System.out.println("잔액: " + b.money);
		System.out.println("포인트: " + b.bonusPoint);
		System.out.println("구매개수: " + b.list.size());
		
		b.buyList();

	}

}
