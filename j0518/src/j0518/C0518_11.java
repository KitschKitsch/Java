package j0518;

public class C0518_11 {

	public static void main(String[] args) {
		// println 오버로딩
		int a = 10;
		double b = 20.5;
		char ch = 'a';
		String str = "안녕하세요.";

		// 메소드 이름 중복이 허용되야하는 이유..! (오버로딩)
//		System.out.println_int(a);
//		System.out.println_double(b);
//		System.out.println_char(ch);
//		System.out.println_string(str);

		// 이름은 같아도 되는데~ 매개변수의 '개.수.' or '타.입.(타입순서 O)'은 달라야대!
		System.out.println(a);
		System.out.println(b);
		System.out.println(ch);
		System.out.println(str);
	}

}
