package j0523;

public class Deck {

	// 카드생성(배열선언)
	Card[] c = new Card[52];// 4*13

	Deck() {// 기본생성자
		// kind = null; num = 0;
		// Spade: 1~13, Heart:1~13, Diamond:1~13, CLover:1~13
		for (int i = 0; i < 52; i++) {
			c[i] = new Card();// 객체선언
			c[i].kind = c[i].kinds[i / 13];// 0,1,2,3
			c[i].number = (i % 13) + 1;// 1~13 4번 반복
		}
	}

	// 카드뽑기
	Card pick(int index) {// 인스턴스메소드. 0~51
		return c[index];
	}

	// 카드섞기
	void shuffle() {// 인스턴스메소드
		for (int i = 0; i < 1000; i++) {
			int random = (int) (Math.random() * 51);// 0~51 난수

			// Card c = new Card();
			Card temp = null;// 객체에 대한 임시변수!
			temp = c[0];
			c[0] = c[random];
			c[random] = temp;
		}
	}

}
