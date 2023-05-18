package j0517;

public class C0517_01 {

	public static void main(String[] args) {

		// 객체선언
		Card c1 = new Card();
		// 인스턴스변수 사용법: 참조변수명.변수명
		c1.kind = "♥";
		c1.number = 7;
		c1.width = 500;// c1만 바꿨는데 c2, c3까지 바뀜(static은 공용!)
		c1.number = 25;// c1만 바뀜

		Card c2 = new Card();
		c2.kind = "♠";
		c2.number = 4;

		Card c3 = new Card();

		System.out.println("c1 카드종류: " + c1.kind);
		System.out.println("c1 카드숫자: " + c1.number);
		System.out.println("c1 가로길이: " + Card.width);// 클래스변수(스태틱변수는 클래스명.변수명으로 써줘야 안헷갈림!)
		System.out.println("c1 세로길이: " + Card.height);
		System.out.println("---------------------");
		System.out.println("c2 카드종류: " + c2.kind);
		System.out.println("c2 카드숫자: " + c2.number);
		System.out.println("c2 가로길이: " + c2.width);// 이렇게 써도 되긴 하는데 헷갈림;;;
		System.out.println("c2 세로길이: " + c2.height);
		System.out.println("---------------------");
		System.out.println("c3 가로길이: " + Card.width);
	}

}
