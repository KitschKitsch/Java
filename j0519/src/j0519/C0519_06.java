package j0519;

public class C0519_06 {

	public static void main(String[] args) {

		String no = "1";
		String title = "홈페이지 오픈";
		String date = "2023-05-19";
		String name = "홍길동";

		// 객체선언: 클래스명 참조변수명 = new 기본생성자;
		Board b = new Board();
		String[] saveBoard = b.save(no, title, date, name);
		
		for (int i=0; i<saveBoard.length; i++) {
			System.out.print(saveBoard[i] + " ");
		}
		

	}

}
