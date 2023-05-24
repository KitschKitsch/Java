package j0524;

public class C0524_01 {

	public static void main(String[] args) {
		// Singleton ss = new Singleton();// 객체선언안됨..!(private)
		Singleton ss = Singleton.getInstance();
		
		System.out.println(Singleton.getNum());

	}

}
