package shopMall;

import java.util.ArrayList;// 임포트: Ctrl + Shift + M

public class Buyer {

	String id;
	String pw;
	String name;
	String nickName;

	int money = 10000;// 잔액변수
	int bonusPoint = 0;// 포인트변수
	// Product[] cart = new Product[10];// 구매목록저장배열
	// 컬렉션 ArrayList
	ArrayList<Product> list = new ArrayList();// <Product>와 연관된것만 들어감!!! '제너릭'활용
	// list.add(p)-객체추가 .get(0)-읽어오기 .size-총개수

	Buyer() {// 기본생성자
	}

	Buyer(String id, String name, String nickName) {// 매개변수 생성자
		this.id = id;
		this.name = name;
		this.nickName = nickName;
	}

	// 다형성:부모참조변수 Product p로 자식객체들 받기!!
	void buy(Product p) {
		if (money < p.price) {
			System.out.println("금액부족!");
			return;
		}
		money -= p.price;
		bonusPoint += p.bonusPoint;
		System.out.println("구매품목: " + p.productName);
		list.add(p);// Object로 자동형변환..! 다시 형변환해서 넣어줘야함..!
	}

	// 구매목록 메소드
	void buyList() {
		System.out.print("구매목록: ");
		for (int i = 0; i < list.size(); i++) {
			// Product p = (Product) list.get(i);// Object 담겨있음..! 형변환해서 넣어주기..!(제너릭 사용하면
			// 형변환 X)
			if (i == 0)
				System.out.print(list.get(i).productName);
			else
				System.out.print(", " + list.get(i).productName);
		}
	}
}
