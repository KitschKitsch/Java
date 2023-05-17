package j0509;

import java.util.Scanner;

public class C0509_04 {

	public static void main(String[] args) {
		// 아이디, 패스워드, 이름을 입력받아 출력하시오.(각각 문자열, 정수형, 문자열)
		// ---------------------------
		// 아이디		패스워드		이름
		// ---------------------------
		// abcd		1111		홍길동

		// 1. 변수 선언
		String id = "";
		String pw = ""; // 앞자리 0을 넣고 싶다면 문자열로!
		String name = "";
		
		// 2. 스캐너 객체 만들기 (콘솔-System에서 입력-in)
		Scanner scan = new Scanner(System.in);
		
		// 3. id, pw, name 입력 받기
		System.out.println("아이디를 입력하세요");
		id = scan.nextLine();
		
		System.out.println("패스워드를 입력하세요");
		pw = scan.nextLine();
				// scan.nextLine(); // nextInt()일 때의 enter키를 처리! 

		System.out.println("이름을 입력하세요");
		name = scan.nextLine();
		
		// 4. 출력
		System.out.println("---------------------------");		
		System.out.println("아이디 \t 패스워드 \t 이름");
		System.out.println("---------------------------");
		System.out.printf("%s \t %s \t %s \n", id, pw, name);
	}

}