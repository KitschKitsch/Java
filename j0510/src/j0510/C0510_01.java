package j0510;

import java.util.Scanner;

public class C0510_01 {

	public static void main(String[] args) {
		
		// 입력한 문자를 출력하는 프로그램
		// 1.변수선언 2.scan입력 3.출력		
		Scanner scan = new Scanner(System.in);
		
		char input = ' ';
		
		System.out.println("문자를 입력하세요.");
		input = scan.next().charAt(0);
		
		System.out.println("결과값: " +input);
		
		
		// 입력한 글자가 영문자인지 파악하는 프로그램
		// 1.변수선언 2.scan입력 3.비교 4.출력
		char input2 = ' ';
		
		System.out.println("글자를 입력하세요.");
		input2 = scan.next().charAt(0);
		
		String answer = ((input2>='a' && input2<='z')||(input2>='A' && input2<='Z'))? "영문자입니다." : "영문자가 아닙니다.";
		
		System.out.println(answer);
		
		
		// 정수에 1을 더하는 프로그램
		int i = 1;
		// i = i + 1;
		// i += 1;
		i++;
		System.out.println(i);
	}

}