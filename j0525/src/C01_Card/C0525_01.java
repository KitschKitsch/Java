package C01_Card;

import java.util.ArrayList;

public class C0525_01 {

	public static void main(String[] args) {

		Card c1 = new Card(Card.kinds[0], 1);
		Card c2 = new Card(Card.kinds[1], 2);
		Card c3 = new Card(Card.kinds[2], 3);
		Card c4 = new Card(Card.kinds[3], 4);

		Card[] c = new Card[3];
		c[0] = c1;
		c[1] = c2;
		c[2] = c3;
		// c[3] = c4; // 배열의 한계: 배열개수 넘어가면 에러..!

		// ArrayList list = new ArrayList<>();
		ArrayList<Card> list = new ArrayList<>();// 지네릭스로 미리 형변환!
		list.add(c1); // Object o = new Card(Card.kinds[1],1);
		list.add(c2);
		list.add(c3);
		list.add(c4);

		// 출력
		System.out.println(c1.kind + c1.number);
		// Card card = (Card) list.get(0);// 형변환! 빈공간을 Card 변수들로 채움
		// System.out.println(card.kind + card.number);
		System.out.println(list.get(0).kind + list.get(0).number);

		for (int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i).kind + list.get(i).number + " ");
		}
		System.out.println();
		System.out.println("개수: " + list.size());

		// Q1. kind - Heart를 삭제
		System.out.println("--------------------");
		// list.remove(); // 삭제: 뒤 요소들을 앞으로 당겨옴
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).kind.equals("♥"))// 모양이 "♥"이면
				list.remove(i);// 삭제
		}
		for (int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i).kind + list.get(i).number + " ");
		}
		System.out.println();

		// Q2. number - 4를 삭제
		System.out.println("--------------------");
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).number == 4)// 숫자가 4이면
				list.remove(i);// 삭제
		}
		for (int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i).kind + list.get(i).number + " ");
		}
		System.out.println();
		System.out.println("프로그램 종료");

	}

}
