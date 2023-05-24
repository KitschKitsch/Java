package shop;

public class Tv extends Product {

	int inch = 70;
	String color = "black";

	Tv() {
		productName = "QLED TV";
		price = 150;
		bonusPoint = 10;
		sale = 10;
	}

	@Override
	public String toString() {
		return "구매품목: " + productName;
	}

}
