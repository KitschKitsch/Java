package j0524;

public class Singleton {

	private static int num;

	// 같은 클래스 내에서만 (private)
	private static Singleton s = new Singleton();// 객체선언없이도(static) 사용할 수 있는 s

	private Singleton() {// 기본생성자
		num = 10;
	}

	// 클래스메소드 - 리턴타입:Singleton클래스, 메소드명:getInstance
	static Singleton getInstance() {
		if (s == null) {
			s = new Singleton();// s가 실행안되면, 객체선언 다시
		}
		return s;
	}
	
	// get
	public static int getNum() {
		return num;
	}
	
	// set
	public static void setNum(int num) {
		Singleton.num = num;
	}

	
}
