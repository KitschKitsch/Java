package j0512;

import java.util.Scanner;

public class C0512_05 {

	public static void main(String[] args) {
		// 10진수를 2진수로 변환해주는 프로그램
		
		Scanner scan = new Scanner(System.in);
		
		// 1)배열선언
		String[] binary = {"0000","0001","0010","0011","0100",
					  	   "0101","0110","0111","1000","1001"};
		int[] num = new int[5];
		
		// 2)숫자입력
		for (int i=0; i<num.length; i++) {
			System.out.println("숫자를 입력하세요.>> ");
			num[i] = scan.nextInt();
		}
		
		// 3)이진코드출력
		System.out.print("이진코드: ");
		for (int i=0; i<num.length; i++) {
			System.out.print(binary[num[i]] +" ");
		}
	}

}
