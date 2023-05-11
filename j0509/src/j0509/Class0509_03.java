package j0509;

import java.util.Scanner;

public class Class0509_03 {

	public static void main(String[] args) {
		double kor = 0;
		int eng = 0;
		int math = 0;
		String name = "홍길동";
		
		// 데이터 입력 Scanner 객체 - new로 화면(System.in)에서 입력 받음
		Scanner scan = new Scanner(System.in);
				// String str = new String("abc"); == String str = "abc";
		System.out.println("이름을 입력하세요");
		name = scan.next(); // *cf. next(): 띄어쓰기 X, nextLine(): 띄어쓰기 O
		
		System.out.println("국어점수를 입력하세요");
		kor = scan.nextDouble();
		
		System.out.println("영어점수를 입력하세요");
		eng = scan.nextInt();
		
		System.out.println("수학점수를 입력하세요");
		math = scan.nextInt();
		
		double total = kor+eng+math;
		double avg = total/3.0;
		
		System.out.println("==================================================");
		System.out.println("이름 \t 국어 \t 영어 \t 수학 \t 합계 \t 평균");
		System.out.println("==================================================");
		System.out.printf("%s \t %f \t %d \t %d \t %f \t %.2f \n" , name, kor, eng, math, total, avg);
	}

}