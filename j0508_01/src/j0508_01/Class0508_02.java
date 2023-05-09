package j0508_home;

public class Class0508_02_home {

	public static void main(String[] args) {
		
		boolean power = true;
		System.out.println(power);

		char ch = 'A';
		int num = 1+ch; // 가능! A = ASCII 코드 65
		System.out.println(ch);
		System.out.println(num);
		
		char ch2 = 65; // A = ASCII 코드 65
		System.out.println(ch2);

		char ch3 = '\u0041'; // 16진수 A 
		System.out.println(ch3);

		char tab = '\t';
		System.out.println(tab);

		System.out.println(""+tab+ch2);
		System.out.println(""+ch+num); // 문자열로 같이 출력할꺼야!

		byte b = 127;
		short s = 32767;
		int i = 100;
		int oct = 0100; // 8진수
		int hex = 0x100; // 16진수
		
		long l = 10000000000L;
		float f = 3.14f;
		double d = 3.14;
		float f2 = 100f; // 자동 소수점
		System.out.println(f2);
	}

}
