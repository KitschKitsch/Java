package j0509_;

import java.util.Scanner;

public class Class0509_10 {

	public static void main(String[] args) {
		/*
		double pi = 3.141592;
		double result = (int)(pi*1000)/1000.0;
		System.out.println(result);
		*/
		
		
		// double num = 564.124586 소수점 3자리부터 절사, 2자리까지만 출력
		double num = 564.124586;
		double result = (int)(num*100)/100.0;
		System.out.println(result);
		
		
		// 실수(소수점7자리)를 입력받아 소수점 4자리까지만 출력하시오.
		double input = 0.0;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("실수(소수점7자리)를 입력하세요.");
		input = scan.nextDouble();
		
		double result2 = (int)(input*10000)/10000.0;
		System.out.println("반환된 값: " +result2);
		
	}

}
