package shop;

import java.util.ArrayList;

public class Buyer {

	// 변수&어레이리스트 선언
	String id;
	String pw;
	String name;
	String nickName;
	int money = 10000;
	int bonusPoint = 0;
	ArrayList<Product> list = new ArrayList();

	Buyer() {// 기본생성자
	}

	// 매개변수생성자
	Buyer(String id, String name, String nickName) {
		this.id = id;
		this.name = name;
		this.nickName = nickName;
	}

	// 구매 메소드
	void buy(Product p) {
		if (money < p.price) {
			System.out.println("잔액부족!");
			return;
		}
		money -= p.price;
		bonusPoint += p.bonusPoint;
		System.out.println(p);
		list.add(p);
	}

	// 구매목록 메소드
	void buyList() {
		System.out.print("구매목록: ");
		for (int i = 0; i < list.size(); i++) {
			if (i == 0)
				System.out.print(list.get(i).productName);
			else
				System.out.print(", " + list.get(i).productName);
		}
	}

}
