package j0522;

public class C0522_07 {

	// C0522_07() {}; 기본생성자 자동생성

	int x;
	int y = x;
	char ch;
	String str;
	
	public static void main(String[] args) {
		int a = 0;// 지역변수는 초기화(초기값 세팅)
		int b = a;
		
		// x,y, a,b 출력
		C0522_07 c = new C0522_07();// 객체선언 후!
		System.out.println("< 인스턴스변수 >");
		System.out.print("x:" + c.x);// 참조변수명.변수명
		System.out.print("\ty:" + c.y);
		System.out.print("\tch: " + c.ch);// 공백
		System.out.println("\tstr: " + c.str); // 공백
		
		
		System.out.println("< 지역변수 >");
		System.out.print("a:" + a);
		System.out.println("\tb:" + b);
	}

}
