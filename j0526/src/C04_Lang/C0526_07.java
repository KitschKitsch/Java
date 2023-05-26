package C04_Lang;

import java.util.Scanner;

public class C0526_07 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("찾을 문자 입력>> ");
		String search = scan.next();
		String str1 = "홍길동 홍길순 홍길자 이순신 강감찬 유관순 김구 김유신";

		// contains - 문자열 내에 문자가 있는지 확인
//		if (str1.contains(search)) {
//			System.out.println(search + "(이)라는 글자가 있습니다.");
//		} else {
//			System.out.println(search + "(이)라는 글자가 없습니다.");
//		}

		String str2 = "https://semiconductor.samsung.com/kr/dram/ddr.jsp";
		String str3 = "https://semiconductor.samsung.com/kr/foundry/process-technology.jsp";

		// endWith - 해당 문자로 끝나는지 확인
		if (str2.endsWith(search)) {
			System.out.println(search + " 로 끝납니다.");
		} else {
			System.out.println(search + "로 끝나니 않습니다.");
		}

	}

}
