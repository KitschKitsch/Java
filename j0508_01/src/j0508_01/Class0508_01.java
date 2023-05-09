package j0508_01;

public class Class0508_01 {
	
	public static void main(String[] args) {
		
		boolean temp = true;
		boolean temp2 = false;
		boolean temp3;
		temp3 = true;
		
		char ch1 = ' '; // 홑따옴표로! 빈값은 공백으로!(공백없으면 에러)
		char ch2 = 'a';
		char ch3 = 'A';
		char ch4 = 't';
		// char ch5 = ""; // 쌍따옴표, 공백없음 불가
		
		byte num1 = 1;
		// byte num3 = 256; // byte는 127까지 숫자표현 가능
		short num2 = 10;
		// short num4 = 32768; // 32767까지 숫자표현 가능
		
		int num5 = 21;
		// int num6 = 2147483648; // 2147483647까지 숫자표현 가능
		long num7 = 21;
		long num8 = 2147483648L; // 접미사 L,l을 뒤에 붙여서 int와 구분해야함!
		
		float num9 = 9.87654321F; // 접미사 F,f를 붙여서 double과 구분해야함!
		float num10 = 987.654321F; // 실수형 8자리까지 정밀도 표현 가능
		
		double num11 = 1.123456789012345; // 실수형 16자리까지 정밀도 표현 가능
		
		
		// 문자열 - Class일때 대문자 표현
		String str1 = new String("abc");
		String str2 = "abc"; // 기본형 타입으로 선언 可
		char str3 = ' '; // 홑따옴표, 공백 있어야 함
		String str4 = ""; // 쌍따옴표, 공백 없어도 됨
		
		// 변수
		int score = 100;
		score = score + 200; // score 300이라는 값 들어감.
		
		// 상수(final, 대문자)
		final int SCO = 100;
		// SCO = 200; // 상수는 값 변경 불가
		
	}

}
