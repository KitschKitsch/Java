package j0509_;

import java.util.Scanner;

public class Class0509_12 {

	public static void main(String[] args) {
		// 영문 소문자인지 비교
		char ch = ' ';
		
		System.out.println("문자를 입력하세요.");
		Scanner scan = new Scanner(System.in);
		ch = scan.next().charAt(0);
		
		String result = (ch>='A' && ch<='Z')||(ch>='a' && ch<='z')? "영문자입니다." : "영문자가 아닙니다.";
		System.out.println(result);
	}

}
