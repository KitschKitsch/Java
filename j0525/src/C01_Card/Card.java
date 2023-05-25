package C01_Card;

public class Card {

	// 클래스변수
	static String[] kinds = { "♠", "♥", "♦", "♣" };
	static String[] numbers = { "0", "A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K" };

	// 인스턴스변수
	String kind;
	int number;

	Card() {// 기본생성자
		this(kinds[0], 1);// ♠1
	}

	Card(String kind, int number) {// 매개변수 생성자
		this.kind = kind;
		this.number = number;
	}
}
