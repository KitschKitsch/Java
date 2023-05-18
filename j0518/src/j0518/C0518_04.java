package j0518;

import java.util.Scanner;

public class C0518_04 {

	public static void main(String[] args) {
		
		// 알파벳을 입력받아 대소문자로 변환하시오.
		
		Scanner scan = new Scanner(System.in);
		
		// A-65, Z-96, a-97
		System.out.println("알파벳을 입력하세요.>> ");
		char ch = scan.next().charAt(0);
		
		// 대소문자 비교
		if (ch<=96) {
			ch = (char)(ch+32);
		} else {
			ch = (char)(ch-32);
		}
		System.out.println(ch);
		
				

	}

}
