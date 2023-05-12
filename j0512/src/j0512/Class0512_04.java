package j0512;

import java.util.Scanner;

public class Class0512_04 {

	public static void main(String[] args) {
		// 10진수를 2진수로 변경하는 프로그램
		Scanner scan = new Scanner(System.in);
		
		String[] binary = {"0000", "0001", "0010", "0011",
						   "0100", "0101", "0110", "0111",
						   "1000", "1001"};
		
		int[] num = new int[4];
		
		// 1개씩 받기
		// 1025 - 0001 0000 0010 0101
		for (int i=0; i<num.length; i++) {
			System.out.println("번호를 입력하세요.>> ");
			num[i] = scan.nextInt();
		}
		
		// 10진코드 출력
		System.out.print("10진코드: ");
		for (int i=0; i<num.length; i++) {
			System.out.print(num[i] +" ");
		}
		System.out.println();
		
		// 2진코드로 번호출력
		System.out.print("2진코드: ");
		for (int i=0; i<num.length; i++) {
			System.out.print(binary[num[i]] +" ");
		}
		System.out.println();
	}

}
