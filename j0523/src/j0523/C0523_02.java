package j0523;

public class C0523_02 {

	public static void main(String[] args) {

		// 객체선언
		Deck d = new Deck();

		// 카드섞기
		d.shuffle();

		// 카드뽑기
		// System.out.println(d.pick(49).kind + d.pick(49).number);

		// 출력
		for (int i = 0; i < d.c.length; i++) {
			System.out.println(d.c[i].kind + Card.numbers[d.c[i].number]);
		}
		
		System.out.println();
		
		for (int i = 0; i < d.c.length; i++) {
			System.out.println(d.c[i]);// toString으로 가능!!!
		}

	}

}
