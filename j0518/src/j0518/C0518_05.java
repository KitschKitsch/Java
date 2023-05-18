package j0518;

import java.util.Scanner;

public class C0518_05 {

	public static void main(String[] args) {
		// 숫자를 입력받아 양수, 음수 확인

		Scanner scan = new Scanner(System.in);

		int num = 0;

		System.out.println("숫자를 입력하세요.>> ");
		num = scan.nextInt();

		if (num >= 0) {
			System.out.println("양수입니다.");
		} else {
			System.out.println("음수입니다.");
		}

		// 국어,영어,수학 점수를 입력받아 평균 60점 이상이면 합격, 불합격 출력
		System.out.println("국어점수>> ");
		int kor = scan.nextInt();
		System.out.println("영어점수>> ");
		int eng = scan.nextInt();
		System.out.println("수학점수>> ");
		int math = scan.nextInt();

		double avg = (kor + eng + math) / 3.0;
		if (avg >= 60) {
			System.out.println("합격");
		} else {
			System.out.println("불합격");
		}

	}

}
