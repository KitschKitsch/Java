package j0518;

import java.util.Scanner;

public class C0518_06 {

	public static void main(String[] args) {
		// 국어,영어,수학 점수를 입력받아 평군 90점 이상 A, 80 B, 70 C, 60 D, F를 출력하시오.

		Scanner scan = new Scanner(System.in);

		System.out.println("국어점수>> ");
		int kor = scan.nextInt();
		System.out.println("영어점수>> ");
		int eng = scan.nextInt();
		System.out.println("수학점수>> ");
		int math = scan.nextInt();

		double avg = (kor + eng + math) / 3.0;

		if (avg >= 90) {
			System.out.print("A");
			if (avg >= 97) {
				System.out.println("+");
			} else if (avg <= 93) {
				System.out.println("-");
			}
		} else if (avg >= 80) {
			System.out.print("B");
			if (avg >= 87) {
				System.out.println("+");
			} else if (avg <= 83) {
				System.out.println("-");
			}
		} else if (avg >= 70) {
			System.out.print("C");
			if (avg >= 77) {
				System.out.println("+");
			} else if (avg <= 73) {
				System.out.println("-");
			}
		} else if (avg >= 60) {
			System.out.print("D");
			if (avg >= 67) {
				System.out.println("+");
			} else if (avg <= 63) {
				System.out.println("-");
			}
		} else {
			System.out.print("F");
		}
		
		

	}

}
