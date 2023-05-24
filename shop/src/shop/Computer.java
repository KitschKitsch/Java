package shop;

public class Computer extends Product {

	String cpu = "i7-10700";
	int hdd = 5000;

	Computer() {
		productName = "Galaxy_book";
		price = 200;
		bonusPoint = 20;
		sale = 10;
	}

	@Override
	public String toString() {
		return "구매품목: " + productName;
	}

}
