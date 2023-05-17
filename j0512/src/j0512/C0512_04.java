package j0512;

import java.util.Scanner;

public class C0512_04 {
	
	public static void main(String[] args) {
		// 숫자를 입력받아 십진코드와 이진코드를 출력하는 프로그램
		
		Scanner scan = new Scanner(System.in);
		
		// 1)배열선언 - 2진코드배열, 입력배열
		String[] binary = {"0000", "0001", "0010", "0011", "0100",
						   "0101", "0110", "0111", "1000", "1001"};//0~9의 이진코드 배열
		int[] num = new int[4];//10진수 입력받을 배열. 일단 4자리만!
		
		// 2)숫자입력
		for (int i=0; i<num.length; i++) {
			System.out.println("번호를 입력하세요.>> ");
			num[i] = scan.nextInt();
		}
		
		// 3)십진코드 출력
		System.out.print("십진코드: ");
		for (int i=0; i<num.length; i++) {
			System.out.print(num[i] +" ");
		}
		System.out.println();
		
		// 4)이진코드 출력
		System.out.print("이진코드: ");
		for (int i=0; i<num.length; i++) {
			System.out.print(binary[num[i]] +" ");
		}
	}

}
