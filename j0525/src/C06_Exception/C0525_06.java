package C06_Exception;

public class C0525_06 {

	public static void main(String[] args) {
		System.out.println(1);
		System.out.println(2);
		
		try {// 예외가 일어날 부분
			System.out.println(3);
			System.out.println(0/0);// 예외발생! 아래 생략하고 catch로 건너뜀
			System.out.println(4);
		} catch (Exception e) {// 예외일 때
			System.out.println(5);
		}

		System.out.println(6);

	}

}
