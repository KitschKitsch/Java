package j0523;

//import java.util.Date;
//import java.util.Scanner;
import java.util.*;// java.util(패키지)의 모든 클래스!

public class C0523_03 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Date today = new Date();

		Card c = new Card("Spade", 1);

		Card c2 = null;
		Deck d1 = new Deck();
		c2 = c;// 같은 타입
		// c2 = d1; // 타입달라서 X

		Object o = null;
		o = d1;// 조상과 자손관계 성립!

		int a = 5;
		String str = null;
		// str = a;// 타입달라서 X

		System.out.println(c);

	}// main

	static void add() {

	}

	static void add(int x) {// 오버로딩: 이름만 같게!
	}

}
