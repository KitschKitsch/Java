package j0517;

import java.util.Scanner;

public class C0517_08 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		// 3개의 숫자를 입력받아 작은수부터 순차적으로 출력하시오.
		// calculate() 메소드 활용
 
		C0517_08 c = new C0517_08();
		int[] num = new int[3];
		int[] arr = new int[3];

		for (int i = 0; i < 3; i++) {
			System.out.println((i + 1) + "숫자를 입력하세요.");
			num[i] = scan.nextInt();
		}

		calculate(arr, num[0], num[1], num[2]);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

	}

	static void calculate(int arr[], int a, int b, int c) {
		arr[2] = Math.max(Math.max(a, b), c);
		arr[0] = Math.min(Math.min(a, b), c);
		if (arr[0] != a && arr[2] != a) {
			arr[1] = a;
		} else if (arr[0] != b && arr[2] != b) {
			arr[1] = b;
		} else if (arr[0] != c && arr[2] != c) {
			arr[1] = c;
		}
	}

}
