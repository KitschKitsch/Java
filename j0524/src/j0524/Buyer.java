package j0524;

public class Buyer {

	int money = 1000;
	int bonusPoint = 0;

	Product[] cart = new Product[10];

	int count = 0;

	void buy(Product p) {// 다형성 활용하면 메소드 한개로 축약 가능@!@!
		money = money - p.price;
		bonusPoint = bonusPoint + p.bonusPoint;
		cart[count] = p;
		count++;
	}

//	void buy(Computer c) {
//		money -= c.price;// -200
//		bonusPoint += c.bonusPoint;
//	}
//	
//	void buy(Audio a) {
//		money -= a.price;// -50
//		bonusPoint += a.bonusPoint;
//	}

}
