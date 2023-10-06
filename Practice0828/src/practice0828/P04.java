package practice0828;

import java.util.Arrays;
import java.util.Scanner;

public class P04 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		// Q1. 입력받은 숫자를 오름차순으로 출력
		System.out.println("Q1. 입력받은 숫자를 오름차순으로 출력");

		int[] arr = new int[3];

		for (int i = 0; i < arr.length; i++) {
			System.out.println(i + "번째 숫자를 입력하세요.");
			arr[i] = scan.nextInt();
		}

		// 메서드 호출
		// P04.calculate(arr); // 같은 클래스라 클래스명 생략 가능
		calculate(arr);
		System.out.println("------------------------------");

		// Q2. 기본형 매개변수 & 참조형 매개변수
		System.out.println("Q2. 기본형 매개변수 & 참조형 매개변수");
		A a = new A();

		int m = 5;
		int[] n = { 1, 2, 3 };

		a.abc(m);
		a.bcd(n);

		System.out.println(m);
		System.out.println(Arrays.toString(n));
		System.out.println("------------------------------");

		// Q3. 가변길이 자료형 메서드
		System.out.println("Q3. 가변길이 자료형 메서드");
		a.averageScore(1);
		a.averageScore(0, 5);
		a.averageScore(1, 2, 3);
		a.averageScore(1, 2, 3, 4);
		System.out.println("------------------------------");

	}// main

	// 1. 클래스 메서드(스태틱 메서드. 객체선언X)
	static void calculate(int[] arr) {
		int max = Math.max(Math.max(arr[0], arr[1]), arr[2]);
		int min = Math.min(Math.min(arr[0], arr[1]), arr[2]);
		int middle = (arr[0] + arr[1] + arr[2]) - max - min;
		System.out.println("최소값: " + min);
		System.out.println("중간값: " + middle);
		System.out.println("최대값: " + max);
	}

}

class A {
	// 2.
	void abc(int m) {
		System.out.println("처음 받을 때: " + m);
		m = 8;
		System.out.println("초기화 후: " + m);
	}

	void bcd(int[] n) {
		System.out.println("처음 받을 때: " + Arrays.toString(n));
		n[0] = 4;
		n[1] = 5;
		n[2] = 6;
		System.out.println("초기화 후: " + Arrays.toString(n));
	}

	// 3.
	void averageScore(int... scores) {
		int sum = 0;
		for (int k : scores) {
			sum = sum + k;
		}
		double avg = (double)sum / scores.length;
		System.out.println(avg);
	}
}
