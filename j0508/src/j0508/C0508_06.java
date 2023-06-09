package j0508;

public class C0508_06 {

	public static void main(String[] args) {
		// 형변환
		// 기본형 - 8가지
		// 논리형 1바이트 - boolean
		// 문자형 2바이트 - char
		// 정수형 1바이트 - byte, 2바이트 - short, 4바이트 - int, 8바이트 - long
		// 실수형 4바이트 - float, 8바이트 - double
		// 문자열 - String
		
		float f = 1.6f;
		int i = (int)f; // 강제 형 변환 1.6 => 1 // 큰 놈은 작은 놈에 잘안들어감;
		System.out.println(i);
		
		int num = 10;
		double d = num; // 자동 형 변환 10 => 10.0
		System.out.println(d);
		
		// String > double > float > long > int > char/byte/short
		
		char ch = 'A'; // ASCII 65
		int n = ch;
		System.out.println(n);
		
		int n2 = 65+32; // ASCII 97 = a
		char ch2 = (char)n2; // 큰 놈은 작은 놈에 잘안들어감;
		System.out.println(ch2);	
	}

}