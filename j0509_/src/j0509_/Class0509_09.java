package j0509_;

import java.util.Scanner;

public class Class0509_09 {

	public static void main(String[] args) {
		// 1개의 문자열(숫자)을 입력받아 숫자로 변환하시오.
		// "15784" -> 숫자
		char ch = ' ';
		
		System.out.println("문자열(숫자)을 입력하세요.");
		Scanner scan = new Scanner(System.in);
		char input = scan.next().charAt(3); // charAt(): 문자열에서 1개의 문자를 가져옴.
		
		int result = input - '0'; // 1 		*cf. char -'0' = int
		String content = (result%2==0)? "짝수" : "홀수";
		
		System.out.println("추출한 숫자: " +result);
		System.out.println(content);
		
	}

}
