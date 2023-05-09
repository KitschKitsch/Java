package j0509_;

public class Class0509_01 {

	public static void main(String[] args) {
		// 변수 8가지
		// 논리형 - boolean
		// 문자형 - char
		// 정수형 - byte, short, int, long
		// 실수형 - float, double
		// 문자열(객체) - String
		char ch = ' '; // A = 65, a = 97, 0 = 48
		int num = (int)3.14;
		// Ctrl + D : 한 줄 삭제
		int num1 = 1, num2 = 2, num3 = 3, num4 = 4, num5 = 5;
		int num6 = 6, num7 = 7, num8 = 8, num9 = 9, num10 = 10;
		
		System.out.printf("더하기 결과값: %d \n",num+num2);
		System.out.printf("나누기 결과값: %.1f \n", num/(double)num2);
				
		System.out.print("더하기 결과값: " + (num+num2) + "\n");
		System.out.println(num-num2);
		System.out.println(num*num2);
		System.out.println(num/(double)num2);
		System.out.println(7+5);
		System.out.println(7-5);
		System.out.println(7*5);
		System.out.println(7/5);
	}

}
