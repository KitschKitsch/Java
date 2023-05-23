package j0523;

public class C0523_01 {

	public static void main(String[] args) {

		// 객체선언
		Deck d = new Deck();

		for (int i = 0; i < d.c.length; i++) {
			System.out.printf("%s%d \n", d.c[i].kind, d.c[i].number);
		}

//		// 구구단
//		for (int i = 1; i < 10; i++) {
//			for (int j = 1; j < 10; j++) {
//				System.out.print(j + "*" + i + "=" + j * i + "\t");
//			}
//			System.out.println();
//		}// for

	}// main

}
