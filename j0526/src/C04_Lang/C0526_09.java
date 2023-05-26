package C04_Lang;

import java.util.Arrays;
import java.util.Scanner;

public class C0526_09 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		String str = "     aaa aaa aaa    ";
		String str2 = "bbb,bbb,bbb,bbb";
		System.out.println("현재 str: " + str);
		System.out.println("현재 str2:" + str2);
		System.out.println();

		String result = str.trim();// 앞뒤공백제거
		System.out.println("공백제거 후 str: " + result);

		String result2 = str2.replace("bbb", "abc");// 문자변경
		System.out.println("문자변경 후 str2: " + result2);

		String result3 = str2.replace(",", " ");
		System.out.println("띄어쓰기 제거 후 str2: " + result3);

		String result4 = (str.trim()).replace(" ", "");// replace만 써도됨!
		System.out.println("공백&띄어쓰기 제거 후 str: " + result4);

		String[] result5 = str2.split(",");// '배열'에 분할해서 저장
		System.out.println("분할 후 str2: " + Arrays.toString(result5));// 배열내용 한번에 출력
	}

}
