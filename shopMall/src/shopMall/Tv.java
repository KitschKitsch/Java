package shopMall;

public class Tv extends Product {// Product를 상속받는 Tv클래스
	// Product 상속
	// int price;
	// int bonusPoint;
	// int sale;

	int inch = 70;
	String color = "balck";

	Tv() {// 기본생성자
		productName = "QLED TV";
		price = 150;
		bonusPoint = 10;
		sale = 10;
	}

	// toString으로 받는법
	@Override
	public String toString() {
		return "구매목록: " + productName;
	}

}
