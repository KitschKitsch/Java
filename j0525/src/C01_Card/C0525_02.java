package C01_Card;

import java.util.ArrayList;

public class C0525_02 {

	public static void main(String[] args) {
		ArrayList<Card> list = new ArrayList<>();

		// Q1. 번호 1~13까지
		// Card c1 = new Card(Card.kinds[0], 1);
		// list.add(c1);// 두줄짜리를
		// list.add(new Card(Card.kinds[0], 1));// 한줄로!

//		for (int i = 0; i < 13; i++) {
//			list.add(new Card(Card.kinds[0], i + 1));
//		}
//
//		for (int i = 0; i < 13; i++) {
//			System.out.print(list.get(i).kind + Card.numbers[list.get(i).number] + " ");
//		}

		// Q2. 종류 4가지
//		for (int i = 0; i < Card.kinds.length; i++) {
//			list.add(new Card(Card.kinds[i], 1));
//		}
//
//		for (int i = 0; i < list.size(); i++) {
//			System.out.print(list.get(i).kind + list.get(i).number + " ");
//		}

		// Q3. 카드 52장 (4종류*13장씩)
		for (int i = 0; i < 52; i++) {
			list.add(new Card(Card.kinds[i / 13], (i % 13) + 1));
		}

		for (int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i).kind + list.get(i).number + " ");
		}

	}

}
