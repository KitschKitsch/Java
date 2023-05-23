package j0523;

public class Card {

	static String[] kinds = { "♠ ", "♥ ", "♦ ", "♣ " };
	static String[] numbers = { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K" };

	String kind;// 무늬 - 4가지 Spade, Heart, Diamond, Clover
	int number;// 숫자 - 13(1~10, 11(J),12(Q),13(K))

	Card() {// 기본생성자
		this("Spade", 1); // 다른생성자 호출
	}

	Card(String kind) {
		this.kind = kind;// 인스턴스 변수를 가리킴
	}

	Card(String kind, int number) {
		this.kind = kind;
		this.number = number;
	}

	@Override
	public String toString() {// 객체참조변수호출하면 return으로 응답
		String str = kind + number;
		return str;
	}
}
