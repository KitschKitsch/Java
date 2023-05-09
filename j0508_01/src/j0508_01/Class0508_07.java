package j0508_01;

public class Class0508_07 {

	public static void main(String[] args) {
		// printf, println, print
		System.out.println(10/3.0);
		// printf - \n 으로 단락, \t 탭 나눔
		System.out.printf("%.2f \n", 10/3.0); // 소수점 3째자리까지 표현
		System.out.printf("%09d \n", 1000); // 빈자리를 0/공백으로 채움
		System.out.printf("%x \n", 16); // 16진수
		System.out.printf("%o \n", 9); // 8진수
		
		System.out.printf("당신의 나이: %d 세, 생년월일: %d 년 \n", 25, 1999);
		System.out.println("당신의 나이: " +25+ " 세, 생년월일: " +1999+ " 년");
	}

}
