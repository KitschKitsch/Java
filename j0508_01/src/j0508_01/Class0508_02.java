package j0508_01;

public class Class0508_02 {
	
	public static void main(String[] args) {
		boolean power = true;
		// int num = 1;
		// int num2 = 1+ch; // 가능..?!
		char ch = 'A';
		char ch2 = 65; // A = ASCII 코드 65
		char ch3 = '\u0041'; // 16진수 
		char tab = '\t';
		byte b = 127;
		short s = 32767;
		int i = 100;
		int oct = 0100; // 8진수
		int hex = 0x100; // 16진수
		
		long l = 10000000000L;
		float f = 3.14f;
		double d = 3.14;
		float f2 = 100f; // 자동 소수점
		
		// System.out.println(power);
		// System.out.println(num2);
		// System.out.println(ch);
		System.out.println(ch2);
		// System.out.println(ch3);
		// System.out.println(tab);
		System.out.println(""+tab+ch2);
		// System.out.println(""+ch+num); // 문자열로 같이 출력할꺼야!
		System.out.println(f2);
		
	}// main

}// class
